package com.company;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<Pizza> listaPizzasSimples;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        listaPizzasSimples = new ArrayList<>();
    }

    @Override
    public Double calcularPrecio() {
        Double precioCombinada = 0.0;

        for (Pizza pizza: listaPizzasSimples){
            precioCombinada = precioCombinada + (pizza.calcularPrecio()/2);
        }
        return precioCombinada;
    }

    public void agregarPizza(Pizza pizza){
        listaPizzasSimples.add(pizza);
    }
}
