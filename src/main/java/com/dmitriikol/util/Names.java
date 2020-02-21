package com.dmitriikol.util;

import com.dmitriikol.annotation.Process;

import java.util.*;
import java.util.stream.Collectors;

//makarony
public class Names {

    private static Map<String, Gender> allNames = new HashMap<>();

    private static Map<String, Gender> russianNames = new HashMap<>();
    private static Map<String, Gender> franceNames = new HashMap<>();
    private static Map<String, Gender> usaNames = new HashMap<>();
    private static Map<String, Gender> germanNames = new HashMap<>();
    private static Map<String, Gender> polandNames = new HashMap<>();

    private static String[] russianMaleNamesArray = {"Александр", "Максим", "Иван", "Артем", "Дмитрий",
                                                    "Никита", "Махаил", "Даниил", "Егор", "Андрей",
                                                    "Петр", "Роман", "Олег", "Борис", "Захар",
                                                    "Всеволод", "Игорь", "Роман", "Кирилл", "Ярослав"};

    private static String[] russianFemaleNamesArray = {"Анастасия", "Мария", "Дарья", "Анна", "Елизавета",
                                                        "Полина", "Виктория", "Екатерина", "Софья", "Александра",
                                                        "Ульяна", "Надежда", "Валерия", "Юлия", "Алёна",
                                                        "Любовь", "Наталья", "Жанна", "Лада", "Галина"};

    private static String[] franceMaleNamesArray = {"Nathan", "Lucas", "Léo", "Gabriel", "Timéo",
                                                    "Enzo", "Louis", "Raphaël", "Arthur", "Hugo",
                                                    "Jules", "Ethan", "Adam", "Nolan", "Tom",
                                                    "Noah", "Théo", "Sacha", "Maël"};

    private static String[] franceFemaleNamesArray = {"Emma", "Lola", "Chloé", "Inès", "Léa",
                                                        "Manon", "Jade", "Louise", "Léna", "Lina",
                                                        "Zoé", "Lilou", "Camille", "Sarah", "Éva",
                                                        "Alice", "Maëlys", "Louna", "Romane", "Juliette"};

    private static String[] usaMaleNamesArray = {"Тoah", "Liam", "Mason", "Jacob", "William",
                                                "Ethan", "Michael", "Alexander", "James", "Joseph",
                                                "Daniel", "Elijah", "Benjamin", "Logan", "Aiden",
                                                "Jayden", "Matthew", "Jackson", "David", "Lucas", "Joseph"};

    private static String[] usaFemaleNamesArray = {"Emma", "Olivia", "Sophia", "Isabella", "Ava",
                                                    "Mia", "Emily", "Abigail", "Madison", "Charlotte",
                                                    "Harper", "Sofia", "Avery", "Elizabeth", "Amelia",
                                                    "Evelyn", "Ella", "Chloe", "Victoria", "Aubrey"};

    private static String[] polandMaleNamesArray = {};
    private static String[] polandFemaleNamesArray = {};

    private static String[] germanMaleNamesArray = {"Ben", "Luca", "Paul", "Lukas", "Finn",
                                                    "Jonas", "Leon", "Luis", "Maximilian", "Felix",
                                                    "Noah", "Elias", "Tim", "Max", "Julian",
                                                    "Moritz", "Niklas", "Jakob", "Alexander", "David", "Jan"};

    private static String[] germanFemaleNamesArray = {"Mia", "Emma", "Hanna", "Lea", "Anna",
                                                        "Lena", "Leonie", "Marie", "Emilie", "Emilia",
                                                        "Sophie", "Johanna", "Maya", "Sara", "Klara",
                                                        "Charlotte"};

    public Names() {
        init();
    }

