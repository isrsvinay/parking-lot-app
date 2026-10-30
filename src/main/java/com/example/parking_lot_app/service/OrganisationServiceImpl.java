package com.example.parking_lot_app.service;
import java.util.List;
import java.util.Random;

import com.example.parking_lot_app.dao.Organisation;
import com.example.parking_lot_app.utils.InMemoryCache;
import org.springframework.stereotype.Service;


@Service
public class OrganisationServiceImpl implements OrganisationService {

    @Override
    public Organisation addOrganisation(Organisation organisation) {
        Random rand = new Random();
        int num = rand.nextInt(1000);
        organisation.setOrganisationId(num);
        List<Organisation> organisationList = InMemoryCache.getOrganisationList();
        organisationList.add(organisation);

        return organisation;
    }

    @Override
    public boolean deleteOrganisation(int organisationId) {
        List<Organisation> organisationList = InMemoryCache.getOrganisationList();
        for(int i=0;i< organisationList.size(); i++){
            if(organisationList.get(i).getOrganisationId() == organisationId){
                organisationList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Organisation updateOrganisation(int orgId, String orgName) {
        List<Organisation> organisationList = InMemoryCache.getOrganisationList();
        for (Organisation organisation : organisationList) {
            if (organisation.getOrganisationId() == orgId) {
                organisation.setOrganisationName(orgName);
                return organisation;
            }
        }

        return null;
    }

    @Override
    public Organisation getOrganisationByName(String organisationName) {
        List<Organisation> organisationList = InMemoryCache.getOrganisationList();
        for (Organisation organisation : organisationList) {
            if (organisation.getOrganisationName() == organisationName) {
                return organisation;
            }
        }
        return null;
    }

    @Override
    public Organisation getOrganisationById(int organisationId) {
        List<Organisation> organisationList = InMemoryCache.getOrganisationList();
        for(int i = 0; i< organisationList.size(); i++){
            if(organisationList.get(i).getOrganisationId() == organisationId){
                return organisationList.get(i);
            }
        }

        return null;
    }

    @Override
    public List<Organisation> getAllOrganisations() {
        return InMemoryCache.getOrganisationList();
    }
}
