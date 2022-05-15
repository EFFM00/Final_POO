package com.company;

public class Test {
    public static void main(String[] args) {

    PizzaFactory pizzaFactory = PizzaFactory.getInstance();



    Pizzeria pizzeria = new Pizzeria();
    pizzeria.agregarPizza(pizzaFactory.hacerPizza("Muzzarella chica"));
    pizzeria.agregarPizza(pizzaFactory.hacerPizza("Especial chica"));
    pizzeria.agregarPizza(pizzaFactory.hacerPizza("Ananá chica"));
    pizzeria.agregarPizza(pizzaFactory.hacerPizza("Combinada Loca"));



    pizzeria.mostrarMenu();

    }
}