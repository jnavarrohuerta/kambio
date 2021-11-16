package com.viabcp.kambio.dao;

import com.viabcp.kambio.model.Moneda;
import com.viabcp.kambio.model.TipoCambio;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Repository
@Transactional
public class TipoCambioDaoImpl implements TipoCambioDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public TipoCambio getTipoCambio(TipoCambio tipoCambio) {
        System.out.println(tipoCambio.getIdMoneda1() + "-" + tipoCambio.getIdMoneda2());
        String query = "FROM TipoCambio tc WHERE tc.idMoneda1 = :idMoneda1 and tc.idMoneda2 = :idMoneda2";
        Query query1 = entityManager.createQuery(query);
        query1.setParameter("idMoneda1", tipoCambio.getIdMoneda1());
        query1.setParameter("idMoneda2", tipoCambio.getIdMoneda2());
        tipoCambio = (TipoCambio) query1.getSingleResult();
        System.out.println(tipoCambio.getCambio());
        return tipoCambio;
    }
}
