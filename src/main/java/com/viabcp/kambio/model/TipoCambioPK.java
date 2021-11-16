package com.viabcp.kambio.model;

import java.io.Serializable;
import java.util.Objects;

public class TipoCambioPK implements Serializable {
    protected Long idMoneda1;
    protected Long idMoneda2;

    public TipoCambioPK() {}

    public TipoCambioPK(Long idMoneda1, Long idMoneda2) {
        this.idMoneda1 = idMoneda1;
        this.idMoneda2 = idMoneda2;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoCambioPK that = (TipoCambioPK) o;
        return Objects.equals(idMoneda1, that.idMoneda1) && Objects.equals(idMoneda2, that.idMoneda2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMoneda1, idMoneda2);
    }
}
