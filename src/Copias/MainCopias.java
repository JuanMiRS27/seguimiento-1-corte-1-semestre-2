package Copias;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainCopias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Copias copias = new Copias();

        System.out.println("[Inserte el numero de copias que desea imrpimir:]");
        copias.ccopias = sc.nextInt();
        System.out.println("[Se van a imprimir " + copias.ccopias + " las cuales valen " + copias.calcularPrecio() + "$ por copia.");
        System.out.println("El Valor final por la impresión es " + copias.calcularPrecioFinal() + " ]");
    }
}
