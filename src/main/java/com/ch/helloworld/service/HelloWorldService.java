package com.ch.helloworld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);

    public String getDesc() {

        logger.debug("getDesc() is executed!");

        return "Gradle + Spring REST Example";

    }

    public String getTitle(String name) {

        logger.debug("getTitle() is executed!");

        return "Hello World";

    }

}