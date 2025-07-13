package Gimnasio;

import java.util.Scanner;

public class MainGimnasio {
    public static void main(String[] args) {
        Gimnasio gimnasio  = new Gimnasio();
        Scanner sc = new Scanner(System.in);

        System.out.println("[Ingrese el plan de gimnasio elegido:]\n[1: 15 Dias]\n[2: 1 mes]\n[3: 3 meses]");
        gimnasio.mensualidad = sc.nextInt();
        if(gimnasio.calcularPrecio() == 0){
            System.out.println("[Plan Invalido]");
        } else {
            System.out.println("[El Precio de su Tarifa del Gimnasio es: " + gimnasio.calcularPrecio() + " ]");
        }
    }
}
