package br.com;

public interface Calculator extends java.rmi.Remote {
    public double add(double a, double b) throws java.rmi.RemoteException;
    public double sub(double a, double b) throws java.rmi.RemoteException;
    public double mul(double a, double b) throws java.rmi.RemoteException;
    public double div(double a, double b) throws java.rmi.RemoteException;

}
