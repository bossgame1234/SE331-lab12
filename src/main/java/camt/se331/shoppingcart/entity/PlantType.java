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
public class PlantType {
    @Id
    @GeneratedValue
    Long typeID;
    String typeName;
    @OneToMany(mappedBy = "plantType")
    List<Plant> plant;
    public PlantType(){}
    public Long getTypeID() {
        return typeID;
    }

    public void setTypeID(Long typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }
}
