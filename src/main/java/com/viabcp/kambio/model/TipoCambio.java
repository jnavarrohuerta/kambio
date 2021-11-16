package com.viabcp.kambio.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tipo_cambio")
@IdClass(TipoCambioPK.class)
public class TipoCambio {
    @Id
    @Column(name = "id_moneda_1")
    private Long idMoneda1;

    @Id
    @Column(name = "id_moneda_2")
    private Long idMoneda2;

    @Column(name = "cambio")
    private BigDecimal cambio;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

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

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
