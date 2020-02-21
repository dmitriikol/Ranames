package com.dmitriikol.util;


import com.dmitriikol.BasicPerson;
import com.dmitriikol.annotation.Process;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;


public class BasicPersonBuilder {

    public static List<BasicPerson> createBasicPersons(int amount) {
        Names names = new Names();
        List<BasicPerson> basicPersonList = new ArrayList<>();

        Map<String, Gender> namesMap = names.getNames();
        for (int i = 0; i < amount; i++) {
            String name = getRandomName(namesMap);
            Gender gender = namesMap.get(name);
            Region region = names.getRegion(name);
            String surname = getRandomSurname(region);
            if ((gender == Gender.FEMALE) && region == Region.RUSSIA) {
                surname += "a";
            }
            BasicPerson bp = new BasicPerson(name, surname, gender, region);
            basicPersonList.add(bp);
        }
        return basicPersonList;
    }

    public static List<BasicPerson> createBasicPersons(int amount, Region region) {
        Names names = new Names();
        List<BasicPerson> basicPersonList = new ArrayList<>();

        Map<String, Gender> namesMap = names.getNames(region);
        for (int i = 0; i < amount; i++) {
            String name = getRandomName(namesMap);
            String surname = getRandomSurname(region);
            Gender gender = namesMap.get(name);
            if ((gender == Gender.FEMALE) && region == Region.RUSSIA) {
                surname += "a";
            }
            BasicPerson bp = new BasicPerson(name, surname, gender , region);
            basicPersonList.add(bp);
        }
        return basicPersonList;
    }

    public static List<BasicPerson> createBasicPersons(int amount, Gender gender) {
        Names names = new Names();
        List<BasicPerson> basicPersonList = new ArrayList<>();

        Map<String, Gender> namesMap = names.getNames(gender);
        for (int i = 0; i < amount; i++) {
            String name = getRandomName(namesMap);
            Region region = names.getRegion(name);
            String surname = getRandomSurname(region);
            if ((gender == Gender.FEMALE) && region == Region.RUSSIA) {
                surname += "a";
            }
            BasicPerson bp = new BasicPerson(name, surname, gender, region);
            basicPersonList.add(bp);
        }
        return basicPersonList;
    }

    public static List<BasicPerson> createBasicPersons(int amount, Region region, Gender gender) {
        Names names = new Names();
        List<BasicPerson> basicPersonList = new ArrayList<>();

        Map<String, Gender> namesMap = names.getNames(region, gender);
        for (int i = 0; i < amount; i++) {
            String name = getRandomName(namesMap);
            String surname = getRandomSurname(region);
            if ((gender == Gender.FEMALE) && region == Region.RUSSIA) {
                surname += "a";
            }
            BasicPerson bp = new BasicPerson(name, surname, gender, region);
            basicPersonList.add(bp);
        }
        return basicPersonList;
    }

    private static String getRandomName(Map<String, Gender> namesMap) {
        Random random = new Random();
        List<String> list = namesMap.keySet().stream().collect(Collectors.toList());
        return list.get(random.nextInt(list.size()));
    }

    private static String getRandomSurname(Region region) {
        Surnames surnames = new Surnames();
        List<String> list = surnames.getSurnames(region);
        return list.get(new Random().nextInt(list.size()));
    }

}