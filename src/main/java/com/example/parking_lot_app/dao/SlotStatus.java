package com.example.parking_lot_app.dao;


import com.example.parking_lot_app.enums.VehicleType;
import lombok.Data;

@Data
public class SlotStatus {

    private int id;
    private VehicleType vehicleType;
    private int availableSlots;
    private SlotCapacity slotCapacity;
}
