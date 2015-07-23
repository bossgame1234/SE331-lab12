package camt.se331.shoppingcart.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by USER on 6/1/2015.
 */
public class MyPlantData {
    @Id
    @GeneratedValue
    Long myPlantDataID;
    @ManyToOne
    MyPlant myPlant;
    @OneToMany(mappedBy = "myPlantData")
    List<PlantData> plantData;

}
