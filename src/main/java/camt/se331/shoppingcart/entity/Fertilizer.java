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
public class Fertilizer {
    @Id
    @GeneratedValue
    Long fertilizerID;
    Double minFertilizer;
    Double maxFertilizer;
    String fertilizerLevel;
    public Fertilizer(){}
    @OneToMany(mappedBy = "fertilizer")
    List<PlantRequirement> plantRequirement;

    public Long getFertilizerID() {
        return fertilizerID;
    }

    public void setFertilizerID(Long fertilizerID) {
        this.fertilizerID = fertilizerID;
    }

    public Double getMinFertilizer() {
        return minFertilizer;
    }

    public void setMinFertilizer(Double minFertilizer) {
        this.minFertilizer = minFertilizer;
    }

    public Double getMaxFertilizer() {
        return maxFertilizer;
    }

    public void setMaxFertilizer(Double maxFertilizer) {
        this.maxFertilizer = maxFertilizer;
    }

    public String getFertilizerLevel() {
        return fertilizerLevel;
    }

    public void setFertilizerLevel(String fertilizerLevel) {
        this.fertilizerLevel = fertilizerLevel;
    }

    public List<PlantRequirement>  getPlantRequirement() {
        return plantRequirement;
    }

    public void setPlantRequirement(List<PlantRequirement>  plantRequirement) {
        this.plantRequirement = plantRequirement;
    }
}
