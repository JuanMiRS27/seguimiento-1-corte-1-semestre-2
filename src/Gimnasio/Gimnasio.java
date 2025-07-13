package Gimnasio;

public class Gimnasio {
    public int mensualidad;
    public int calcularPrecio(){
        if(mensualidad == 1){
            return 18000;
        } else if(mensualidad == 2){
            return 35000;
        } else if(mensualidad == 3){
            return 86000;
        } else {return 0;}
    }
}


