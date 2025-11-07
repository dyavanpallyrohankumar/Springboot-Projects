package com.infy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer playerId;
    Integer ranking;
    String playerName, country, debutDate, battingStyle, bowlingStyle;

    public Player(Integer ranking, String playerName, String country, String debutDate,
            String battingStyle, String bowlingStyle) {
        // this.playerId = playerId;
        this.ranking = ranking;
        this.playerName = playerName;
        this.country = country;
        this.debutDate = debutDate;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
    }

    public Player() {
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(String debutDate) {
        this.debutDate = debutDate;
    }

    public String getBattingStyle() {
        return battingStyle;
    }

    public void setBattingStyle(String battingStyle) {
        this.battingStyle = battingStyle;
    }

    public String getBowlingStyle() {
        return bowlingStyle;
    }

    public void setBowlingStyle(String bowlingStyle) {
        this.bowlingStyle = bowlingStyle;
    }

    @Override
    public String toString() {
        return "Player [playerId=" + playerId + ", ranking=" + ranking + ", playerName=" + playerName + ", country="
                + country + ", debutDate=" + debutDate + ", battingStyle=" + battingStyle + ", bowlingStyle="
                + bowlingStyle + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
        result = prime * result + ((ranking == null) ? 0 : ranking.hashCode());
        result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((debutDate == null) ? 0 : debutDate.hashCode());
        result = prime * result + ((battingStyle == null) ? 0 : battingStyle.hashCode());
        result = prime * result + ((bowlingStyle == null) ? 0 : bowlingStyle.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (playerId == null) {
            if (other.playerId != null)
                return false;
        } else if (!playerId.equals(other.playerId))
            return false;
        if (ranking == null) {
            if (other.ranking != null)
                return false;
        } else if (!ranking.equals(other.ranking))
            return false;
        if (playerName == null) {
            if (other.playerName != null)
                return false;
        } else if (!playerName.equals(other.playerName))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        if (debutDate == null) {
            if (other.debutDate != null)
                return false;
        } else if (!debutDate.equals(other.debutDate))
            return false;
        if (battingStyle == null) {
            if (other.battingStyle != null)
                return false;
        } else if (!battingStyle.equals(other.battingStyle))
            return false;
        if (bowlingStyle == null) {
            if (other.bowlingStyle != null)
                return false;
        } else if (!bowlingStyle.equals(other.bowlingStyle))
            return false;
        return true;
    }

}