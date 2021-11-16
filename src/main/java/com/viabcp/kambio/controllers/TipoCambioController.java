package com.viabcp.kambio.controllers;

import com.viabcp.kambio.dao.MonedaDao;
import com.viabcp.kambio.model.Moneda;
import com.viabcp.kambio.model.Operacion;
import com.viabcp.kambio.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TipoCambioController {

    @Autowired
    private TipoCambioService tipoCambioService;

    @RequestMapping(value = "/api/tipocambio/calcular", method = RequestMethod.POST)
    public @ResponseBody Operacion calcularTipoCambio(@RequestBody Operacion operacion){
        System.out.println(operacion.toString());
        return tipoCambioService.calcular(operacion);
    }

}
