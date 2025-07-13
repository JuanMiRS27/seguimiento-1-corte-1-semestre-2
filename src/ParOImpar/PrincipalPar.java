package ParOImpar;

import java.util.Scanner;

public class PrincipalPar {
    public static void main(String[] args) {
        Par par = new Par();
        Scanner sc = new Scanner(System.in);
        System.out.println("[Ingrese un Numero:]");
        par.numero = sc.nextInt();
        if (par.esPar()){
            System.out.println("[Es un Numero Par]");
        } else {
            System.out.println("[Es un Numero Impar]");
        }
    }

}
