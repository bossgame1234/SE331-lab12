package camt.se331.shoppingcart.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.DoubleSummaryStatistics;

/**
 * Created by USER on 6/1/2015.
 */
public class PlantData {
    @Id
    @GeneratedValue
    Long pDataID;
    @ManyToOne
    MyPlantData myPlantData;
    Double light;
    Double water;
    Double fertilizer;
    Double temperature;
    Double humidity;
    Double soil;
    public PlantData(){}
    public Long getpDataID() {
        return pDataID;
    }

    public void setpDataID(Long pDataID) {
        this.pDataID = pDataID;
    }

    public MyPlantData getMyPlantData() {
        return myPlantData;
    }

    public void setMyPlantData(MyPlantData myPlantData) {
        this.myPlantData = myPlantData;
    }

    public Double getLight() {
        return light;
    }

    public void setLight(Double light) {
        this.light = light;
    }

    public Double getWater() {
        return water;
    }

    public void setWater(Double water) {
        this.water = water;
    }

    public Double getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(Double fertilizer) {
        this.fertilizer = fertilizer;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getSoil() {
        return soil;
    }

    public void setSoil(Double soil) {
        this.soil = soil;
    }
}
