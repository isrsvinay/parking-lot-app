package com.example.parking_lot_app.dao;

public class PaymentDetails {
    private String paymentMode;
    private long paymentId;
    private boolean paymentStatus;
    private ParkingVehicleDetails parkingVehicleDetails;

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public ParkingVehicleDetails getVehicleDetails() {
        return parkingVehicleDetails;
    }

    public void setVehicleDetails(ParkingVehicleDetails parkingVehicleDetails) {
        this.parkingVehicleDetails = parkingVehicleDetails;
    }
}
