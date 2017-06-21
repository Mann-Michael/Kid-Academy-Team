/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author rdodenbier
 */
    public enum Actor implements Serializable {
        
        Robbie("The old one"),
        Michael("The handsome one"),
        Rudy("The coolest of them all"),
        Andrew("The busiest of them all");
    
        // class instance variables
        private final String description;
        private final String coordinates;
        private final int currentScore;
        private final String player;

    Actor(String description) {
        this.description = description;
        //coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", currentScore=" + currentScore + ", player=" + player + '}';
    }
    
}
