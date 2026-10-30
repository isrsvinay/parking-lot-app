package com.example.parking_lot_app.controller;

import com.example.parking_lot_app.dao.Organisation;
import com.example.parking_lot_app.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/organisation")
public class OrganisationController {

    @Autowired
    private OrganisationService organisationService;

    @GetMapping("/{orgId}")
    public Organisation getOrganisation(@PathVariable int orgId) {
        System.out.println("Inside getOrganisation");
        return organisationService.getOrganisationById(orgId);
    }

    @PostMapping
    public Organisation addOrganisation(@RequestBody Organisation organisation) {
        System.out.println("Inside addOrganisation");
        return organisationService.addOrganisation(organisation);
    }

    @PatchMapping("/{orgId}")
    public Organisation updateOrganisation(@PathVariable int orgId, @RequestParam String orgName) {
        System.out.println("Inside updateOrganisation");
        return organisationService.updateOrganisation(orgId, orgName);
    }

    @DeleteMapping("/{orgId}")
    public boolean deleteOrganisation(@PathVariable int orgId) {
        System.out.println("Inside deleteOrganisation");
        return organisationService.deleteOrganisation(orgId);
    }
}
