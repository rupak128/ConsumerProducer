/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rupak
 */
public class Element {
    
    int A[] = new int[20];
    int size = 0;
    int flag = 1;//array is empty
    
    
    synchronized void get(String str)
    {
        while(flag == 1)
        {
            System.out.println("Array is empty :(");
            System.out.println("Waiting to produce :)");
            try{
                wait();
            }catch(InterruptedException e)
            {
                System.out.println("Error");
            }
            
        }
        System.out.println(str +"Got : " + size );
        size--;
        if(size != 0)
        {
            flag = 2;//Array is not empty nor full
        }
        else
        {
            flag = 1;//Array is empty
        }
        notifyAll();
    }
    
    synchronized void put(String str)
    {
        while(flag == 3)
        {
            System.out.println("Array is full :)");
            try{
                wait();
            }catch(InterruptedException e)
            {
                System.out.println("Error");
            }
        }
        A[size] = size+1;
        size++;
        if(size == 20)
        {
            flag = 3;//Array is full
        }
        else 
            flag = 2;
        System.out.println(str +"Put : "+ size);
        notifyAll();            
    }    
}
