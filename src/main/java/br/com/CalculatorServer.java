package br.com;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer implements Remote {
    public CalculatorServer(){
        try{
            Calculator c = new CalculatorImpl();
            LocateRegistry.createRegistry(4200);
            Naming.rebind("//localhost:4200/CalculatorService", c);

        }catch(Exception e) {
            System.out.println("Trouble: " + e);
        }
    }
    public static void main(String args[]){
        new CalculatorServer();
    }
}
