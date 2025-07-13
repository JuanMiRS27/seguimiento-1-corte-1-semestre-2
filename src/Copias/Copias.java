package Copias;

public class Copias {
    public int ccopias;
    public int calcularPrecio() {
        if (this.ccopias <= 499) {
        return 120;
    } else if (this.ccopias >= 500 && ccopias <= 749) {
        return 100;
    } else if (this.ccopias >= 750 && ccopias <= 999) {
        return 80;
    } else if (this.ccopias >= 1000) {
        return 50;
    } else {return 0;}
    }
        public int calcularPrecioFinal() {
        return this.ccopias * this.calcularPrecio();
    }
}
