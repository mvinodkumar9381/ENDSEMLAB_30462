package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        Device device = new Device();
        device.setBrand("Generic Brand");
        device.setModel("Generic Model");
        device.setPrice(150.0);
        session.save(device);

        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 15");
        smartphone.setPrice(1200.0);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution(48);
        session.save(smartphone);

        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S9");
        tablet.setPrice(900.0);
        tablet.setScreenSize(11.0);
        tablet.setBatteryLife(14);
        session.save(tablet);

        session.getTransaction().commit();
        session.close();
        factory.close();
        System.out.println("Records inserted successfully!");
    }
}
