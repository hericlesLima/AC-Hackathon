package org.academiadecodigo.endemic_species.persistence.dao;

import org.academiadecodigo.endemic_species.persistence.model.AbstractModel;

import java.util.List;

public interface Dao<T extends AbstractModel> {


    List<T> findAll();

    T findById(Integer id);

    T saveOrUpdate(T modelObject);

    void delete(Integer id);
}
