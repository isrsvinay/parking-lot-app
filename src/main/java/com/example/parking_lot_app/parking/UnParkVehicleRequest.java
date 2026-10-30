package com.example.parking_lot_app.parking;

import com.example.parking_lot_app.enums.VehicleType;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UnParkVehicleRequest {
    private int orgId;
    private VehicleType vehicleType;
    private String vehicleNumber;

}
