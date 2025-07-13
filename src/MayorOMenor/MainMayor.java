package MayorOMenor;

import java.util.Scanner;

public class MainMayor {
    public static void main(String[] args) {
        Mayor mayor = new Mayor();
        Scanner sc = new Scanner(System.in);

        System.out.println("[Ingrese el primer numero:]");
        mayor.num1 = sc.nextInt();
        System.out.println("[Ingrese el segundo numero:]");
        mayor.num2 = sc.nextInt();
        System.out.println("[Ingrese el tercer numero:]");
        mayor.num3 = sc.nextInt();

        System.out.println("[El Numero mayor es: " + mayor.calcularMayor() + " ]");
    }
}
