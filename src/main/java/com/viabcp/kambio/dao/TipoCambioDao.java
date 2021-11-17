package com.viabcp.kambio.dao;

import com.viabcp.kambio.model.TipoCambio;

public interface TipoCambioDao {
    TipoCambio getTipoCambio(TipoCambio tipoCambio);

    TipoCambio actualizar(TipoCambio tipoCambio);

    TipoCambio get(TipoCambio tipoCambio);

    TipoCambio agregar(TipoCambio tipoCambio);
}
