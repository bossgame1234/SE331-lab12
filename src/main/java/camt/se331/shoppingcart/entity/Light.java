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
public class Light {
    @Id
    @GeneratedValue
    Long lightID;
    Double minLight;
    Double maxLight;
    String lightLevel;
    @OneToMany(mappedBy = "light")
    List<PlantRequirement> plantRequirement;
    public Light(){}
    public Long getLightID() {
        return lightID;
    }

    public void setLightID(Long lightID) {
        this.lightID = lightID;
    }

    public Double getMinLight() {
        return minLight;
    }

    public void setMinLight(Double minLight) {
        this.minLight = minLight;
    }

    public Double getMaxLight() {
        return maxLight;
    }

    public void setMaxLight(Double maxLight) {
        this.maxLight = maxLight;
    }

    public String getLightLevel() {
        return lightLevel;
    }

    public void setLightLevel(String lightLevel) {
        this.lightLevel = lightLevel;
    }

    public List<PlantRequirement>  getPlantRequirement() {
        return plantRequirement;
    }

    public void setPlantRequirement(List<PlantRequirement>  plantRequirement) {
        this.plantRequirement = plantRequirement;
    }
}
