package Pago;

import java.util.Scanner;

public class PrincipalNomina {
    public static void main(String[] args) {
        Nomina nomina = new Nomina(); //Instancia
        Scanner sc = new Scanner(System.in);
        System.out.println("[Ingrese el nombre del Empleado:]");
        nomina.nombre = sc.nextLine();

        System.out.println("[Ingrese las horas trabajadas:]");
        nomina.numHoras = sc.nextInt();
        System.out.println("[El total a pagar:]" + nomina.calcularTotalNomina());
    }
}
