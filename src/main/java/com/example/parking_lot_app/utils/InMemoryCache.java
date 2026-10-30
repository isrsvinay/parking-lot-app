package com.example.parking_lot_app.utils;

import com.example.parking_lot_app.dao.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class InMemoryCache {

    private static List<Organisation> organisationList = new ArrayList<>();

    private static Map<Integer, List<SlotCapacity>> slotCapacityList = new HashMap<>();

    private static List<SlotStatus> slotStatusList = new ArrayList<>();

    private static List<ParkingVehicleDetails> parkingVehicleDetailsList = new ArrayList<>();

    private static List<PaymentDetails> paymentDetailsList = new ArrayList<>();

   // private Integer x;

    public InMemoryCache() {
    }

    public static List<Organisation> getOrganisationList() {
        return organisationList;
    }

    public static void setOrganisationList(List<Organisation> organisationList) {
        InMemoryCache.organisationList = organisationList;
    }

    public static Map<Integer, List<SlotCapacity>> getSlotCapacityList() {
        return slotCapacityList;
    }

    public static void setSlotCapacityList(Map<Integer, List<SlotCapacity>> slotCapacityList) {
        InMemoryCache.slotCapacityList = slotCapacityList;
    }

    public static List<SlotStatus> getSlotStatusList() {
        return slotStatusList;
    }

    public static void setSlotStatusList(List<SlotStatus> slotStatusList) {
        InMemoryCache.slotStatusList = slotStatusList;
    }

    public static List<ParkingVehicleDetails> getVehicleDetailsList() {
        return parkingVehicleDetailsList;
    }

    public static void setVehicleDetailsList(List<ParkingVehicleDetails> parkingVehicleDetailsList) {
        InMemoryCache.parkingVehicleDetailsList = parkingVehicleDetailsList;
    }

    public static List<PaymentDetails> getPaymentDetailsList() {
        return paymentDetailsList;
    }

    public static void setPaymentDetailsList(List<PaymentDetails> paymentDetailsList) {
        InMemoryCache.paymentDetailsList = paymentDetailsList;
    }
}
