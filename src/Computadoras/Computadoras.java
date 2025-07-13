package Computadoras;

public class Computadoras {
    public int pitido;
    public int disco;
    public String llamarResultado(){if (pitido == 1){
        if (disco == 1){
            return "Póngase en contacto con el técnico apoyo";
        } else if (disco == 2){
            return "Verificar contactos de la unidad";
        }
    } else if (pitido == 2){
        if (disco == 1){
            return "Compruebe las conexiones de altavoces";
        } else if (disco == 2) {
            return "Traiga la computadora para repararla en la central.";
        }
    } return "Ingrese una respuesta valida";
} }
