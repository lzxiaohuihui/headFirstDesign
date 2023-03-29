package com.lee.state;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String location = "rmi://127.0.0.1/gumballmachine";

        try {
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location);
            GumballMonitor gumballMonitor = new GumballMonitor(machine);
            gumballMonitor.report();
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            throw new RuntimeException(e);
        }


    }
}
