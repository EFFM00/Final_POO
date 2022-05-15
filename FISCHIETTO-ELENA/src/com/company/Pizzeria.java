package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<Pizza> listadoMenu;

    public Pizzeria() {
        this.listadoMenu = new ArrayList<>();
    }

    public void mostrarMenu(){
        for (Pizza pizza: listadoMenu){
            System.out.println(pizza);
        }
    }

    public void agregarPizza(Pizza pizza){
        listadoMenu.add(pizza);
    }
}
