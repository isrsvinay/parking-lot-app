package com.example.parking_lot_app.service;

import com.example.parking_lot_app.dao.ParkingVehicleDetails;
import com.example.parking_lot_app.parking.ParkVehicleRequest;
import com.example.parking_lot_app.parking.ParkVehicleResponse;
import com.example.parking_lot_app.parking.UnParkVehicleRequest;
import com.example.parking_lot_app.parking.UnParkVehicleResponse;

public interface ParkingLotService {

    public ParkingVehicleDetails getVehicleDetails(int slotId);
    public ParkVehicleResponse parkVehicle(ParkVehicleRequest parkVehicleRequest);

    public UnParkVehicleResponse unParkVehicle(UnParkVehicleRequest unParkVehicleRequest);
    public boolean deleteVehicleDetails(int slotId);
    public ParkingVehicleDetails updateVehicleDetails(ParkingVehicleDetails parkingVehicleDetails);
}
