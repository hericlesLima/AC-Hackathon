package org.academiadecodigo.endemic_species.services;

import org.academiadecodigo.endemic_species.persistence.model.Donation;
import org.academiadecodigo.endemic_species.persistence.model.Doner;

import java.util.List;

public interface DonerService {

    Doner get(Integer id);

    List<Doner> list();

    Doner save(Doner doner);

    void delete(Integer id);

    //List<Donation> getDonations(Integer id);

    //Donation addDonation(Integer id, Donation donation);

    //void removeDonation(Integer id, Integer donationId);
}
