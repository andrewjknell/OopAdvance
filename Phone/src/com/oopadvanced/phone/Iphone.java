package com.oopadvanced.phone;

public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return getRingTone();
    }
    @Override
    public String unlock() {
        String str = "unlocking with facial recognition";
        return str;
    }
    @Override
    public void displayInfo() {
        String className = this.getClass().getSimpleName();
        System.out.print(className + " "+getVersionNumber());
        System.out.println(" from  "+getCarrier());
    }
}
