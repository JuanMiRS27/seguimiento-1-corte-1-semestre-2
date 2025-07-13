package AyudaAlcaldia;

import java.util.Scanner;

public class MainAyuda {
    public static void main(String[] args) {
        Ayuda ayuda = new Ayuda();
        Scanner sc = new Scanner(System.in);

        System.out.println("[Ingrese su genero:]\n [1: Maculino]\n [2: Femenino]");
        ayuda.genero = sc.nextInt();
        System.out.println("[Ingrese su edad:]");
        ayuda.edad = sc.nextInt();

        System.out.println("[La ayuda recibida es: " + ayuda.calcularAyuda() + "]");
    }
}
