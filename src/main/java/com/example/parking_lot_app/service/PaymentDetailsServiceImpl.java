package com.example.parking_lot_app.service;

import com.example.parking_lot_app.dao.PaymentDetails;
import com.example.parking_lot_app.dao.ParkingVehicleDetails;
import com.example.parking_lot_app.utils.InMemoryCache;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService {


    @Override
    public PaymentDetails addPaymentDetails(PaymentDetails paymentDetails) {
        List<PaymentDetails> paymentDetailsList = InMemoryCache.getPaymentDetailsList();
        paymentDetailsList.add(paymentDetails);
        return paymentDetails;
    }

    @Override
    public boolean deletePaymentDetails(ParkingVehicleDetails parkingVehicleDetails) {
        List<PaymentDetails> paymentDetailsList = InMemoryCache.getPaymentDetailsList();
        for(PaymentDetails paymentDetails : paymentDetailsList){
            if(paymentDetails.getVehicleDetails() == parkingVehicleDetails){
                paymentDetailsList.remove(paymentDetails);
                return true;
            }
        }
        return false;
    }

    @Override
    public PaymentDetails updatePaymentDetails(PaymentDetails paymentDetails) {
        List<PaymentDetails> paymentDetailsList = InMemoryCache.getPaymentDetailsList();

        return paymentDetails;
    }

    @Override
    public PaymentDetails getPaymentDetails(ParkingVehicleDetails parkingVehicleDetails) {
        List<PaymentDetails> paymentDetailsList = InMemoryCache.getPaymentDetailsList();
        for(PaymentDetails paymentDetails : paymentDetailsList){
            if(paymentDetails.getVehicleDetails() == parkingVehicleDetails){
                return paymentDetails;
            }
        }

        return null;
    }
}
