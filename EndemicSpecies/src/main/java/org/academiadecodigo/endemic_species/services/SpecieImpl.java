package org.academiadecodigo.endemic_species.services;

import org.academiadecodigo.endemic_species.persistence.dao.SpecieDao;
import org.academiadecodigo.endemic_species.persistence.model.Event;
import org.academiadecodigo.endemic_species.persistence.model.Specie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SpecieImpl implements SpecieService {

    private SpecieDao specieDao;

    @Autowired
    public void setSpecieDao(SpecieDao specieDao) {
        this.specieDao = specieDao;
    }

    @Override
    public Specie get(Integer id) {
        return specieDao.findById(id);
    }

    @Override
    public List<Specie> list() {
        return specieDao.findAll();
    }

    @Transactional
    @Override
    public Specie save(Specie specie) {
        return specieDao.saveOrUpdate(specie);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        specieDao.delete(id);
    }
}
