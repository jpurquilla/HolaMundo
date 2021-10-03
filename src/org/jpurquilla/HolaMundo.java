package org.jpurquilla;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje();
        String nombre = mensaje.solicitaDatos("Escribe tu nombre: ");
        String apellido = mensaje.solicitaDatos("Escribe tu apellido");

        Persona p1 = new Persona(nombre,apellido);
        mensaje.saludar(p1);

    }
}
