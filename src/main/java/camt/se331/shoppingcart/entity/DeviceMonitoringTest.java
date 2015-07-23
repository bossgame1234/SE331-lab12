package camt.se331.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by USER on 6/13/2015.
 */
@Entity
public class DeviceMonitoringTest {
    @Id
    @GeneratedValue
    Long id;
    Long deviceId;
    public DeviceMonitoringTest(){}
    Double humidity;
    Double temperature;
    Double soilMoisture;
    Double ligth;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(Double soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public Double getLigth() {
        return ligth;
    }

    public void setLigth(Double ligth) {
        this.ligth = ligth;
    }
}
