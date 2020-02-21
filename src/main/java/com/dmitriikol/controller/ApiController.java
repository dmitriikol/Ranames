package com.dmitriikol.controller;

import com.dmitriikol.BasicPerson;
import com.dmitriikol.util.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*
    обработка исключений ещё не добавлена
 */

@RestController
@RequestMapping("/ranames/api")
public class ApiController {

    @GetMapping
    public List<BasicPerson> getRandomBasicPersons(@RequestParam(defaultValue = "1", required = false) String amount,
                                                   @RequestParam(required = false) String gender,
                                                   @RequestParam(required = false) String region) {
        List<BasicPerson> list = new ArrayList<>();
        boolean genderIsValid = false;
        boolean regionIsValid = false;
        Integer intAmount;

        if ((gender != null) && (region != null)) {
            genderIsValid = Validator.genderIsValid(gender.toUpperCase());
            regionIsValid = Validator.regionIsValid(region.toUpperCase());
        } else if (gender != null) {
            genderIsValid = Validator.genderIsValid(gender.toUpperCase());
        } else if (region != null) {
            regionIsValid = Validator.regionIsValid(region.toUpperCase());
        }

        try {
            intAmount = Integer.valueOf(amount);
        } catch (NumberFormatException e) {
            list.add(new BasicPerson("Exception", "NumberFormat"));
            return list;
        }

        if ((genderIsValid) && (regionIsValid)) {
            list = BasicPersonBuilder.createBasicPersons(intAmount, Region.valueOf(region.toUpperCase()),
                    Gender.valueOf(gender.toUpperCase()));
            return list;
        } else if (genderIsValid) {
            list = BasicPersonBuilder.createBasicPersons(intAmount, Gender.valueOf(gender.toUpperCase()));
            return list;
        } else if (regionIsValid) {
            list = BasicPersonBuilder.createBasicPersons(intAmount, Region.valueOf(region.toUpperCase()));
            return list;
        } else {
            list = BasicPersonBuilder.createBasicPersons(intAmount);
            return list;
        }

    }
}
