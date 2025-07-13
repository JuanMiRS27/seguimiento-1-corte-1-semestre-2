package ModeloDefectuoso;

import java.util.Scanner;

public class MainDefecto {
    public static void main(String[] args) {
        Defecto defecto = new Defecto();
        Scanner sc = new Scanner(System.in);

        System.out.println("[Ingrese el modelo de su vehiculo]");
        defecto.modelo = sc.nextInt();

        System.out.println("[" + defecto.revisarModelo() + "]");
    }
}
