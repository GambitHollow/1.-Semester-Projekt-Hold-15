/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul;

/**
 *
 * @author bytof
 */
public class Food extends Items {

    private final int hungerRegen; //for regenerating health upon use
    private final int thirstRegen; //for regenerating thirst upon use

    public Food(String name, int hunger, int thirst) {
        this.hungerRegen = hunger;
        this.thirstRegen = thirst;
        this.name = name;
    }

}
