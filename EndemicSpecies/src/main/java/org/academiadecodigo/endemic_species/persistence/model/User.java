package org.academiadecodigo.endemic_species.persistence.model;

public abstract class User extends AbstractModel {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
