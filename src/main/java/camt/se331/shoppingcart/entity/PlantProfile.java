package camt.se331.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by USER on 6/1/2015.
 */
@Entity
public class PlantProfile {
    @Id
    @GeneratedValue
    Long pProfileID;
    String pProfileName;
    Date pDOB;
    @ManyToOne
    Plant plant;
    public PlantProfile(){}
    public Long getpProfileID() {
        return pProfileID;
    }

    public void setpProfileID(Long pProfileID) {
        this.pProfileID = pProfileID;
    }

    public String getpProfileName() {
        return pProfileName;
    }

    public void setpProfileName(String pProfileName) {
        this.pProfileName = pProfileName;
    }

    public Date getpDOB() {
        return pDOB;
    }

    public void setpDOB(Date pDOB) {
        this.pDOB = pDOB;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
}