    @Process
    private void init() {

        //init russian names
        for (int i = 0; i < russianMaleNamesArray.length; i++) {
            russianNames.put(russianMaleNamesArray[i], Gender.MALE);
        }
        for (int i = 0; i < russianFemaleNamesArray.length; i++) {
            russianNames.put(russianFemaleNamesArray[i], Gender.FEMALE);
        }

        //init usa names
        for (int i = 0; i < usaMaleNamesArray.length; i++) {
            usaNames.put(usaMaleNamesArray[i], Gender.MALE);
        }
        for (int i = 0; i < usaFemaleNamesArray.length; i++) {
            usaNames.put(usaFemaleNamesArray[i], Gender.FEMALE);
        }

        //init poland names
        for (int i = 0; i < polandMaleNamesArray.length; i++) {
            polandNames.put(polandMaleNamesArray[i], Gender.MALE);
        }
        for (int i = 0; i < polandFemaleNamesArray.length; i++) {
            polandNames.put(polandFemaleNamesArray[i], Gender.FEMALE);
        }

        //init france names
        for (int i = 0; i < franceMaleNamesArray.length; i++) {
            franceNames.put(franceMaleNamesArray[i], Gender.MALE);
        }
        for (int i = 0; i < franceFemaleNamesArray.length; i++) {
            franceNames.put(franceFemaleNamesArray[i], Gender.FEMALE);
        }

        //init german names
        for (int i = 0; i < germanMaleNamesArray.length; i++) {
            germanNames.put(germanMaleNamesArray[i], Gender.MALE);
        }
        for (int i = 0; i < germanFemaleNamesArray.length; i++) {
            germanNames.put(germanFemaleNamesArray[i], Gender.FEMALE);
        }

        //init all male names
        allNames.putAll(russianNames);
        allNames.putAll(franceNames);
        allNames.putAll(usaNames);
        allNames.putAll(germanNames);
        allNames.putAll(polandNames);
    }

    public Map<String, Gender> getNames() {
        return allNames;
    }

    public Map<String, Gender> getNames(Gender gender) {
        switch (gender) {
            case MALE: {
                List<String> names = allNames.entrySet().stream().filter(s->s.getValue() == Gender.MALE).
                        map(s->s.getKey()).collect(Collectors.toList());
                HashMap<String, Gender> returnMap = new HashMap<>();
                for (int i = 0; i < names.size(); i++) {
                    returnMap.put(names.get(i), Gender.MALE);
                }
                return returnMap;
            }
            case FEMALE: {
                List<String> names = allNames.entrySet().stream().filter(s->s.getValue() == Gender.FEMALE).
                        map(s->s.getKey()).collect(Collectors.toList());
                HashMap<String, Gender> returnMap = new HashMap<>();
                for (int i = 0; i < names.size(); i++) {
                    returnMap.put(names.get(i), Gender.FEMALE);
                }
                return returnMap;
            }
            default: return null;
        }
    }

    public Map<String, Gender> getNames(Region region) {
        switch (region) {
            case RUSSIA: return russianNames;
            case FRANCE: return franceNames;
            case USA: return usaNames;
            case POLAND: return  polandNames;
            case GERMANY: return germanNames;
            default: return null;
        }
    }

    public Map<String, Gender> getNames(Region region, Gender gender) {
        Map<String, Gender> map = getNames(region);
        switch (gender) {
            case MALE: {
                Map<String, Gender> tempMap = new HashMap<>();
                List<String> list = map.entrySet().stream().filter(s->s.getValue() == Gender.MALE).
                        map(s->s.getKey()).collect(Collectors.toList());
                for (int i = 0; i < list.size(); i++) {
                    tempMap.put(list.get(i), Gender.MALE);
                }
                return tempMap;
            }
            case FEMALE: {
                Map<String, Gender> tempMap = new HashMap<>();
                List<String> list = map.entrySet().stream().filter(s->s.getValue() == Gender.FEMALE).
                        map(s->s.getKey()).collect(Collectors.toList());
                for (int i = 0; i < list.size(); i++) {
                    tempMap.put(list.get(i), Gender.FEMALE);
                }
                return tempMap;
            }
            default: return null;
        }
    }

    public Region getRegion(String name) {
        if (russianNames.keySet().contains((String) name)) {
            return Region.RUSSIA;
        }
        if (usaNames.keySet().contains((String) name)) {
            return Region.USA;
        }
        if (franceNames.keySet().contains((String) name)) {
            return Region.FRANCE;
        }
        if (germanNames.keySet().contains((String) name)) {
            return Region.GERMANY;
        }
        if (polandNames.keySet().contains((String) name)) {
            return Region.POLAND;
        }
        return null;
    }

}