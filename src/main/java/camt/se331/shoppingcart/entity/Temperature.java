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
public class Temperature {
    @Id
    @GeneratedValue
    Long temperatureID;
    Double minTemperature;
    Double maxTemperature;
    String temperatureLevel;
    @OneToMany(mappedBy = "temperature")
    List<PlantRequirement> plantRequirement;

    public Long getTemperatureID() {
        return temperatureID;
    }

    public void setTemperatureID(Long temperatureID) {
        this.temperatureID = temperatureID;
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(Double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(Double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public String getTemperatureLevel() {
        return temperatureLevel;
    }

    public void setTemperatureLevel(String temperatureLevel) {
        this.temperatureLevel = temperatureLevel;
    }

    public List<PlantRequirement>  getPlantRequirement() {
        return plantRequirement;
    }

    public void setPlantRequirement(List<PlantRequirement>  plantRequirement) {
        this.plantRequirement = plantRequirement;
    }
}
