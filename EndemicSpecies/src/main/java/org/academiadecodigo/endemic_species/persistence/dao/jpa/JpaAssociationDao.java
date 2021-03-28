package org.academiadecodigo.endemic_species.persistence.dao.jpa;

import org.academiadecodigo.endemic_species.persistence.dao.AssociationDao;
import org.academiadecodigo.endemic_species.persistence.model.Association;
import org.springframework.stereotype.Repository;


@Repository
public class JpaAssociationDao extends GenericJpaDao<Association> implements AssociationDao {


    public JpaAssociationDao() {
        super(Association.class);
    }
}
