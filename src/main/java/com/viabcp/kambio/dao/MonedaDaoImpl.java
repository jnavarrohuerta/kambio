package com.viabcp.kambio.dao;

import com.viabcp.kambio.model.Moneda;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class MonedaDaoImpl implements MonedaDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Moneda> getMonedas() {
        String query = "FROM Moneda";
        List<Moneda> monedas = entityManager.createQuery(query).getResultList();
        return monedas;
    }

    @Override
    public Moneda agregar(Moneda moneda) {
        return entityManager.merge(moneda);
    }
}
