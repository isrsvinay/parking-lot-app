package com.example.parking_lot_app.dao;


import com.example.parking_lot_app.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SlotCapacity {
    private VehicleType vehicleType;
    private int vehicleCapacity;
    private int pricePerHour;
    private int id;
    private Organisation organisation;

}
