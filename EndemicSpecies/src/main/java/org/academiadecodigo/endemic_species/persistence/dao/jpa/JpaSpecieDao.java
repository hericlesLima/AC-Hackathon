package org.academiadecodigo.endemic_species.persistence.dao.jpa;

import org.academiadecodigo.endemic_species.persistence.dao.SpecieDao;
import org.academiadecodigo.endemic_species.persistence.model.Specie;
import org.springframework.stereotype.Repository;

@Repository
public class JpaSpecieDao extends GenericJpaDao<Specie> implements SpecieDao {

    public JpaSpecieDao() {
        super(Specie.class);
    }
}
