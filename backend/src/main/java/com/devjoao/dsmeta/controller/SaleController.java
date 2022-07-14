package com.devjoao.dsmeta.controller;


import com.devjoao.dsmeta.entities.Sale;
import com.devjoao.dsmeta.services.SaleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleServices service;

    @GetMapping
    public ResponseEntity<List<Sale>>findSales(){
        return ResponseEntity.ok().body(service.findSales());
    }

}
