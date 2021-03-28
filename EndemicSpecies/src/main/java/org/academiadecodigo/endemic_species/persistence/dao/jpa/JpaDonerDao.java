package org.academiadecodigo.endemic_species.persistence.dao.jpa;

import org.academiadecodigo.endemic_species.persistence.dao.Dao;
import org.academiadecodigo.endemic_species.persistence.dao.DonerDao;
import org.academiadecodigo.endemic_species.persistence.model.Doner;
import org.springframework.stereotype.Repository;

@Repository
public class JpaDonerDao extends GenericJpaDao<Doner> implements DonerDao {

    public JpaDonerDao() {
        super(Doner.class);
    }
}
