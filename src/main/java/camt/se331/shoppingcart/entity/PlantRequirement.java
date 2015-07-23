package camt.se331.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by USER on 6/1/2015.
 */
@Entity
public class PlantRequirement {
    @Id
    @GeneratedValue
    Long pRealID;
    public PlantRequirement(){}
    @ManyToOne
    Light light;
    @ManyToOne
    Water water;
    @ManyToOne
    Fertilizer fertilizer;
    @ManyToOne
    Temperature temperature;
    @ManyToOne
    Humidity humidity;
    @ManyToOne
    Soil soil;

    public Long getpRealID() {
        return pRealID;
    }

    public void setpRealID(Long pRealID) {
        this.pRealID = pRealID;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Fertilizer getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(Fertilizer fertilizer) {
        this.fertilizer = fertilizer;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    public Soil getSoil() {
        return soil;
    }

    public void setSoil(Soil soil) {
        this.soil = soil;
    }
}
