package com.example.ahmed.medical.MangmentAndDepartment.JobsName.modles;

/**
 * Created by ahmed on 10/20/2016.
 */

public class JobsNameControl {

    private String name;

    private boolean active;

    public JobsNameControl(String name, boolean active) {

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
