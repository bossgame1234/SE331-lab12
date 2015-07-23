package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.DeviceMonitoringTest;

import java.util.List;

/**
 * Created by USER on 6/13/2015.
 */
public interface DeviceMonitoringService {
    List<DeviceMonitoringTest> getDeviceMonitoringTests();
    DeviceMonitoringTest getDeviceMonitoringTest(Long id);
    DeviceMonitoringTest addDeviceMonitoringTest(DeviceMonitoringTest DeviceMonitoringTest);
    DeviceMonitoringTest deleteDeviceMonitoringTest(Long id);
    DeviceMonitoringTest updateDeviceMonitoringTest(DeviceMonitoringTest DeviceMonitoringTest);
    List<DeviceMonitoringTest> getDeviceMonitoringTestsByName(String name);
}
