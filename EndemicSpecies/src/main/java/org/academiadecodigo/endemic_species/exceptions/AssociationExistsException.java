package org.academiadecodigo.endemic_species.exceptions;

/**
 * Thrown to indicate that an association still exists
 */
public class AssociationExistsException extends EndemicSpeciesException {


    public AssociationExistsException() {
        super("Entity contains association with another entity");
    }
}
