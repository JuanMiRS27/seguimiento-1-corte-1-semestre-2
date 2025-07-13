package Pago;

public class Nomina {
    public String nombre;
    public int numHoras;

public int calcularPrecioHoras(){
    if(this.numHoras > 1 && this.numHoras < 10){
        return 30000;
    }
    return 33000;
}
public int calcularTotalNomina(){
    return this.calcularPrecioHoras()*this.numHoras;
}
}
