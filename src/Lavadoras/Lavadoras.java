package Lavadoras;
public class Lavadoras {
    public int tipoLavadora;
    public int cantidadLavadora;
    public int horasLavadora;

    public int calcularCostoLavadoras() {
        if (this.tipoLavadora == 1) {
            return this.cantidadLavadora * this.horasLavadora * 4000;
        } else if (this.tipoLavadora == 2) {
            return this.cantidadLavadora * this.horasLavadora * 3000;
        } else {
            return 0;
        }
    }
}
