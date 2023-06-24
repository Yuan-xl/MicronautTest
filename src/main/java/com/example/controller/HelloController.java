package com.example.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * @author yuakk
 */
@Controller(value = "api")
public class HelloController {

    @Get(value = "/hello",produces = MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello World!";
    }
}
