package com.trabajopractico.tp7.ej2;

public class Main {
    public static void main(String[] args) {
        String[][] matriz = {
            {"El Principito", "9789504000044", "3200"},
            {"Donde viven los monstruos", "9789877381501", "2800"},
            {"Matilda", "9788420432885", "4500"},
            {"Charlie y la fábrica de chocolate", "9788420432878", "4500"},
            {"El árbol generoso", "9789877380125", "2600"},
            {"Harriet, la espía", "9788420401164", "5100"},
            {"El ratón que se comió la luna", "9788416648931", "2200"},
            {"Las aventuras de Pippi Mediaslargas", "9788420400891", "3900"},
            {"El mago de Oz", "9789504000815", "3500"},
            {"El hobbit", "9788445000687", "6200"}
        };
        Libro[] libros = new Libro[matriz.length];
        Biblioteca biblioteca = new Biblioteca();
        for (int i = 0; i < matriz.length; i++) {
            String titulo = matriz[i][0];
            String isbn = matriz[i][1];
            int paginas = Integer.parseInt(matriz[i][2]);

            libros[i] = new Libro(titulo, isbn, paginas);
        }
        for (Libro l : libros) {
            biblioteca.agregarLibro(l);
        }

        biblioteca.listarLibros();
        System.out.println("Cantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());
        System.out.println("El libro '" + libros[5].getTitulo() + "' tiene: " + libros[5].getCantidadPaginas() + " páginas.");
    }
}
