package org.academiadecodigo.endemic_species.exceptions;

public class EventNotFoundException extends  EndemicSpeciesException{
    public EventNotFoundException() {
        super("Event not found");
    }
}
