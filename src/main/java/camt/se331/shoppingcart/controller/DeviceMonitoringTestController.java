package camt.se331.shoppingcart.controller;

import camt.se331.shoppingcart.entity.DeviceMonitoringTest;
import camt.se331.shoppingcart.service.DeviceMonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by USER on 6/13/2015.
 */
@RestController
@RequestMapping("/")
public class DeviceMonitoringTestController {
    @Autowired
    DeviceMonitoringService DeviceMonitoringTestService;

    @RequestMapping(value = "DeviceMonitoringTest",method = RequestMethod.GET)
    public List<DeviceMonitoringTest> list(){
        return DeviceMonitoringTestService.getDeviceMonitoringTests();
    }


    @RequestMapping(value = "getDeviceMonitoringTest",method = RequestMethod.GET)
    public  List<DeviceMonitoringTest> getListByName(@RequestParam("name")String name){
        return DeviceMonitoringTestService.getDeviceMonitoringTestsByName(name);
    }
    @RequestMapping(value = "DeviceMonitoringTest",method = RequestMethod.POST)
    public @ResponseBody
    DeviceMonitoringTest add(@RequestBody DeviceMonitoringTest DeviceMonitoringTest, BindingResult bindingResult){
        return DeviceMonitoringTestService.addDeviceMonitoringTest(DeviceMonitoringTest);
    }

    @RequestMapping(value = "DeviceMonitoringTest/{id}",method = RequestMethod.GET)
    public  DeviceMonitoringTest getDeviceMonitoringTest(@PathVariable("id") Long id){
        return DeviceMonitoringTestService.getDeviceMonitoringTest(id);
    }

    @RequestMapping(value = "DeviceMonitoringTest/{id}",method = RequestMethod.PUT)
    public  DeviceMonitoringTest edit(@PathVariable("id") Long id,@RequestBody DeviceMonitoringTest DeviceMonitoringTest, BindingResult bindingResult){
        return DeviceMonitoringTestService.updateDeviceMonitoringTest(DeviceMonitoringTest);
    }

    @RequestMapping(value = "DeviceMonitoringTest/{id}",method = RequestMethod.DELETE)
    public  DeviceMonitoringTest edit(@PathVariable("id") Long id){
        return DeviceMonitoringTestService.deleteDeviceMonitoringTest(id);
    }
}

