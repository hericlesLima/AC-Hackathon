package org.academiadecodigo.endemic_species.exceptions;

public class DonationNotFoundException extends EndemicSpeciesException {
    public DonationNotFoundException() {
        super("Donation not found exception");
    }
}
