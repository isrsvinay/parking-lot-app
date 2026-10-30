package com.example.parking_lot_app.controller;

import com.example.parking_lot_app.dao.ParkingVehicleDetails;
import com.example.parking_lot_app.parking.ParkVehicleRequest;
import com.example.parking_lot_app.parking.ParkVehicleResponse;
import com.example.parking_lot_app.parking.UnParkVehicleRequest;
import com.example.parking_lot_app.parking.UnParkVehicleResponse;
import com.example.parking_lot_app.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/parking-lot")

public class ParkingLotController {

    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping(path = "/{slotId}")
    public ParkingVehicleDetails getVehicleDetails(@PathVariable int slotId){
        System.out.println("Inside VehicleDetails");
        return parkingLotService.getVehicleDetails(slotId);
    }

    @PostMapping("/park")
    public ParkVehicleResponse parkVehicle(@RequestBody ParkVehicleRequest parkVehicleRequest){
        System.out.println("Inside parkVehicle");
        return parkingLotService.parkVehicle(parkVehicleRequest);
    }

    @PostMapping("/unpark")
    public UnParkVehicleResponse unParkVehicle(@RequestBody UnParkVehicleRequest unParkVehicleRequest){
        System.out.println("Inside unParkVehicle");
        return parkingLotService.unParkVehicle(unParkVehicleRequest);
    }

}
