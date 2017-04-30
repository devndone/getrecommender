/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hiber;

/**
 *
 * @author adimn
 */
public class Users {
    
    private int userid;
    private String latitude;
    private String longitude;

    public int getUserid() {
        return userid;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
}
