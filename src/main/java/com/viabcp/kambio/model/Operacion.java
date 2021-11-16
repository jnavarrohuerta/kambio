package com.viabcp.kambio.model;

import java.math.BigDecimal;
import java.util.Date;

public class Operacion {
    private Long idMoneda1;
    private Long idMoneda2;
    private BigDecimal cambio;
    private BigDecimal monto;
    private BigDecimal montoCambio;
    private Date fecha;

    public Long getIdMoneda1() {
        return idMoneda1;
    }

    public void setIdMoneda1(Long idMoneda1) {
        this.idMoneda1 = idMoneda1;
    }

    public Long getIdMoneda2() {
        return idMoneda2;
    }

    public void setIdMoneda2(Long idMoneda2) {
        this.idMoneda2 = idMoneda2;
    }

    public BigDecimal getCambio() {
        return cambio;
    }

    public void setCambio(BigDecimal cambio) {
        this.cambio = cambio;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMontoCambio() {
        return montoCambio;
    }

    public void setMontoCambio(BigDecimal montoCambio) {
        this.montoCambio = montoCambio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
