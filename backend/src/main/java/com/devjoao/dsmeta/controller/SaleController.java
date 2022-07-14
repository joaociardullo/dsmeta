package com.devjoao.dsmeta.controller;


import com.devjoao.dsmeta.entities.Sale;
import com.devjoao.dsmeta.services.SaleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleServices service;

    @GetMapping
    public ResponseEntity<Page<Sale>> findSales(@RequestParam(value="minDate", defaultValue = "" ) String minDate,
                                                @RequestParam(value="maxDate", defaultValue = "" ) String maxDate,
                                                Pageable pageable) {
        return ResponseEntity.ok().body(service.findSales(minDate, maxDate,pageable));
    }

}
