   Lien Github : 
   
   
    Explication des dépendances : 
    
    Thymeleaf permet de produire des vues Web et de fournir un support pour générer divers documents (HTML, XHTML, Javascript, CSS ou autre deucoment au format texte)

    Spring Data JPA permet de simplifier l'accès à la couche des données

    Spring Web est le module d'intégration de base pour la création d'une application web.

    H2 Database est un module proposeant des interfaces de programmation SQL et JBDC. Il permet de gérer une base de données relationnelle Java

    Spring Boot DevTools permet la mise à jour à distance

    Hibernate permet de représenter une BDD en objets Java et inversement


  1. Avec quelle partie du code avons-nous paramétré l'url d'appel /greeting ?
  L'URL d'appel /greeting est paramétré par le @GetMapping("/greeting")

  2. Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?
  La partie du code avec laquelle nous avons choisi le fichier HTML à afficher est le "return "greeting""

  3. Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?
  Nous envoyons le nom à qui nous disons bonjour en modifiant l'attribut nameGET dans le changement d'URL, ce qui affecte le HelloWorldController qui dira à greeting d'utiliser ce nom. Plus précisément : "model.addAttribute("nomTemplate", nameGET)"

  4. Relancez-votre application, retournez sur la console de H2 : http://localhost:8080/h2-console. Avez-vous remarqué une différence ? Ajoutez la réponse dans le README.
  Une table ADDRESS avec les attributs ID, CONTENT et CREATION a été ajouté à notre base de données.

  5. Expliquez l'apparition de la nouvelle table en vous aidant de vos cours sur Hibernate, et de la dépendance Hibernate de Spring. Ajoutez la réponse dans le README.
  En créant une classe dans model avec @Entity et avec l'intégration Spring Boot, Java génère la table correspondante.

  6. Relancez l'application, retournez sur la console H2 : http://localhost:8080/h2-console.
  Faites une requête de type SELECT sur la table Adress. Voyez-vous tout le contenu de data.sql ? Ajoutez la réponse dans le README.
  Oui, la requête retourne bien tout le contenu ajouté.

  7. Pouvez-vous trouver à quoi sert l'annotation @Autowired du code précèdent sur internet ? Ajoutez la réponse dans le README.
  @Autowired permet d'activer l'injection automatique de dépendance afin d'associer automatiquement les beans dans les paramètres d'AddressRepository

  8. Faut-il une clé API pour appeler MeteoConcept ?
  Oui, elle est appelée token dans le code.

  9. Quelle URL appeler ?
  Cette url, token étant notre clé API "https://api.meteo-concept.com/api/forecast/daily/0"+token+"&latlng="+latitude+","+longitude et latitude et longitude nos résultats d'API adresse.

  10. Quelle méthode HTTP utiliser ?
  On utilise la méthode GET afin d'obtenir les résultats de météo.

  11. Comment passer les paramètres d'appels ?
  On passe à l'URL nos paramètres d'appel en spécifiant dans celle-ci "&latlng=" et en ajoutant latitude et longitude séparés d'une virgule. Latitude et longitude ayant été récupéré précédemment grâce à l'API d'adresse.

  12. Où est l'information dont j'ai besoin dans la réponse : Pour afficher la température du lieu visé par les coordonnées GPS
  Dans la réponse, l'information pour afficher la température se trouve dans forecast qui contient lui-même tmin et tmax correspondant respectivement à la température minimale prévue et la température maximale prévue.

  13. Où est l'information dont j'ai besoin dans la réponse : Pour afficher la prévision de météo du lieu visé par les coordonnées GPS
  Dans la réponse, l'information pour afficher la prévision météo du lieu visé par les coordonnées GPS se trouve dans forecast qui contient lui-même weather correspondant à la prévision météo. Néanmoins, si par prévision météo, nous entendons tout les paramètres de la météo, alors l'objet forecast en entier est important car tout ses paramètres correspondent à une prévision météo.