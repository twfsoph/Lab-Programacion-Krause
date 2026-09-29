package main.java.com.trabajopractico.tp4.ej1;

public class Reserva {
    private String fecha;
    private String tipoDeporte;

    public Reserva(String fecha, String tipoDeporte) {
        this.fecha = fecha;
        this.tipoDeporte = tipoDeporte;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }
}
