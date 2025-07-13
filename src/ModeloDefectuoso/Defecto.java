package ModeloDefectuoso;

public class Defecto {
    public int modelo;
    public String revisarModelo(){if (this.modelo == 119 || this.modelo == 179 || this.modelo == 189 ||this.modelo ==  195 || this.modelo == 221 || this.modelo == 780){
        return "Su Vehiculo esta defectuoso, llevar a garantia";
    } else {
        return "Su Vehiculo no esta defectuoso";
    }}
}
