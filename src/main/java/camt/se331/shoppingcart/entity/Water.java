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
public class Water {
    @Id
    @GeneratedValue
    Long waterID;
    Double minWater;
    Double maxWater;
    String waterLevel;
    public Water(){}
    @OneToMany(mappedBy = "water")
    List<PlantRequirement> plantRequirement;

    public Long getWaterID() {
        return waterID;
    }

    public void setWaterID(Long waterID) {
        this.waterID = waterID;
    }

    public Double getMinWater() {
        return minWater;
    }

    public void setMinWater(Double minWater) {
        this.minWater = minWater;
    }

    public Double getMaxWater() {
        return maxWater;
    }

    public void setMaxWater(Double maxWater) {
        this.maxWater = maxWater;
    }

    public String getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(String waterLevel) {
        this.waterLevel = waterLevel;
    }

    public List<PlantRequirement>  getPlantRequirement() {
        return plantRequirement;
    }

    public void setPlantRequirement(List<PlantRequirement>  plantRequirement) {
        this.plantRequirement = plantRequirement;
    }
}
