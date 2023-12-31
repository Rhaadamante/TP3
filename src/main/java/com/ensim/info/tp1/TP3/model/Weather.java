package com.ensim.info.tp1.TP3.model;

public enum Weather {
    SOLEIL(0, "Soleil"),
    PEU_NUAGEUX(1, "Peu nuageux"),
    CIEL_VOILE(2, "Ciel voilé"),
    NUAGEUX(3, "Nuageux"),
    TRES_NUAGEUX(4, "Très nuageux"),
    COUVERT(5, "Couvert"),
    BROUILLARD(6, "Brouillard"),
    BROUILLARD_GIVRANT(7, "Brouillard givrant"),
    PLUIE_FAIBLE(10, "Pluie faible"),
    PLUIE_MODEREE(11, "Pluie modérée"),
    PLUIE_FORTE(12, "Pluie forte"),
    PLUIE_FAIBLE_VERGLACANTE(13, "Pluie faible verglaçante"),
    PLUIE_MODEREE_VERGLACANTE(14, "Pluie modérée verglaçante"),
    PLUIE_FORTE_VERGLACANTE(15, "Pluie forte verglaçante"),
    BRUINE(16, "Bruine"),
    NEIGE_FAIBLE(20, "Neige faible"),
    NEIGE_MODEREE(21, "Neige modérée"),
    NEIGE_FORTE(22, "Neige forte"),
    PLUIE_ET_NEIGE_MELEES_FAIBLES(30, "Pluie et neige mêlées faibles"),
    PLUIE_ET_NEIGE_MELEES_MODEREES(31, "Pluie et neige mêlées modérées"),
    PLUIE_ET_NEIGE_MELEES_FORTES(32, "Pluie et neige mêlées fortes"),
    AVERSE_DE_PLUIE_LOCALE_FAIBLE(40, "Averses de pluie locales et faibles"),
    AVERSE_DE_PLUIE_LOCALE(41, "Averses de pluie locales"),
    AVERSE_DE_PLUIE_LOCALE_FORTE(42, "Averses locales et fortes"),
    AVERSE_DE_PLUIE_FAIBLE(43, "Averses de pluie faibles"),
    AVERSE_DE_PLUIE(44, "Averses de pluie"),
    AVERSE_DE_PLUIE_FORTE(45, "Averses de pluie fortes"),
    AVERSE_DE_PLUIE_FAIBLE_ET_FREQUENTE(46, "Averses de pluie faibles et fréquentes"),
    AVERSE_DE_PLUIE_FREQUENTE(47, "Averses de pluie fréquentes"),
    AVERSE_DE_PLUIE_FORTE_ET_FREQUENTE(48, "Averses de pluie fortes et fréquentes"),
    AVERSE_DE_NEIGE_LOCALE_FAIBLE(60, "Averses de neige localisées et faibles"),
    AVERSE_DE_NEIGE_LOCALE(61, "Averses de neige localisées"),
    AVERSE_DE_NEIGE_LOCALE_FORTE(62, "Averses de neige localisées et fortes"),
    AVERSE_DE_NEIGE_FAIBLE(63, "Averses de neige faibles"),
    AVERSE_DE_NEIGE(64, "Averses de neige"),
    AVERSE_DE_NEIGE_FORTE(65, "Averses de neige fortes"),
    AVERSE_DE_NEIGE_FAIBLE_ET_FREQUENTE(66, "Averses de neige faibles et fréquentes"),
    AVERSE_DE_NEIGE_FREQUENTE(67, "Averses de neige fréquentes"),
    AVERSE_DE_NEIGE_FORTE_ET_FREQUENTE(68, "Averses de neige fortes et fréquentes"),
    AVERSE_DE_PLUIE_ET_NEIGE_MELEES_LOCALE_FAIBLE(70, "Averses de pluie et neige mêlées localisées et faibles"),
    AVERSE_DE_PLUIE_ET_NEIGE_MELEES_LOCALE(71, "Averses de pluie et neige mêlées localisées"),
    AVERSE_DE_PLUIE_ET_NEIGE_MELEES_LOCALE_FORTE(72, "Averses de pluie et neige mêlées localisées et fortes"),
    AVERSE_DE_PLUIE_ET_NEIGE_MELEES_FAIBLE(73, "Averses de pluie et neige mêlées faibles"),
    AVERSE_DE_PLUIE_ET_NEIGE_MELEES(74, "Averses de pluie et neige mêlées"),
    AVERSE_DE_PLUIE_ET_NEIGE_MELEES_FORTE(75, "Averses de pluie et neige mêlées fortes"),
    AVERSE_DE_PLUIE_ET_NEIGE_MELEES_FAIBLE_ET_NOMBREUSE(76, "Averses de pluie et neige mêlées faibles et nombreuses"),
    AVERSE_DE_PLUIE_ET_NEIGE_MELEES_FREQUENTE(77, "Averses de pluie et neige mêlées fréquentes"),
    AVERSE_DE_PLUIE_ET_NEIGE_MELEES_FORTE_ET_FREQUENTE(78, "Averses de pluie et neige mêlées fortes et fréquentes"),
    ORAGES_FAIBLES_ET_LOCAUX(100, "Orages faibles et locaux"),
    ORAGES_LOCAUX(101, "Orages locaux"),
    ORAGES_FORTS_ET_LOCAUX(102, "Orages fort et locaux"),
    ORAGES_FAIBLES(103, "Orages faibles"),
    ORAGES(104, "Orages"),
    ORAGES_FORTS(105, "Orages forts"),
    ORAGES_FAIBLES_ET_FREQUENTS(106, "Orages faibles et fréquents"),
    ORAGES_FREQUENTS(107, "Orages fréquents"),
    ORAGES_FORTS_ET_FREQUENTS(108, "Orages forts et fréquents"),
    ORAGES_FAIBLES_ET_LOCAUX_DE_NEIGE_OU_GRELE(120, "Orages faibles et locaux de neige ou grésil"),
    ORAGES_LOCAUX_DE_NEIGE_OU_GRELE(121, "Orages locaux de neige ou grésil"),
    ORAGES_FORTS_ET_LOCAUX_DE_NEIGE_OU_GRELE(122, "Orages locaux de neige ou grésil"),
    ORAGES_FAIBLES_DE_NEIGE_OU_GRELE(123, "Orages faibles de neige ou grésil"),
    ORAGES_DE_NEIGE_OU_GRELE1(124, "Orages de neige ou grésil"),
    ORAGES_DE_NEIGE_OU_GRELE2(125, "Orages de neige ou grésil"),
    ORAGES_FAIBLES_ET_FREQUENTS_DE_NEIGE_OU_GRELE(126, "Orages faibles et fréquents de neige ou grésil"),
    ORAGES_FREQUENTS_DE_NEIGE_OU_GRELE1(127, "Orages fréquents de neige ou grésil"),
    ORAGES_FREQUENTS_DE_NEIGE_OU_GRELE2(128, "Orages fréquents de neige ou grésil"),
    ORAGES_FAIBLES_ET_LOCAUX_DE_PLUIE_ET_NEIGE_MELEES_OU_GRELE(130, "Orages faibles et locaux de pluie et neige mêlées ou grésil"),
    ORAGES_LOCAUX_DE_PLUIE_ET_NEIGE_MELEES_OU_GRELE(131, "Orages locaux de pluie et neige mêlées ou grésil"),
    ORAGES_FORTS_ET_LOCAUX_DE_PLUIE_ET_NEIGE_MELEES_OU_GRELE(132, "Orages fort et locaux de pluie et neige mêlées ou grésil"),
    ORAGES_FAIBLES_DE_PLUIE_ET_NEIGE_MELEES_OU_GRELE(133, "Orages faibles de pluie et neige mêlées ou grésil"),
    ORAGES_DE_PLUIE_ET_NEIGE_MELEES_OU_GRELE(134, "Orages de pluie et neige mêlées ou grésil"),
    ORAGES_FORTS_DE_PLUIE_ET_NEIGE_MELEES_OU_GRELE(135, "Orages forts de pluie et neige mêlées ou grésil"),
    ORAGES_FAIBLES_ET_FREQUENTS_DE_PLUIE_ET_NEIGE_MELEES_OU_GRELE(136, "Orages faibles et fréquents de pluie et neige mêlées ou grésil"),
    ORAGES_FREQUENTS_DE_PLUIE_ET_NEIGE_MELEES_OU_GRELE(137, "Orages fréquents de pluie et neige mêlées ou grésil"),
    ORAGES_FORTS_ET_FREQUENTS_DE_PLUIE_ET_NEIGE_MELEES_OU_GRELE(138, "Orages forts et fréquents de pluie et neige mêlées ou grésil"),
    PLUIES_ORAGEUSES(140, "Pluies orageuses"),
    PLUIE_ET_NEIGE_MELEES_A_CARACTERE_ORAGEUX(141, "Pluie et neige mêlées à caractère orageux"),
    NEIGE_A_CARACTERE_ORAGEUX(142, "Neige à caractère orageux"),
    PLUIE_FAIBLE_INTERMITTENTE(210, "Pluie faible intermittente"),
    PLUIE_MODEREE_INTERMITTENTE(211, "Pluie modérée intermittente"),
    PLUIE_FORTE_INTERMITTENTE(212, "Pluie forte intermittente"),
    NEIGE_FAIBLE_INTERMITTENTE(220, "Neige faible intermittente"),
    NEIGE_MODEREE_INTERMITTENTE(221, "Neige modérée intermittente"),
    NEIGE_FORTE_INTERMITTENTE(222, "Neige forte intermittente"),
    PLUIE_ET_NEIGE_MELEES1(230, "Pluie et neige mêlées"),
    PLUIE_ET_NEIGE_MELEES2(231, "Pluie et neige mêlées"),
    PLUIE_ET_NEIGE_MELEES3(232, "Pluie et neige mêlées"),
    AVERSES_DE_GRELE(235, "Averses de grêle");

    private final int code;
    private final String description;

    Weather(int code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public static String getDescriptionByCode(int code) {
        for (Weather weather : Weather.values()) {
            if (weather.getCode() == code) {
                return weather.getDescription();
            }
        }
        return "Le code météo n'a pas été trouvé";
    }

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
}
