/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author user
 */
public class Tester {
    
    //static int compare;
    static int l;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner B=new Scanner(System.in);
        System.out.println("Turns:");
        int t=B.nextInt();
        System.out.println("Depth:");
        int d=t*2;
        System.out.println(d);
        System.out.println("Branches:");
        int b=3;
        System.out.println(b);
        System.out.println("Tesrminal states:");
        double ts=Math.pow(b, d);
        System.out.println(ts);
        System.out.println("Before Pruning Comparison : "+ ts);
        
        l=0;
        //compare=0;
        Pruning P=new Pruning();
        P.minmax(0,121,b,d,true,l);
       
        
    }
    
}
