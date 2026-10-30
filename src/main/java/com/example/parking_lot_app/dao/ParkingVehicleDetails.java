package com.example.parking_lot_app.dao;
import java.time.LocalDateTime;


import com.example.parking_lot_app.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ParkingVehicleDetails {

    private int id;
    private LocalDateTime inTime;
    private LocalDateTime outTime;
    private float priceToPay;
    private VehicleType vehicleType;
    private String vehicleNumber;
    private int slotId;

}
