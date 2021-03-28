package org.academiadecodigo.endemic_species.persistence.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "doner")
public class Doner extends User {

    /*
    @OneToMany(
            // propagate changes on customer entity to account entities
            cascade = {CascadeType.ALL},

            // make sure to remove accounts if unlinked from customer
            orphanRemoval = true,

            // user customer foreign key on account table to establish
            // the many-to-one relationship instead of a join table
            mappedBy = "doner",

            // fetch accounts from database together with user
            fetch = FetchType.EAGER
    )
    private List<Donation> donations;
     */



    /*
    public void addDonation(Donation donation) {
        donations.add(donation);
        donation.setDonor(this);
    }

    public void removeDonation(Donation donation) {
        donations.remove(donation);
        donation.setDonor(null);
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }
     */
}
