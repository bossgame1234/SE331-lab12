package camt.se331.shoppingcart.dao;


import camt.se331.shoppingcart.entity.DeviceMonitoringTest;

import java.util.List;

/**
 * Created by USER on 6/13/2015.
 */
public interface DeviceMonitoringTestDao {
    List<DeviceMonitoringTest> getDeviceMonitoringTests();
    List<DeviceMonitoringTest> getDeviceMonitoringTestsByName(String name);
    DeviceMonitoringTest getDeviceMonitoringTest(Long id);
    DeviceMonitoringTest addDeviceMonitoringTest(DeviceMonitoringTest DeviceMonitoringTest);
    DeviceMonitoringTest deleteDeviceMonitoringTest(DeviceMonitoringTest DeviceMonitoringTest);
    DeviceMonitoringTest updateDeviceMonitoringTest(DeviceMonitoringTest DeviceMonitoringTest);
}
