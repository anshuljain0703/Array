

import java.util.ArrayList;

public class Main {
    
    public static void main(String [] args){
        // Integer i=Integer.valueOf(9);
        // System.out.println(i);
        // Float f=Float.valueOf(7.4f);
        // System.out.println(f);
        ArrayList <Integer> l1=new ArrayList<>();
        //get elements 
        l1.add(5);
        l1.add(8);
        l1.add(9);
        // get elements at index i
        l1.get(1);
        //printing elements with loop
        // for(int i=0;i<l1.size();i++){
        //     System.out.println(l1.get(i));
        // }
        //print directly
        System.out.println(l1);

        //add at index i
        l1.add(1,6);
        System.out.println(l1);

        //modify element at index
        l1.set(3,10);
        System.out.println(l1);
        //remove at idx
        l1.remove(1);
        System.out.println(l1);
        //remove element 
        l1.remove(Integer.valueOf(5));
        System.out.println(l1);

    //checking if element exists
    System.out.println(l1.contains(Integer.valueOf(8)));

  


    }
    
}

