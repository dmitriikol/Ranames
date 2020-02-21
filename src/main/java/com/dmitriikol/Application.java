package com.dmitriikol;

import com.dmitriikol.util.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.Name;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

//public class Application {
//    public static void main(String[] args) {
//
//        System.out.println("random");
//        List<BasicPerson> lbp1 = BasicPersonBuilder.createBasicPersons(10);
//        for (BasicPerson bp : lbp1) {
//            System.out.println(bp);
//        }
//        System.out.println("-----------------------------");
//
//        System.out.println("region russia");
//        List<BasicPerson> lbp2 = BasicPersonBuilder.createBasicPersons(10, Region.RUSSIA);
//        for (BasicPerson bp : lbp2) {
//            System.out.println(bp);
//        }
//        System.out.println("-----------------------------");
//
//        System.out.println("region german");
//        List<BasicPerson> lbp3 = BasicPersonBuilder.createBasicPersons(10, Region.GERMANY);
//        for (BasicPerson bp : lbp3) {
//            System.out.println(bp);
//        }
//        System.out.println("-----------------------------");
//
//        System.out.println("gender male");
//        List<BasicPerson> lbp4 = BasicPersonBuilder.createBasicPersons(10, Gender.MALE);
//        for (BasicPerson bp : lbp4) {
//            System.out.println(bp);
//        }
//        System.out.println("-----------------------------");
//
//        System.out.println("gender female");
//        List<BasicPerson> lbp5 = BasicPersonBuilder.createBasicPersons(10, Gender.FEMALE);
//        for (BasicPerson bp : lbp5) {
//            System.out.println(bp);
//        }
//        System.out.println("-----------------------------");
//
//        System.out.println("male france");
//        List<BasicPerson> lbp6 = BasicPersonBuilder.createBasicPersons(10, Region.FRANCE, Gender.MALE);
//        for (BasicPerson bp : lbp6) {
//            System.out.println(bp);
//        }
//        System.out.println("-----------------------------");
//    }
//
//}