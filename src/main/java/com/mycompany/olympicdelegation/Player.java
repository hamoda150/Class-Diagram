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
public class Player {
private String PlayerName;
private String PlayerAddress;

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }

    public String getPlayerAddress() {
        return PlayerAddress;
    }

    public void setPlayerAddress(String PlayerAddress) {
        this.PlayerAddress = PlayerAddress;
    }

    public Player(String PlayerName, String PlayerAddress) {
        this.PlayerName = PlayerName;
        this.PlayerAddress = PlayerAddress;
    }



}
