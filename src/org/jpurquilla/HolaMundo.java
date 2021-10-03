package org.jpurquilla;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje();
        String nombre = mensaje.solicitaDatos("Escribe tu nombre: ");
        mensaje.saludar(nombre);

    }
}
