package AyudaAlcaldia;

public class Ayuda {
    public int genero;
    public int edad;

    public int calcularAyuda() {
        if (genero == 1) {
            return 40000;
        } else if (genero == 2) {
            if (edad > 50) {
                return 120000;
            } else if (edad >= 30 && edad <= 50) {
                return 100000;
            } else if (edad < 30) {
                return 0;
            }
        }
        return 0;
    }
}
