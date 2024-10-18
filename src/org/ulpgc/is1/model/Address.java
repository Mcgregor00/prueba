package org.ulpgc.is1.model;

public class Address {
    private String calle;

    public Address(String calle) {
        this.calle = calle;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
}
