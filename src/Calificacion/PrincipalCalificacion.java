package Calificacion;

import java.util.Scanner;

public class PrincipalCalificacion {
public static void main(String[] args) {
Calificacion calificacion = new Calificacion();

Scanner sc = new Scanner(System.in);
    System.out.println("[Ingrese la nota obtenida en Fisica]");
    calificacion.fisica = sc.nextInt();
    System.out.println("[Ingrese la nota obtenida en Quimica]");
    calificacion.quimica = sc.nextInt();
    System.out.println("[Ingrese la nota obtenida en Biologia]");
    calificacion.biologia = sc.nextInt();
    System.out.println("[Ingrese la nota obtenida en Matematicas]");
    calificacion.matematicas = sc.nextInt();
    System.out.println("[Ingrese la nota obtenida en Informatica]");
    calificacion.informatica = sc.nextInt();

    System.out.println("[El Porcentaje de su calificacion es: " + calificacion.calcularPorcentaje() + "% y su calificacion es: " + calificacion.calcularCalificacion());
}
}
