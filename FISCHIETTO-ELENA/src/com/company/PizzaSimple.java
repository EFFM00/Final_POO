package com.company;

public class PizzaSimple extends Pizza{

    private Double precioBase;
    private Boolean esGrande;

    public PizzaSimple(String nombre, String descripcion, Double precioBase, Boolean esGrande) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esGrande = esGrande;
    }

    @Override
    public Double calcularPrecio() {
        if(esGrande){
            precioBase = precioBase * 2;
        }

        return precioBase;
    }
}
