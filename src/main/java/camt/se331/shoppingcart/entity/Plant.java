package camt.se331.shoppingcart.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by USER on 6/1/2015.
 */
@Entity
public class Plant {
    @Id
    @GeneratedValue
    Long plantID;
    String plantName;
    String scientificName;
    @OneToMany(mappedBy = "plant")
    List<PlantProfile> plantProfiles;
    @ManyToOne
    PlantType plantType;
    @OneToOne
    PlantRequirement plantRequirement;
    public Plant(){}
    public Long getPlantID() {
        return plantID;
    }

    public void setPlantID(Long plantID) {
        this.plantID = plantID;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }

    public PlantRequirement getPlantRequirement() {
        return plantRequirement;
    }

    public void setPlantRequirement(PlantRequirement plantRequirement) {
        this.plantRequirement = plantRequirement;
    }

    public List<PlantProfile> getPlantProfiles() {
        return plantProfiles;
    }

    public void setPlantProfiles(List<PlantProfile> plantProfiles) {
        this.plantProfiles = plantProfiles;
    }
}
