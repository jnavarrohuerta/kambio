package com.viabcp.kambio.dao;

import com.viabcp.kambio.model.Moneda;
import com.viabcp.kambio.model.TipoCambio;
import com.viabcp.kambio.model.TipoCambioPK;
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
        String query = "FROM TipoCambio tc WHERE tc.idMoneda1 = :idMoneda1 and tc.idMoneda2 = :idMoneda2";
        Query query1 = entityManager.createQuery(query);
        query1.setParameter("idMoneda1", tipoCambio.getIdMoneda1());
        query1.setParameter("idMoneda2", tipoCambio.getIdMoneda2());
        tipoCambio = (TipoCambio) query1.getSingleResult();
        return tipoCambio;
    }

    @Override
    public TipoCambio actualizar(TipoCambio tipoCambio) {
        return entityManager.merge(tipoCambio);
    }

    @Override
    public TipoCambio get(TipoCambio tipoCambio) {
        TipoCambioPK tipoCambioPK = new TipoCambioPK(tipoCambio.getIdMoneda1(), tipoCambio.getIdMoneda2());
        return entityManager.find(TipoCambio.class, tipoCambioPK);
    }

    @Override
    public TipoCambio agregar(TipoCambio tipoCambio) {
        return entityManager.merge(tipoCambio);
    }
}
