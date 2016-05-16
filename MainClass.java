/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rupak
 */
public class MainClass {
    public static void main(String[] args) {
        Element ob = new Element();
        new Producer(ob, "Producer");
        new Producer(ob, "Producer2");
        new Consumer(ob, "ob1");
        new Consumer(ob, "ob2");
    }
}
