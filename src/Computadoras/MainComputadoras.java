package Computadoras;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainComputadoras {
    public static void main(String[] args) {
        Computadoras computadoras = new Computadoras();
        Scanner sc = new Scanner(System.in);

        System.out.println("[Ingrese [1: si] o [2: no] dependiendo de la reaccion que tiene su Computadora para determinar su estado]");
        System.out.println("[Su Computadora emite un pitido al Iniciarse]");
        computadoras.pitido = sc.nextInt();
        System.out.println("[La unidad de Disco Duro de su computadora gira?]");
        computadoras.disco = sc.nextInt();

        System.out.println("[ " + computadoras.llamarResultado() + " ]");
    }
}
