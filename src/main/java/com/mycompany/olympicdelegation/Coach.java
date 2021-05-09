/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.olympicdelegation;

/**
 *
 * @author Mohamed
 */
public class Coach {
    private String CoachName;
    private String CoachAddress;

    public String getCoachName() {
        return CoachName;
    }

    public void setCoachName(String CoachName) {
        this.CoachName = CoachName;
    }

    public String getCoachAddress() {
        return CoachAddress;
    }

    public void setCoachAddress(String CoachAddress) {
        this.CoachAddress = CoachAddress;
    }

    public Coach(String CoachName, String CoachAddress) {
        this.CoachName = CoachName;
        this.CoachAddress = CoachAddress;
    }
    
}
