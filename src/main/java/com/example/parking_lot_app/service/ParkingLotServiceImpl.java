package com.example.parking_lot_app.service;


import com.example.parking_lot_app.dao.ParkingVehicleDetails;
import com.example.parking_lot_app.dao.SlotCapacity;
import com.example.parking_lot_app.dao.SlotStatus;
import com.example.parking_lot_app.enums.VehicleType;
import com.example.parking_lot_app.parking.ParkVehicleRequest;
import com.example.parking_lot_app.parking.ParkVehicleResponse;
import com.example.parking_lot_app.parking.UnParkVehicleRequest;
import com.example.parking_lot_app.parking.UnParkVehicleResponse;
import com.example.parking_lot_app.utils.InMemoryCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.time.Duration;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

    @Autowired
    private SlotCapacityService slotCapacityService;

    @Override
    public ParkingVehicleDetails getVehicleDetails(int slotId){
        List<ParkingVehicleDetails> parkingVehicleDetailsList = InMemoryCache.getVehicleDetailsList();
        for(ParkingVehicleDetails parkingVehicleDetails : parkingVehicleDetailsList){
            if(parkingVehicleDetails.getSlotId() == slotId){
                return parkingVehicleDetails;
            }
        }return null;
    }
    @Override
    public ParkVehicleResponse parkVehicle(ParkVehicleRequest parkVehicleRequest){
        LocalDateTime currentTime = LocalDateTime.now();
        Random random = new Random();
        SlotCapacity slotCapacity = new SlotCapacity();
        List<ParkingVehicleDetails> parkVehicleList = InMemoryCache.getVehicleDetailsList();
        slotCapacity = slotCapacityService.getSlotCapacityDetailsByVehicleType(parkVehicleRequest.getOrgId(),parkVehicleRequest.getVehicleType());
        int vehicleCapacity = slotCapacity.getVehicleCapacity();
        int slotId = random.nextInt(1,vehicleCapacity) + 1;
        int id = random.nextInt(1000);

        List<SlotStatus> slotStatusList= InMemoryCache.getSlotStatusList();

        ParkingVehicleDetails parkingVehicleDetails = new ParkingVehicleDetails();
        parkingVehicleDetails.setId(id);
        parkingVehicleDetails.setInTime(currentTime);
        parkingVehicleDetails.setSlotId(slotId);
        parkingVehicleDetails.setVehicleNumber(parkVehicleRequest.getVehicleNumber());
        parkingVehicleDetails.setVehicleType(parkVehicleRequest.getVehicleType());
        parkVehicleList.add(parkingVehicleDetails);

        ParkVehicleResponse parkVehicleResponse = new ParkVehicleResponse();
        parkVehicleResponse.setInTime(currentTime);
        parkVehicleResponse.setSlotId(slotId);
        parkVehicleResponse.setVehicleNumber(parkVehicleRequest.getVehicleNumber());
        parkVehicleResponse.setVehicleType(parkVehicleRequest.getVehicleType());
        return parkVehicleResponse;
    }

    @Override
    public UnParkVehicleResponse unParkVehicle(UnParkVehicleRequest unParkVehicleRequest){
        LocalDateTime currentTime = LocalDateTime.now();
        SlotCapacity slotCapacity = new SlotCapacity();
        UnParkVehicleResponse unParkVehicleResponse = new UnParkVehicleResponse();
        int orgId = unParkVehicleRequest.getOrgId();
        slotCapacity = slotCapacityService.getSlotCapacityDetailsByVehicleType(orgId,unParkVehicleRequest.getVehicleType());
        List<ParkingVehicleDetails> parkVehicleList = InMemoryCache.getVehicleDetailsList();
        for(ParkingVehicleDetails parkingVehicleDetails : parkVehicleList){
            if((parkingVehicleDetails.getVehicleType() == unParkVehicleRequest.getVehicleType()) && (parkingVehicleDetails.getVehicleNumber() == unParkVehicleRequest.getVehicleNumber())){
                parkingVehicleDetails.setOutTime(currentTime);
                unParkVehicleResponse.setOutTime(currentTime);
                unParkVehicleResponse.setInTime(parkingVehicleDetails.getInTime());
                Duration duration = Duration.between(parkingVehicleDetails.getInTime(), parkingVehicleDetails.getOutTime());
                parkingVehicleDetails.setPriceToPay((duration.toHours())*(slotCapacity.getPricePerHour()));

                //todo slotStatus update

                unParkVehicleResponse.setPriceToPay((duration.toHours())*(slotCapacity.getPricePerHour()));
                unParkVehicleResponse.setVehicleType(unParkVehicleRequest.getVehicleType());
                unParkVehicleResponse.setVehicleNumber(unParkVehicleRequest.getVehicleNumber());
                return unParkVehicleResponse;
            }
        }
        return null;
    }

    @Override
    public boolean deleteVehicleDetails(int slotId) {
        List<ParkingVehicleDetails> parkingVehicleDetailsList = InMemoryCache.getVehicleDetailsList();
        for(ParkingVehicleDetails parkingVehicleDetails : parkingVehicleDetailsList){
            if(parkingVehicleDetails.getSlotId() == slotId){
                parkingVehicleDetailsList.remove(parkingVehicleDetails);
                return true;
            }
        }
        return false;
    }

    @Override
    public ParkingVehicleDetails updateVehicleDetails(ParkingVehicleDetails parkingVehicleDetails) {
        List<ParkingVehicleDetails> parkingVehicleDetailsList = InMemoryCache.getVehicleDetailsList();


        return null;
    }
}
