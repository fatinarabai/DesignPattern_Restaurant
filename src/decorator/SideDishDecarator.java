/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author User
 */
public abstract class SideDishDecarator extends Food{
    Food food;
    
    public SideDishDecarator(Food food){
        this.food = food;
    }
    
    public abstract String getDescription();
}
