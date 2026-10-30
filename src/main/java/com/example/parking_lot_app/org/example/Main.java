package com.example.parking_lot_app.org.example;

import com.example.parking_lot_app.dao.Organisation;
import com.example.parking_lot_app.service.OrganisationService;
import com.example.parking_lot_app.service.OrganisationServiceImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//
//    private static OrganisationService organisationService;
//
//    public static void handleOrganisationInputs() {
//        System.out.println("Enter 1 to enter get organisation");
//        System.out.println("Enter 2 to enter add organisation");
//        System.out.println("Enter 3 to enter update organisation");
//        System.out.println("Enter 4 to enter delete organisation");
//        Scanner sc = new Scanner(System.in);
//        int orgInput = sc.nextInt();
//
//        switch (orgInput) {
//            case 1:
//                System.out.println("Please enter the organisation id");
//                int orgId = sc.nextInt();
//                Organisation getOrgDetails = organisationService.getOrganisationById(orgId);
//                System.out.println("Here is your organisation - " + getOrgDetails);
//                break;
//            case 2:
//                Organisation addOrgDetails = new Organisation();
//                System.out.println("Please enter the organisation Name");
//                addOrgDetails.setOrganisationName(sc.next());
//                System.out.println("Please enter the organisation branch");
//                addOrgDetails.setBranch(sc.next());
//                organisationService.addOrganisation(addOrgDetails);
//                break;
//            case 3:
//                System.out.println("Please enter the organisation id you want to update");
//                int updateOrgId = sc.nextInt();
//                System.out.println("please enter the new organisation name");
//                String updateOrgName = sc.next();
//                Organisation organisation = organisationService.updateOrganisation(updateOrgId, updateOrgName);
//                if(organisation == null) {
//                    System.out.println("Updation failed for orgId - " + updateOrgId);
//                }
//                else {
//                    System.out.println("Updation is successful - " + organisation);
//                }
//                break;
//
//            case 4:
//                System.out.println("Please enter the organisation id you want to delete");
//                int deleteOrgId = sc.nextInt();
//                boolean result = organisationService.deleteOrganisation(deleteOrgId);
//                if(result) {
//                    System.out.println("Deletion of organisation " + deleteOrgId + " is success");
//                }
//                else {
//                    System.out.println("Deletion of organisation " + deleteOrgId + " is failed");
//                }
//                break;
//
//            default:
//                System.out.println("Invalid input");
//        }
//    }

    static void main() {
//        organisationService = new OrganisationServiceImpl();
//        Scanner sc = new Scanner(System.in);
//        int input = 1;
//        while(input > 0) {
//            System.out.println("Welcome to parking lot!!!!!");
//            System.out.println("Enter 1 to enter menu for organisation");
//            System.out.println("Enter 2 to enter options for slot capacity");
//            System.out.println("Enter 3 to enter options for slot status");
//            System.out.println("Enter 4 to enter options for vehicle details");
//            System.out.println("Enter 5 to enter options for payment details");
//            input = sc.nextInt();
//            switch (input) {
//                case 1:
//                    handleOrganisationInputs();
//                    System.out.println("Organisation list - " + organisationService.getAllOrganisations());
//                    break;
//                case 2:
//                    System.out.println("slot capacity list - ");
//                    break;
//                case 3:
//                    System.out.println("slot status list - ");
//                    break;
//                case 4:
//                    System.out.println("vehicle details list -");
//                    break;
//                case 5:
//                    System.out.println("Payment details -");
//                    break;
//                default:
//                    System.out.println("Please enter valid input ");
//                    break;
//
//            }
//        }

    }
}
