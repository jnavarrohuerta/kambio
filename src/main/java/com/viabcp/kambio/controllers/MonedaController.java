package com.viabcp.kambio.controllers;

import com.viabcp.kambio.dao.MonedaDao;
import com.viabcp.kambio.model.Moneda;
import com.viabcp.kambio.model.Operacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MonedaController {

    @Autowired
    private MonedaDao monedaDao;

    @RequestMapping (value = "/api/monedas")
    public List<Moneda> getMonedas(){
        return monedaDao.getMonedas();
    }

    @RequestMapping(value = "/api/moneda/agregar", method = RequestMethod.POST)
    public @ResponseBody Moneda agregarMoneda(@RequestBody Moneda moneda){
        return monedaDao.agregar(moneda);
    }

    @RequestMapping(value = "/api/primos/{n}", method = RequestMethod.GET)
    public int[] primos(@PathVariable int n){
        int[] primosInverso = new int[n];
        int i = 0;
        int j = 2;
        while(i<n) {
            if(esPrimo(j)) {
                primosInverso[n-1-i]=j;
                i++;
            }
            j++;
        }
        return primosInverso;
    }

    private Boolean esPrimo(int j){
        for (int k=2; k<j; k++){
            if(j%k==0) return false;
        }
        return true;
    }
}
