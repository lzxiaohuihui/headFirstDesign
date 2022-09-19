package com.lee.order.devices;

public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + "Stereo is On");
    }

    public void setCD() {
        System.out.println(name + "Stereo set CD");
    }

    public void setVolume(int i) {
        System.out.println(name + "Stereo Volume set to " + i);
    }

    public void off() {
        System.out.println(name + "Stereo is Off");
    }

}
