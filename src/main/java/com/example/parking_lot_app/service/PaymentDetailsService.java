package com.example.parking_lot_app.service;

import com.example.parking_lot_app.dao.PaymentDetails;
import com.example.parking_lot_app.dao.ParkingVehicleDetails;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails(PaymentDetails paymentDetails);
    public boolean deletePaymentDetails(ParkingVehicleDetails parkingVehicleDetails);
    public PaymentDetails updatePaymentDetails(PaymentDetails paymentDetails);
    public PaymentDetails getPaymentDetails(ParkingVehicleDetails parkingVehicleDetails);
}
