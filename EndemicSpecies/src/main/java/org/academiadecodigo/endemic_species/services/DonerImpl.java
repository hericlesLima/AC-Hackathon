package org.academiadecodigo.endemic_species.services;

import org.academiadecodigo.endemic_species.persistence.dao.DonationDao;
import org.academiadecodigo.endemic_species.persistence.dao.DonerDao;
import org.academiadecodigo.endemic_species.persistence.dao.jpa.JpaDonationDao;
import org.academiadecodigo.endemic_species.persistence.dao.jpa.JpaDonerDao;
import org.academiadecodigo.endemic_species.persistence.model.Donation;
import org.academiadecodigo.endemic_species.persistence.model.Doner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DonerImpl implements DonerService {

    private JpaDonerDao donerDao;
    /*
    private DonationDao donationDao;

    @Autowired
    public void setDonationDao(DonationDao donationDao) {
        this.donationDao = donationDao;
    }

    @Autowired
    public void setDonerDao(DonerDao donerDao) {
        this.donerDao = donerDao;
    }

     */

    @Autowired
    public void setDonerDao(JpaDonerDao donerDao) {
        this.donerDao = donerDao;
    }

    @Override
    public Doner get(Integer id) {
        return donerDao.findById(id);
    }

    @Override
    public List<Doner> list() {
        return donerDao.findAll();
    }

    @Transactional
    @Override
    public Doner save(Doner doner) {
        return donerDao.saveOrUpdate(doner);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        donerDao.delete(id);
    }

    /*
    @Transactional(readOnly = true)
    @Override
    public List<Donation> getDonations(Integer id) {

        Doner doner = donerDao.findById(id);

        if (doner == null) {
            throw new IllegalStateException();
        }

        return new ArrayList<>(donerDao.findById(id).getDonations());
    }

    @Override
    public Donation addDonation(Integer id, Donation donation) {

        Doner doner = donerDao.findById(id);

        if (doner == null) {
            throw new IllegalStateException();
        }

        if (donation.getId() == null) {
            donerDao.saveOrUpdate(doner);
        } else {
            donationDao.saveOrUpdate(donation);
        }

        return doner.getDonations().get(doner.getDonations().size() -1);

    }

    @Override
    public void removeDonation(Integer id, Integer donationId) {

        Doner doner = donerDao.findById(id);
        Donation donation = donationDao.findById(donationId);

        if (doner == null) {
            throw new IllegalStateException();
        }
        donerDao.saveOrUpdate(doner);

    }

     */
}
