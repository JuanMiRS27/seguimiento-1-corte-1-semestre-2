package PositivoNegativo;

import javax.swing.*;
import java.util.Scanner;

public class PrincipalPositivo {
    public static void main(String[] args) {
        Positivo positivo = new Positivo();

        positivo.numero = Integer.parseInt(JOptionPane.showInputDialog("[Ingrese un Numero:]"));
        if(positivo.esPositivoNegativo()){
            System.out.println("[Es un Numero Positivo]");
            JOptionPane.showMessageDialog(null, "[Es un Numero Positivo]");
        } else {
            System.out.println("[Es un Numero Negativo]");
            JOptionPane.showMessageDialog(null, "[Es un Numero Negativo]");
        }
    }
}
