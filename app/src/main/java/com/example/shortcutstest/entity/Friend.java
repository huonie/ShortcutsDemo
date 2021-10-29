package com.example.shortcutstest.entity;

import java.io.Serializable;

/**
 * @authour: Lenga
 * @time: 15:17
 * @desc:
 */
public class Friend implements Serializable {
    private String gander;
    private String name;
    private String phoneNum;

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "gander='" + gander + '\'' +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
