/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author gerson
 */
public class factorial {
     public static int FactorialN(int n)
    {
       int acum=1;
      
       while(n>0)
       {
           acum=acum*n;
           n--;
       }
       
        n=acum;
        return n;
    }
    
}
