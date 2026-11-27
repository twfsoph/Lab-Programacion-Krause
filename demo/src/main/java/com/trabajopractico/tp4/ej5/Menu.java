package main.java.com.trabajopractico.tp4.ej5;

public class Menu {
    private String diaSemana;
    private int caloriasTotales;

    public Menu(String diaSemana, int caloriasTotales) {
        this.diaSemana = diaSemana;
        this.caloriasTotales = caloriasTotales;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getCaloriasTotales() {
        return caloriasTotales;
    }

    public void setCaloriasTotales(int caloriasTotales) {
        this.caloriasTotales = caloriasTotales;
    }
}
