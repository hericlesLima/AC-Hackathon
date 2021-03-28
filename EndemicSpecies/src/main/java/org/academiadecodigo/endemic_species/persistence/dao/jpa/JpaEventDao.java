package org.academiadecodigo.endemic_species.persistence.dao.jpa;

import org.academiadecodigo.endemic_species.persistence.dao.Dao;
import org.academiadecodigo.endemic_species.persistence.dao.EventDao;
import org.academiadecodigo.endemic_species.persistence.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public class JpaEventDao extends GenericJpaDao<Event> implements EventDao {
    public JpaEventDao() {
        super(Event.class);
    }
}
