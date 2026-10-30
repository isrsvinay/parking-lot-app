package com.example.parking_lot_app.service;

import com.example.parking_lot_app.dao.Organisation;

import java.util.List;

public interface OrganisationService {

    public Organisation addOrganisation(Organisation organisation);
    public boolean deleteOrganisation(int organisationId);
    public Organisation updateOrganisation(int orgId, String orgName);
    public Organisation getOrganisationByName(String organisationName);
    public Organisation getOrganisationById(int organisationId);
    public List<Organisation> getAllOrganisations();
}
