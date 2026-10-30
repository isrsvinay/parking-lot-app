package com.example.parking_lot_app.service;

import com.example.parking_lot_app.dao.SlotCapacity;
import com.example.parking_lot_app.enums.VehicleType;

import java.util.List;

public interface SlotCapacityService {
    public List<SlotCapacity> getSlotCapacityDetails(int orgId);
    public List<SlotCapacity> addSlotCapacity(int orgId, List<SlotCapacity> slotCapacity);
    public boolean deleteSlotCapacity(int orgId);
    public List<SlotCapacity> updateSlotCapacity(int orgId, SlotCapacity slotCapacity);
    public SlotCapacity getSlotCapacityDetailsByVehicleType(int orgId, VehicleType vehicleType);

}
