package com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.modles;

import java.util.List;

/**
 * Created by ahmed on 10/20/2016.
 */

public class MainControlDepartment {

    private int serial;
    private String name;

    public MainControlDepartment(int serial, String name) {
        this.serial = serial;
        this.name = name;

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

}
