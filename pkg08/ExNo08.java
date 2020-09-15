/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.no.pkg08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ExNo08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        int a,c=0;       
        Scanner o=new Scanner(System.in);
        System.out.println("enter the integer:");
        s=o.next();
        //splitting the string 
        char[] ar = s.toCharArray();
        for(char i:ar)
        {
            System.out.println(i);
            //changing char to int
            a=Character.getNumericValue(i);            
            //adding the numbers
            c=c+a;
        }
        System.out.println(c);   
    }
    
}
