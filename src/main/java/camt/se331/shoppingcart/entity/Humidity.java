package camt.se331.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by USER on 6/1/2015.
 */
@Entity
public class Humidity {
    @Id
    @GeneratedValue
    Long humidityID;
    Double minHumidity;
    Double maxHumidity;
    String humidityLevel;
    @OneToMany(mappedBy = "humidity")
    List<PlantRequirement> plantRequirement;
    public Humidity(){}
    public Long getHumidityID() {
        return humidityID;
    }

    public void setHumidityID(Long humidityID) {
        this.humidityID = humidityID;
    }

    public Double getMinHumidity() {
        return minHumidity;
    }

    public void setMinHumidity(Double minHumidity) {
        this.minHumidity = minHumidity;
    }

    public Double getMaxHumidity() {
        return maxHumidity;
    }

    public void setMaxHumidity(Double maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public String getHumidityLevel() {
        return humidityLevel;
    }

    public void setHumidityLevel(String humidityLevel) {
        this.humidityLevel = humidityLevel;
    }

    public List<PlantRequirement>  getPlantRequirement() {
        return plantRequirement;
    }

    public void setPlantRequirement(List<PlantRequirement>  plantRequirement) {
        this.plantRequirement = plantRequirement;
    }
}
