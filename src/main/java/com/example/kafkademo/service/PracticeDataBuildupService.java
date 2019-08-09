package com.example.kafkademo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PracticeDataBuildupService {

//    Logger logger = LoggerFactory.getLogger(PracticeDataBuildupService.class);
    private static final Logger LOGGER = LogManager.getLogger(PracticeDataBuildupService.class);


    public void sendMessage1(){

        LOGGER.info("Logging using log4j");
        LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");

        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        List vector = new Vector();
        List stack = new Stack();


        Set hashSet  = new HashSet();
        hashSet.add("Vaishu");
        hashSet.add(100);

        arrayList.add("Vaishu");
        arrayList.add(100);

        linkedList.add("Shalu");
        linkedList.add(30);



        //ordered of addition
        LOGGER.info(arrayList);

        //No order
        LOGGER.info(hashSet);

    }

    public String sendMessage2(String cableAccountNumber, String divisionId){
        return divisionId + cableAccountNumber;
    }

    public String sendMessage3(String name){
        return name;
    }
}
