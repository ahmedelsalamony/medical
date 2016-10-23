package com.example.ahmed.medical.systemManagment.models;

import java.util.Date;

/**
 * Created by ahmed on 10/20/2016.
 */

public class disUserControl {

    private int serial;
    private String name;
    private String lastvisit;
    private boolean active;

    public disUserControl(int serial, String name, boolean active, String lastvisit) {
        this.serial = serial;
        this.name = name;
        this.lastvisit = lastvisit;
        this.active = active;
    }

    public String getLastvisit() {
        return lastvisit;
    }

    public void setLastvisit(String lastvisit) {
        this.lastvisit = lastvisit;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
