package com.viabcp.kambio.controllers;

import com.viabcp.kambio.dao.MonedaDao;
import com.viabcp.kambio.model.Moneda;
import com.viabcp.kambio.model.Operacion;
import com.viabcp.kambio.model.TipoCambio;
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
        return tipoCambioService.calcular(operacion);
    }

    @RequestMapping(value = "/api/tipocambio/actualizar", method = RequestMethod.PUT)
    public @ResponseBody TipoCambio actualizarTipoCambio(@RequestBody TipoCambio tipoCambio){
        return tipoCambioService.actualizar(tipoCambio);
    }

    @RequestMapping(value = "/api/tipocambio/{idMoneda1}/{idMoneda2}")
    public TipoCambio getTipoCambio(@PathVariable Long idMoneda1, @PathVariable Long idMoneda2){
        TipoCambio tipoCambio = new TipoCambio();
        tipoCambio.setIdMoneda1(idMoneda1);
        tipoCambio.setIdMoneda2(idMoneda2);
        return tipoCambioService.getTipoCambio(tipoCambio);
    }

    @RequestMapping(value = "/api/tipocambio/agregar", method = RequestMethod.POST)
    public @ResponseBody TipoCambio agregarTipoCambio(@RequestBody TipoCambio tipoCambio){
        return tipoCambioService.agregar(tipoCambio);
    }

}
