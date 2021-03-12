package br.com;

import java.rmi.RemoteException;

public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject implements Calculator{
    private static final long serialVersionUID = 6020996985114621408L;
    public CalculatorImpl() throws java.rmi.RemoteException{
        super();
    }

    public double add(double a, double b) throws RemoteException {
        return a+b;
    }

    public double sub(double a, double b) throws RemoteException {
        return a-b;
    }


    public double mul(double a, double b) throws RemoteException {
        return a*b;
    }

    public double div(double a, double b) throws RemoteException {
        return a/b;
    }
}
