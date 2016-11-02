package com.example.ahmed.medical.MangmentAndDepartment.AddMangment.modles;

/**
 * Created by ahmed on 10/20/2016.
 */

public class AddMangmentControl {

    private int serial;
    private String name;
    private String lastvisit;
    private boolean active;

    public AddMangmentControl( String name, boolean active) {

        this.name = name;
        this.active = active;
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
