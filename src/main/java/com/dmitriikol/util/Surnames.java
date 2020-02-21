package com.dmitriikol.util;

import java.util.Arrays;
import java.util.List;

public class Surnames {

    private static String[] russianSurnames = {"Иванов", "Смирнов", "Кузнецов", "Попов", "Васильев",
                                                "Петров", "Соколов", "Михайлов", "Новиков", "Федоров",
                                                "Смирнов", "Кузнецов", "Васильев", "Соколов", "Морозов",
                                                "Волков", "Алексеев", "Лебедев", "Орлов", "Макаров"};

    private static String[] franceSurnames = {"Martin", "Bernard", "Thomas", "Petit", "Robert",
                                                "Richard", "Durand", "Dunois", "Moreau", "Laurent",
                                                "Simon", "Michel", "Lefebvre", "Leriy", "Roux",
                                                "David", "Bertrand", "Morel", "Fournier", "Girard"};

    private static String[] usaSurnames = {"Smith", "Johnson", "Williams", "Jones", "Brown",
                                            "Davis", "Miller", "Wilson", "Moore", "Taylor",
                                            "Anderson", "Thomas", "Jackson", "White", "Harris",
                                            "Martin", "Thompson", "Garcia", "Martinez", "Robinson"};

    private static String[] polandSurnames = {};

    private static String[] germanSurnames = {"Müller", "Schmidt", "Schneider", "Fischer", "Meier",
                                                "Weber", "Wagner", "Becker", "Schulz", "Hoffmann",
                                                "Schäfer", "Koch", "Bauer", "Richter", "Klein",
                                                "Wolf", "Schröder", "Schwarz", "Zimmermann", "Braun", "Lehmann"};


    public List<String> getSurnames(Region region) {
        switch (region) {
            case RUSSIA: return Arrays.asList(russianSurnames);
            case GERMANY: return Arrays.asList(germanSurnames);
            case POLAND: return Arrays.asList(polandSurnames);
            case USA: return Arrays.asList(usaSurnames);
            case FRANCE: return Arrays.asList(franceSurnames);
            default: return null;
        }
    }

}
