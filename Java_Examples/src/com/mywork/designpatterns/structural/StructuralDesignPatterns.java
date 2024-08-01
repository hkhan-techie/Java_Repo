package com.mywork.designpatterns.structural;

import com.mywork.designpatterns.structural.adapter.SocketAdapter;
import com.mywork.designpatterns.structural.adapter.SocketClassAdapterImpl;
import com.mywork.designpatterns.structural.adapter.SocketObjectAdapterImpl;
import com.mywork.designpatterns.structural.adapter.Volt;
import com.mywork.designpatterns.structural.bridge.*;
import com.mywork.designpatterns.structural.facade.FacadeClient;

import java.io.IOException;

public class StructuralDesignPatterns {
    public static void main(String[] args) {
        testFacadePattern();
        testClassAdapter();
        testObjectAdapter();
        testBridgePattern();
    }

    private static void testBridgePattern() {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }

    private static void testFacadePattern() {
        FacadeClient facadeClient = new FacadeClient();
        try {
            facadeClient.displayInput();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 12);
        Volt v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 12);
        Volt v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        return switch (i) {
            case 3 -> sockAdapter.get3Volt();
            case 12 -> sockAdapter.get12Volt();
            default -> sockAdapter.get120Volt();
        };
    }
}
