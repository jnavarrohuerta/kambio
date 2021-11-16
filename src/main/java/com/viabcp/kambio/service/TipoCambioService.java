package com.viabcp.kambio.service;

import com.viabcp.kambio.model.Operacion;
import com.viabcp.kambio.model.TipoCambio;

public interface TipoCambioService {
    Operacion calcular(Operacion operacion);
}
