package com.dmitriikol.util;

import java.util.Arrays;
import java.util.List;

public class Validator {
    public static boolean genderIsValid(String gender) {
        if (gender.equals("MALE") | gender.equals("FEMALE") | gender.equals("male") | gender.equals("female")) {
            return true;
        } else return false;
    }

    public static boolean regionIsValid(String region) {
        Region[] regions = Region.values();
        String[] regionsStr = new String[region.length()];
        for (int i = 0; i < regions.length; i++) {
            regionsStr[i] = regions[i].toString();
        }
        List<String> list = Arrays.asList(regionsStr);
        return list.contains(region);
    }
}
