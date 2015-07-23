package camt.se331.shoppingcart.entity;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;

/**
 * Created by USER on 6/1/2015.
 */
@Entity
public class MyPlant {
    @Id
    @GeneratedValue
    Long myPlantID;
    Long deviceID;
    public MyPlant(){}
    @ManyToOne
    User user;
    @OneToOne
    PlantProfile plantProfile;

    public Long getMyPlantID() {
        return myPlantID;
    }

    public void setMyPlantID(Long myPlantID) {
        this.myPlantID = myPlantID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PlantProfile getPlantProfile() {
        return plantProfile;
    }

    public void setPlantProfile(PlantProfile plantProfile) {
        this.plantProfile = plantProfile;
    }

    public Long getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(Long deviceID) {
        this.deviceID = deviceID;
    }
}
