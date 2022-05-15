package com.company;

public class PizzaFactory {

    private static PizzaFactory instance;

    private PizzaFactory() {
    }

    public static PizzaFactory getInstance(){
        if(instance==null){
            instance = new PizzaFactory();
        }

        return instance;
    }

    public Pizza hacerPizza(String pizzaMenu){
        switch (pizzaMenu){
            case "Muzzarella chica":
                return new PizzaSimple("Pizza de muzzarella chica", "Pizza de muzzarella", 700.0, false);

            case "Especial chica":
                return new PizzaSimple("Pizza Especial chica", "Pizza especial", 850.0, false);

            case "Ananá chica":
                return new PizzaSimple("Pizza de Ananá chica", "Pizza de ananá", 950.0, false);

            case "Combinada Loca":
                PizzaCombinada pizzaCombinadaLoca = new PizzaCombinada("Pizza Combinada Loca", "Pizza mitad especial" +
                        " y mitad " +
                        "ananá");
                pizzaCombinadaLoca.agregarPizza(new PizzaSimple("Pizza Especial chica", "Pizza especial", 850.0, false));
                pizzaCombinadaLoca.agregarPizza(new PizzaSimple("Pizza de Ananá chica", "Pizza de ananá", 950.0, false));
                return pizzaCombinadaLoca;

        }

        return null;
    }

}
