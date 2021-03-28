package org.academiadecodigo.endemic_species.persistence.dao.jpa;

import org.academiadecodigo.endemic_species.persistence.dao.Dao;
import org.academiadecodigo.endemic_species.persistence.model.AbstractModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class GenericJpaDao< T extends AbstractModel> implements Dao<T> {


    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;


    public GenericJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }


    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<T> findAll() {


        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();

        // Using JPA
        // return em.createQuery( "from " + modelType.getSimpleName(), modelType).getResultList();
    }

    @Override
    public T findById(Integer id) {
        return em.find(modelType, id);
    }


    @Override
    public T saveOrUpdate(T modelObject) {
        return em.merge(modelObject);
    }


    @Override
    public void delete(Integer id) {
        em.remove(em.find(modelType, id));
    }

}
