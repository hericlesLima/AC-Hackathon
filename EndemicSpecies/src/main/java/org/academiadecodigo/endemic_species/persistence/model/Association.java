package org.academiadecodigo.endemic_species.persistence.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "association")
public class Association extends User {

    private String localization;
    private String status;

    @OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            mappedBy = "association"
    )
    private List<Event> events;

    /*
    @OneToMany(
            // propagate changes on customer entity to account entities
            cascade = {CascadeType.ALL},

            // make sure to remove accounts if unlinked from customer
            orphanRemoval = true,

            // user customer foreign key on account table to establish
            // the many-to-one relationship instead of a join table
            mappedBy = "association",

            // fetch accounts from database together with user
            fetch = FetchType.EAGER
    )
    private List<Donation> donations;
     */

    public void addEvent(Event event) {
        events.add(event);
        event.setAssociation(this);
    }

    public void removeEvent(Event event) {
        events.remove(event);
        event.setAssociation(null);
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /*
    public List<Donation> getDonations() {
        return donations;
    }

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }
     */

    @Override
    public String toString() {
        return "Association{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", localization='" + localization + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
