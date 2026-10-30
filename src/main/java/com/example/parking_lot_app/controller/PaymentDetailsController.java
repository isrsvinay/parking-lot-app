package com.example.parking_lot_app.controller;
import com.example.parking_lot_app.dao.PaymentDetails;
import com.example.parking_lot_app.dao.ParkingVehicleDetails;
import com.example.parking_lot_app.parking.ParkVehicleRequest;
import com.example.parking_lot_app.service.PaymentDetailsService;
import com.example.parking_lot_app.utils.InMemoryCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/paymentDetails")
public class PaymentDetailsController {

    @Autowired
    private PaymentDetailsService paymentDetailsService;

    @GetMapping
    public PaymentDetails getPaymentDetailsService(@RequestBody ParkVehicleRequest parkVehicleRequest) {
        System.out.println("Inside PaymentDetails");
        List<ParkingVehicleDetails> parkingVehicleDetailsList = InMemoryCache.getVehicleDetailsList();
        for(ParkingVehicleDetails parkingVehicleDetails : parkingVehicleDetailsList){
            if((parkingVehicleDetails.getVehicleType()==parkVehicleRequest.getVehicleType()) && (parkingVehicleDetails.getVehicleNumber() == parkVehicleRequest.getVehicleNumber())){
                return paymentDetailsService.getPaymentDetails(parkingVehicleDetails);
            }
        }
        return null;
    }

    @PostMapping
    public PaymentDetails addPaymentDetailsService(@RequestBody PaymentDetails paymentDetails){
        System.out.println("Inside addPaymentDetails");
        return paymentDetailsService.addPaymentDetails(paymentDetails);
    }

    @DeleteMapping
    public boolean deletePaymentDetailsService(@RequestBody ParkVehicleRequest parkVehicleRequest ) {
        List<ParkingVehicleDetails> parkingVehicleDetailsList = InMemoryCache.getVehicleDetailsList();
        for (ParkingVehicleDetails parkingVehicleDetails : parkingVehicleDetailsList) {
            if ((parkingVehicleDetails.getVehicleType() == parkVehicleRequest.getVehicleType()) && (parkingVehicleDetails.getVehicleNumber() == parkVehicleRequest.getVehicleNumber())) {
                return paymentDetailsService.deletePaymentDetails(parkingVehicleDetails);
            }
        }
        return false;
    }
}
