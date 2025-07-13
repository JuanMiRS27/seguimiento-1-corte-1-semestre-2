package TrianguloValido;

public class Triangulo {
    public int angulo1;
    public int angulo2;
    public int angulo3;
    public int gradoTotal;

    public String calcularAngulo(){
        this.gradoTotal = this.angulo1+this.angulo2+this.angulo3;

        if (this.gradoTotal == 180){
            return "Valido";
        } else { return "Invalido";}
    }
}
