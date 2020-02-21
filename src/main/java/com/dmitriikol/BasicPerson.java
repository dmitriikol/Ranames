package com.dmitriikol;

import com.dmitriikol.util.Gender;
import com.dmitriikol.util.Region;

public class BasicPerson implements Person {
    private String name;
    private String surname;
    private Gender gender;
    private Region region;

    public BasicPerson() {
    }

    public BasicPerson(String name, String surname, Gender gender, Region region) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", region=" + region +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
