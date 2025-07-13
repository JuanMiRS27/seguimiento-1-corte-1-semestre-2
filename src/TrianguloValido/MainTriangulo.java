package TrianguloValido;

import java.util.Scanner;

public class MainTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.println("[Bienvenido, Ingrese los 3 Angulos de su Triangulo]");
        System.out.println("[Ingrese el valor del primer angulo: ]");
        triangulo.angulo1 = input.nextInt();
        System.out.println("[Ingrese el valor del segundo angulo: ]");
        triangulo.angulo2 = input.nextInt();
        System.out.println("[Ingrese el valor del tercer angulo: ]");
        triangulo.angulo3 = input.nextInt();

        System.out.println("[El Triangulo es: " + triangulo.calcularAngulo() + " ]");
    }
}
