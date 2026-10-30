package com.example.parking_lot_app.dao;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Organisation {
    private String organisationName;
    private String branch;
    private int organisationId;

    @Override
    public String toString() {
        return "Organisation{" +
                "organisationName='" + organisationName + '\'' +
                ", branch='" + branch + '\'' +
                ", organisationId=" + organisationId +
                '}';
    }
}
