package com.devjoao.dsmeta.services;

import com.devjoao.dsmeta.entities.Sale;
import com.devjoao.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServices {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }

}
