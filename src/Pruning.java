/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * l<nd open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author user
 */
public class Pruning {
    static int compare;
    static int val;
    
    static Random r= new Random();
    
    
       
    
    public static int minmax(int n1,int n2,int branch,int depth,boolean flag,int l)
    {
        l++;
        int val=0;
        //System.out.println("l:"+l);
        //System.out.println("branch:"+branch);
        //System.out.println("depth:"+depth);
        
        if(flag==true)
        {
            if(l<depth)
            {
                
                for(int i=0;i<branch;i++)
                {
                    int j=minmax(n1,n2,branch,depth,false,l);
                    System.out.println("j : "+j);

                    if(n1<j)
                    {
                        n1=j;
                    }
                    if(i==0)
                    {
                       val=j;
                    }
                    else if(val<j)
                    {
                       val=j;
                    }
                    if(n1>=n2)
                    {
                        return val;
                    }
                
                }
             
               
               
            }
            else
            {

                for (int i = 0; i < branch; i++) {

                    int k=1+r.nextInt(120);
                    System.out.println(k);
                    compare++;
                    if(n1<k)
                    {
                        n1=k;
                        
                    }
                    if(i==0)
                    {
                       val=k;
                    }
                    else if(val<k)
                    {
                       val=k;
                    }
                    if(n1>=n2)
                    {
                       return val;
                    }
                    
                }
           
                
   
            
            }
        }
        else
        {
            if(l<depth)
            {
                for(int i=0;i<branch;i++){
                    int j=minmax(n1,n2,branch,depth,false,l);
                    if(n2>j)
                    {
                        n2=j;
                    }
                    if(i==0)
                    {
                        val=j;
                    }
                    else if(val>j)
                    {
                        val=j;
                    }
                    if(n1>=n2)
                    {
                        return val;
                    }
                }
              
               
            }
            else
            {

                for (int i = 0; i < branch; i++) {
                    int k=1+r.nextInt(120);
                    
                    System.out.println(k);
                    compare++;
                    if(k<n2)
                    {
                        n2=k;
                   
                    }
                    if(i==0)
                    {
                        val=k;
                    }
                    else if(val>k)
                    {
                        val=k;
                    }
                    if(n1>=n2)
                    {
                        return val;
                    }
                    
                }
               
   
            
            }
        }
        
       System.out.println("After Pruning Comparison : "+compare); 
       return val;
       
       
    
    }
   
    
}
