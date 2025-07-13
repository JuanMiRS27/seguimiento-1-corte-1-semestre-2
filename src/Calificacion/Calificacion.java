package Calificacion;

public class Calificacion {
    public int fisica;
    public int matematicas;
    public int quimica;
    public int biologia;
    public int informatica;
    public String calificacionser;

    public double calcularPorcentaje(){
        int suma = this.fisica + this.quimica + this.biologia + this.matematicas + this.informatica;
        return ((suma / 50.0) * 100);
    }

    public int calcularPromedio() {
        return (this.fisica + this.quimica + this.informatica + this.biologia + this.matematicas) / 5;
    }

    public String calcularCalificacion(){
        if (calcularPromedio() < 5.9) {
            calificacionser = "Mala";
        } else if (calcularPromedio() >= 6 && calcularPromedio() <= 8) {
            calificacionser = "Buena";
        } else if (calcularPromedio() >= 8 && calcularPromedio() <= 10) {
            calificacionser = "Excelente";
        } else {calificacionser = "Invalida";}
        return calificacionser;
    }



}
