package com.example.parking_lot_app.controller;


import com.example.parking_lot_app.dao.SlotCapacity;
import com.example.parking_lot_app.service.SlotCapacityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "/slotCapacity")
public class SlotCapacityController {

    @Autowired
    private SlotCapacityService slotCapacityService;

    @GetMapping(path= "/{orgId}")
    public List<SlotCapacity> getSlotCapacityDetails(@PathVariable int orgId){
        System.out.println("Inside getSlotCapacity");
        return slotCapacityService.getSlotCapacityDetails(orgId);
    }

    @PostMapping("/{orgId}")
    public List<SlotCapacity> addSlotCapacityDetails(@PathVariable int orgId, @RequestBody List<SlotCapacity> slotCapacity){
        System.out.println("Inside addSlotCapacity");
        return slotCapacityService.addSlotCapacity(orgId,slotCapacity);

    }

    @DeleteMapping("/{orgId}")
    public boolean deleteSlotCapacityDetails(@PathVariable int orgId){
        System.out.println("Inside deleteSlotCapacity");
        return slotCapacityService.deleteSlotCapacity(orgId);
    }

    @PatchMapping("/{orgId}")
    public List<SlotCapacity> updateSlotCapacityDetails(@PathVariable int orgId, @RequestBody SlotCapacity slotCapacity){
        System.out.println("Inside updateSlotCapacity");
        return slotCapacityService.updateSlotCapacity(orgId,slotCapacity);
    }




}
