package com.ensim.info.tp1.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.ensim.info.tp1.TP3.model.City;
import com.ensim.info.tp1.TP3.model.Feature;
import com.ensim.info.tp1.TP3.model.Forecast;
import com.ensim.info.tp1.TP3.model.MeteoResponse;
import com.ensim.info.tp1.TP3.model.ObjetReponse;
import com.ensim.info.tp1.TP3.model.Weather;


@Controller
public class MeteoController {
    private String token = "?token=381869ca30e7a87e69d7beda85d993dd91e646c204ec72f2c268a4b93ca426cc";

    @Autowired
    RestTemplate rt;
    
    @PostMapping("/meteo")
    public String postBody(@RequestBody String address, Model model) {

        address = address.replace("address=", "");

        String query = address.toLowerCase().replace(" ","+");

        System.out.println(query);

        ObjetReponse api = rt.getForObject("https://api-adresse.data.gouv.fr/search/?q="+ query + "&limit=1",ObjetReponse.class);
        if(api != null){
            Feature feature = api.features.get(0);
            Float longitude = feature.getGeometry().getCoordinates().get(0);
            Float latitude = feature.getGeometry().getCoordinates().get(1);
            
            System.out.println(latitude + " " + longitude);

            String meteo_url="https://api.meteo-concept.com/api/forecast/daily/0"+token+"&latlng="+latitude+","+longitude;

            HttpEntity<MeteoResponse> request = new HttpEntity<>(new MeteoResponse());
            ResponseEntity<MeteoResponse> http_response = rt.exchange(meteo_url, HttpMethod.GET, request, MeteoResponse.class);

            MeteoResponse response = http_response.getBody();

            if(response != null){
                City city = response.getCity();
                Forecast forecast = response.getForecast();

                String weather = Weather.getDescriptionByCode(forecast.getWeather());

                model.addAttribute("city", city.getName());
                model.addAttribute("weather", weather);
                model.addAttribute("tmin",forecast.getTmin());
                model.addAttribute("tmax",forecast.getTmax());
                model.addAttribute("probarain", forecast.getProbarain());
            }
        }
        return "meteo";
    }  
}
