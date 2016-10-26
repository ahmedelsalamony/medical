package com.example.ahmed.medical.systemManagment.models;

/**
 * Created by ahmed on 10/25/2016.
 */

public class fragDisGroup {

    private int sort;
    private String groupName;
    private String groupPlace;

    public fragDisGroup(String groupName,String groupPlace,int sort){
        this.groupName=groupName;
        this.groupPlace=groupPlace;
        this.sort=sort;

    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupPlace() {
        return groupPlace;
    }

    public void setGroupPlace(String groupPlace) {
        this.groupPlace = groupPlace;
    }
}
