package com.example.ahmed.medical.systemManagment.models;

/**
 * Created by ahmed on 10/25/2016.
 */

public class fragDisGrouptotal {
    private int sort;
    private String groupName;
    private String group;

    public fragDisGrouptotal(String groupName,String group,int sort){
        this.groupName=groupName;
        this.group=group;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
