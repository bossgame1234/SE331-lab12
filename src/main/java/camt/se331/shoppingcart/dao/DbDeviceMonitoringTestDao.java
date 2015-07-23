package camt.se331.shoppingcart.dao;
import camt.se331.shoppingcart.entity.DeviceMonitoringTest;
import camt.se331.shoppingcart.repository.DeviceMonitoringTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by USER on 6/13/2015.
 */
@Repository
public class DbDeviceMonitoringTestDao implements DeviceMonitoringTestDao {
@Autowired
DeviceMonitoringTestRepository deviceMonitoringTestRepository;

    @Override
    public List<DeviceMonitoringTest> getDeviceMonitoringTests() {
        return deviceMonitoringTestRepository.findAll();
    }

    @Override
    public List<DeviceMonitoringTest> getDeviceMonitoringTestsByName(String name) {
        return null;
    }

    @Override
    public DeviceMonitoringTest getDeviceMonitoringTest(Long id) {
        return deviceMonitoringTestRepository.findOne(id);
    }

    @Override
    public DeviceMonitoringTest addDeviceMonitoringTest(DeviceMonitoringTest DeviceMonitoringTest) {
        return deviceMonitoringTestRepository.save(DeviceMonitoringTest);
    }

    @Override
    public DeviceMonitoringTest deleteDeviceMonitoringTest(DeviceMonitoringTest DeviceMonitoringTest) {
        deviceMonitoringTestRepository.delete(DeviceMonitoringTest.getDeviceId());
        DeviceMonitoringTest.setDeviceId(null);
        return DeviceMonitoringTest;
    }

    @Override
    public DeviceMonitoringTest updateDeviceMonitoringTest(DeviceMonitoringTest DeviceMonitoringTest) {
        return deviceMonitoringTestRepository.save(DeviceMonitoringTest);
    }
}
