package com.lee.state;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;
        String location = "xd";
        int count = 1000;

        try {
            gumballMachineRemote = new GumballMachine(location, count);

            Naming.rebind("gumballmachine", gumballMachineRemote);

        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
