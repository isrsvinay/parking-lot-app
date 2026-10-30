package com.example.parking_lot_app.utils;

import java.util.Random;

public final class Util {

    public static int getRand(int a, int b) {
        Random rand = new Random();
        return rand.nextInt(a,b+1);
    }

    public static int getRand(int a) {
        Random rand = new Random();
        return rand.nextInt(1,a+1);
    }
}
