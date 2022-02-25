package com.enzen.hes.controller;

import com.enzen.hes.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {

    @Autowired
    EntityService entityService;

    @RequestMapping(value = "/api/v1/test", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String test() throws Exception {
        entityService.serviceTest();
        return "Success";
    }


}
