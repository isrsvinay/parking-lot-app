package com.example.parking_lot_app.parking;

import com.example.parking_lot_app.enums.VehicleType;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ParkVehicleRequest {
    private int orgId;
    private VehicleType vehicleType;
    private String vehicleNumber;

}
