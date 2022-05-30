/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author nurul
 */
public class NightScenery extends Scenery {
    public NightScenery() {
        timeBehavior = new NightTime();
    }
    
    @Override
    public void display() {
        System.out.println("Right now is nightlight");
    }
}
