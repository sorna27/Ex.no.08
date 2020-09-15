/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.no.pkg08;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class NewClass {

    public static void main(String[] arg)
    {
        String s;
        int n;
        Scanner o=new Scanner (System.in);
        System.out.println("enter the string:");
        //getting the string from the user
        s=o.next();
        //finding the length of the string
        n=s.length();
        char[] ar = s.toCharArray();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               //checking the duplicate elements
               if(ar[i]==ar[j])
               {                   
                   for(int k=j;k<n-1;k++)
                   { 
                       //if duplicate deleting the element
                       ar[k]=ar[k+1];
                   }
                   //reducing the length of string
                   n--;
               }
            }           
        }
        //printing the output string
        for(int i=0;i<n;i++)
            System.out.print(ar[i]);
    }
}
