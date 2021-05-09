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
public class Medal {
    public String MedalName;

    public String getMedalName() {
        return MedalName;
    }

    public void setMedalName(String MedalName) {
        this.MedalName = MedalName;
    }

    public Medal(String MedalName) {
        this.MedalName = MedalName;
    }
    
}
