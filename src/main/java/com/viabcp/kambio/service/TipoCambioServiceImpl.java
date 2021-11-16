package com.viabcp.kambio.service;

import com.viabcp.kambio.dao.TipoCambioDao;
import com.viabcp.kambio.model.Operacion;
import com.viabcp.kambio.model.TipoCambio;
import com.viabcp.kambio.model.TipoCambioPK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TipoCambioServiceImpl implements TipoCambioService{

    @Autowired
    private TipoCambioDao tipoCambioDao;

    @Override
    public Operacion calcular(Operacion operacion) {
        TipoCambio tipoCambio = new TipoCambio();
        tipoCambio.setIdMoneda1(operacion.getIdMoneda1());
        tipoCambio.setIdMoneda2(operacion.getIdMoneda2());
        tipoCambio = tipoCambioDao.getTipoCambio(tipoCambio);
        BigDecimal montoCambio = operacion.getMonto().multiply(tipoCambio.getCambio());

        operacion.setCambio(tipoCambio.getCambio());
        operacion.setMontoCambio(montoCambio);
        return operacion;
    }
}
