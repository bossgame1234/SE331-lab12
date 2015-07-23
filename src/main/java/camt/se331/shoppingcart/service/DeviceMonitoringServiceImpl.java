package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.dao.DeviceMonitoringTestDao;
import camt.se331.shoppingcart.entity.DeviceMonitoringTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by USER on 6/13/2015.
 */
@Service
public class DeviceMonitoringServiceImpl implements DeviceMonitoringService{
    @Autowired
    DeviceMonitoringTestDao deviceMonitoringTestDao;

    @Override
    public List<DeviceMonitoringTest> getDeviceMonitoringTests() {
        return deviceMonitoringTestDao.getDeviceMonitoringTests();
    }

    @Override
    public DeviceMonitoringTest getDeviceMonitoringTest(Long id) {
        return deviceMonitoringTestDao.getDeviceMonitoringTest(id);
    }

    @Override
    public DeviceMonitoringTest addDeviceMonitoringTest(DeviceMonitoringTest DeviceMonitoringTest) {
        return deviceMonitoringTestDao.addDeviceMonitoringTest(DeviceMonitoringTest);
    }

    @Override
    public DeviceMonitoringTest deleteDeviceMonitoringTest(Long id) {
        DeviceMonitoringTest deviceMonitoringTest =deviceMonitoringTestDao.getDeviceMonitoringTest(id);
        return deviceMonitoringTestDao.deleteDeviceMonitoringTest(deviceMonitoringTest);
    }

    @Override
    public DeviceMonitoringTest updateDeviceMonitoringTest(DeviceMonitoringTest DeviceMonitoringTest) {
        return deviceMonitoringTestDao.updateDeviceMonitoringTest(DeviceMonitoringTest);
    }

    @Override
    public List<DeviceMonitoringTest> getDeviceMonitoringTestsByName(String name) {
        return deviceMonitoringTestDao.getDeviceMonitoringTestsByName(name);
    }
}
