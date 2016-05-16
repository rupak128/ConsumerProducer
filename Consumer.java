/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rupak
 */
public class Consumer implements Runnable{

    Element ob;
    Thread t;
    String name;
    Consumer(Element ob, String str)
    {
        this.name = str;
        this.ob = ob;
        t = new Thread(this,"Consumer");
        t.start();
    }
   
    @Override
    public void run() {
        int i=0;
        while(true)
        {
            ob.get(name);
        }
    }    
}
