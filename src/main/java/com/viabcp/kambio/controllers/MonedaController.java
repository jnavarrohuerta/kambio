package com.viabcp.kambio.controllers;

import com.viabcp.kambio.dao.MonedaDao;
import com.viabcp.kambio.model.Moneda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonedaController {

    @Autowired
    private MonedaDao monedaDao;

    @RequestMapping (value = "/api/monedas")
    public List<Moneda> getMonedas(){
        return monedaDao.getMonedas();
    }
}
