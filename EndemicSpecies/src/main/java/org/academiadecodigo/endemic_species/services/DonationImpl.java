package org.academiadecodigo.endemic_species.services;

import org.academiadecodigo.endemic_species.persistence.dao.DonationDao;
import org.academiadecodigo.endemic_species.persistence.model.Donation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DonationImpl implements DonationService {

    /*
    private DonationDao donationDao;

    @Autowired
    public void setDonationDao(DonationDao donationDao) {
        this.donationDao = donationDao;
    }

    @Override
    public Donation get(Integer id) {
        return donationDao.findById(id);
    }

    @Override
    public List<Donation> list() {
        return donationDao.findAll();
    }

    @Transactional
    @Override
    public Donation save(Donation donation) {
        return donationDao.saveOrUpdate(donation);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        donationDao.delete(id);
    }

     */
}
