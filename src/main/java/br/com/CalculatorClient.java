package br.com;

import javax.swing.*;
import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args){
        try{
            Calculator c = (Calculator) Naming
                .lookup("//localhost:4200/CalculatorService");
            String opcao[] = { "+", "-", "*", "÷" };
            double a = 0  , b = 0 ;
            String valor1String = JOptionPane.showInputDialog("Digite o valor: ");
            try {
                if(valor1String == null){
                    JOptionPane.showMessageDialog(null, "Ação cancelada");
                    System.exit(1);
                }else{
                    a =  Double.parseDouble(valor1String);
                }

            } catch (Exception e) {
             }

            int operacao = JOptionPane.showOptionDialog(null, "Escolha uma das operações", "Tipo de operação", 0,
                    JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);

            String valor2String = JOptionPane.showInputDialog("Digite o 2º valor: ");
            try {
                if(valor2String == null){
                    JOptionPane.showMessageDialog(null, "Ação cancelada");
                    System.exit(1);
                }else{
                    b =  Double.parseDouble(valor2String);
                }
            } catch (Exception e) {

            }
            System.out.println(a + " " +opcao[operacao] + " " + b + " =");
            switch (opcao[operacao]) {
                case "+":
                    System.out.println(c.add(a, b));
                    break;
                case "-":
                    System.out.println(c.sub(a, b));

                    break;
                case "*":
                    System.out.println(c.mul(a, b));

                    break;
                case "÷":
                    System.out.println(c.div(a, b));

                default:
                    break;
            }


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
