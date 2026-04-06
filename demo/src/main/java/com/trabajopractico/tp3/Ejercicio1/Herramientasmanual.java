package com.trabajopractico.tp3;

public class Herramientasmanual extends Herramientas {
    
    private  String tipoEmpuñadura;
    
    public Herramientasmanual(int codigo, String marca, String tipoEmpuñadura) {
        super(codigo, marca);
        this.tipoEmpuñadura = tipoEmpuñadura;
    }
    public void setTipoEmpuñadura(String tipoEmpuñadura) {
        this.tipoEmpuñadura = tipoEmpuñadura;
    }
    public String getTipoEmpuñadura() {
        return tipoEmpuñadura;
    }
}
