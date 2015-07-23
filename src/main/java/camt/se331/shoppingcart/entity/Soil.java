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
public class Soil {
    @Id
    @GeneratedValue
    Long soilID;
    Double minSoil;
    Double maxSoil;
    String soilLevel;
    @OneToMany(mappedBy = "soil")
    List<PlantRequirement> plantRequirement;
    public Soil(){}
    public Long getSoilID() {
        return soilID;
    }

    public void setSoilID(Long soilID) {
        this.soilID = soilID;
    }

    public Double getMinSoil() {
        return minSoil;
    }

    public void setMinSoil(Double minSoil) {
        this.minSoil = minSoil;
    }

    public Double getMaxSoil() {
        return maxSoil;
    }

    public void setMaxSoil(Double maxSoil) {
        this.maxSoil = maxSoil;
    }

    public String getSoilLevel() {
        return soilLevel;
    }

    public void setSoilLevel(String soilLevel) {
        this.soilLevel = soilLevel;
    }

    public List<PlantRequirement>  getPlantRequirement() {
        return plantRequirement;
    }

    public void setPlantRequirement(List<PlantRequirement>  plantRequirement) {
        this.plantRequirement = plantRequirement;
    }
}
