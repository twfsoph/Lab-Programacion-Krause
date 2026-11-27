package com.trabajopractico.tp8.ej1;
import java.util.ArrayList;

public class Mundial {
    private ArrayList<Seleccion> selecciones;

    public Mundial() {
        this.selecciones = new ArrayList<>();
    }

    public void agregarSeleccion(Seleccion s) {
        selecciones.add(s);
    }

    public void consultarSeleccionPorPosicion(int posicion) {
        try {
            Seleccion s = selecciones.get(posicion);
            System.out.println("Selección encontrada en la posición " + posicion + " " + s);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción capturada: La posición " + posicion + " no es válida. Rango disponible: 0 a " + (selecciones.size() - 1));
        } finally {
            System.out.println("Consulta finalizada");
        }
    }

    public void actualizarPuntosSeleccion(int posicion, String entradaPuntos) {
        try {
            Seleccion s = selecciones.get(posicion); 
            int nuevosPuntos = Integer.parseInt(entradaPuntos);
            s.setPuntos(nuevosPuntos);
            System.out.println("Puntos actualizados con éxito para " + s.getNombre() + ". Nuevos puntos: " + s.getPuntos());
        } catch (NumberFormatException e) {
            System.out.println("Excepción capturada: El valor '" + entradaPuntos + "' no es un número entero válido.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción capturada: No se pudo actualizar. Posición " + posicion + " fuera de rango.");
        } finally {
            System.out.println("Actualización finalizada");
        }
    }

    public void consultarDirectorTecnico(int posicion) {
        try {
            Seleccion s = selecciones.get(posicion);
            DirectorTecnico dt = s.getDt();
            if (dt == null) {
                throw new NullPointerException(); 
            }
            System.out.println("El DT de " + s.getNombre() + " es: " + dt.getNombre() + " (" + dt.getEdad() + " años)");
        } catch (NullPointerException e) {
            System.out.println("Excepción capturada: La selección no tiene un Director Técnico asignado.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción capturada: Posición de selección inválida.");
        } finally {
            System.out.println("Consulta de DT finalizada");
        }
    }

    public Seleccion getSeleccion(int posicion) {
        if (posicion >= 0 && posicion < selecciones.size()) {
            return selecciones.get(posicion);
        }
        return null;
    }
}
