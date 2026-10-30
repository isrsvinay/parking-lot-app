package com.example.parking_lot_app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.parking_lot_app.dao.SlotCapacity;
import com.example.parking_lot_app.dao.SlotStatus;
import com.example.parking_lot_app.enums.VehicleType;
import com.example.parking_lot_app.utils.InMemoryCache;
import com.example.parking_lot_app.utils.Util;
import org.springframework.stereotype.Service;

@Service
public class SlotCapacityServiceImpl implements SlotCapacityService {

    @Override
    public List<SlotCapacity> getSlotCapacityDetails(int orgId){
        Map<Integer, List<SlotCapacity>> slotCapacityMap = InMemoryCache.getSlotCapacityList();
        return slotCapacityMap.get(orgId);
    }

    public SlotCapacity getSlotCapacityDetailsByVehicleType(int orgId, VehicleType vehicleType){
        Map<Integer, List<SlotCapacity>> slotCapacityMap = InMemoryCache.getSlotCapacityList();
        List<SlotCapacity> slotCapacityList = slotCapacityMap.get(orgId);
        for(SlotCapacity slotCapacity: slotCapacityList) {
            if(slotCapacity.getVehicleType() == vehicleType) {
                return slotCapacity;
            }
        }
        return null;
    }

    @Override
    public List<SlotCapacity> addSlotCapacity(int orgId, List<SlotCapacity> slotCapacityList) {
        Map<Integer, List<SlotCapacity>> slotCapacityMap = InMemoryCache.getSlotCapacityList();
        slotCapacityMap.put(orgId, slotCapacityList);

        List<SlotStatus> slotStatusList = new ArrayList<>();
        for(SlotCapacity slotCapacity: slotCapacityList) {
            SlotStatus slotStatus = new SlotStatus();
            slotStatus.setId(Util.getRand(1000));
            slotStatus.setVehicleType(slotCapacity.getVehicleType());
            slotStatus.setAvailableSlots(slotCapacity.getVehicleCapacity());
            slotStatus.setSlotCapacity(slotCapacity);
            slotStatusList.add(slotStatus);
        }
        InMemoryCache.setSlotStatusList(slotStatusList);

        return slotCapacityList;
    }


    @Override
    public boolean deleteSlotCapacity(int orgId){
        Map<Integer, List<SlotCapacity>> slotCapacityMap = InMemoryCache.getSlotCapacityList();
        return slotCapacityMap.remove(orgId) != null;
    }

    @Override
    public List<SlotCapacity> updateSlotCapacity(int orgId, SlotCapacity slotCapacity) {
        Map<Integer, List<SlotCapacity>> slotCapacityMap = InMemoryCache.getSlotCapacityList();
        List<SlotCapacity> slotCapacityList = slotCapacityMap.get(orgId);
        for(SlotCapacity slotCapacity1 : slotCapacityList) {
            if(slotCapacity1.getVehicleType() == slotCapacity.getVehicleType()) {
                slotCapacity1 = slotCapacity;
                return slotCapacityList;
            }
        }
        slotCapacityList.add(slotCapacity);
        return slotCapacityList;
    }



}
