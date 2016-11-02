package com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.modles;

/**
 * Created by ok on 29/10/2016.
 */

public class MultipleRowControl {
    private int serial;
    private String name;
    private String serial1;

    public MultipleRowControl(int serial, String name,String serial1) {
        this.serial = serial;
        this.name = name;
        this.serial1 = serial1;

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
