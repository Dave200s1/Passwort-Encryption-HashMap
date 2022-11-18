/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passwortgeneratorhashmap;

/**
 *
 * @author Admin
 */
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class Encrypt {
    
    static HashMap<String,String> container = new HashMap<String,String>();
    
    public static char Encrypt(String text, int key)
    {
        char chars[]=text.toCharArray();
        String str;
        String firstlettter;
        String secondletter;
        String thirdletter;
        String fourthletter;
        String fifthletter;
        String sixthletter;
        String seventhletter;
        System.out.print("Encrypted  ");
        for(char c : chars)
        {
            c+=key;
            System.out.print(c);
            
            for(int i = 0;i < text.length();i++)
            {
                firstlettter= String.valueOf(text.charAt(0));
                char firstletter_c[] = firstlettter.toCharArray();
                firstletter_c[0]+=key;
                
                String firstletter_cs = String.copyValueOf(firstletter_c);
                //------------------------------------------------------------
                secondletter= String.valueOf(text.charAt(1));
                char secondletter_c[] = secondletter.toCharArray();
                secondletter_c[0]+=key;
                String secondletter_cs = String.valueOf(secondletter_c);
                
                
                //-----------------------------------------------------------------
                thirdletter = String.valueOf(text.charAt(2));
                char thirdletter_c[]=thirdletter.toCharArray();
                thirdletter_c[0] +=key;
                String thirdletter_cs = String.valueOf(thirdletter_c);
                //------------------------------------------------------
                fourthletter = String.valueOf(text.charAt(3));
                char fourthletter_c[]=fourthletter.toCharArray();
                fourthletter_c[0] +=key;
                String fourthletter_cs = String.valueOf(fourthletter_c);
                //----------------------------------------------------
                fifthletter = String.valueOf(text.charAt(4));
                char fifthletter_c[]=fifthletter.toCharArray();
                fifthletter_c[0] +=key;
                String fifthletter_cs = String.valueOf(fifthletter_c);
                //--------------------------------------------------------
                sixthletter = String.valueOf(text.charAt(5));
                char sixthletter_c[]=sixthletter.toCharArray();
                sixthletter_c[0] +=key;
                String sixthletter_cs = String.valueOf(sixthletter_c);
                //------------------------------------------------------------
                seventhletter = String.valueOf(text.charAt(6));
                char seventhletter_c[]=seventhletter.toCharArray();
                seventhletter_c[0] +=key;
                String seventhletter_cs = String.valueOf(seventhletter_c);
                
                String full = firstletter_cs + secondletter_cs + thirdletter_cs
                      +  fourthletter_cs + fifthletter_cs + sixthletter_cs +
                        seventhletter_cs;
                container.put(text,full);
                
            }
        }

        System.out.print("\n");
        
        return 0;
    }
    
    public static char Decrypt(String text, int key)
    {
        char chars[]=text.toCharArray();
        String str;
        String firstlettter;
        String secondletter;
        String thirdletter;
        String fourthletter;
        String fifthletter;
        String sixthletter;
        String seventhletter;
        System.out.print("Decrypted  ");
        for(char c : chars)
        {
            c-=key;
            System.out.print(c);
            
            for(int i = 0;i < text.length();i++)
            {
                firstlettter= String.valueOf(text.charAt(0));
                char firstletter_c[] = firstlettter.toCharArray();
                firstletter_c[0]-=key;
                
                String firstletter_cs = String.copyValueOf(firstletter_c);
                //------------------------------------------------------------
                secondletter= String.valueOf(text.charAt(1));
                char secondletter_c[] = secondletter.toCharArray();
                secondletter_c[0]-=key;
                String secondletter_cs = String.valueOf(secondletter_c);
                
                
                //-----------------------------------------------------------------
                thirdletter = String.valueOf(text.charAt(2));
                char thirdletter_c[]=thirdletter.toCharArray();
                thirdletter_c[0] -=key;
                String thirdletter_cs = String.valueOf(thirdletter_c);
                //------------------------------------------------------
                fourthletter = String.valueOf(text.charAt(3));
                char fourthletter_c[]=fourthletter.toCharArray();
                fourthletter_c[0] -=key;
                String fourthletter_cs = String.valueOf(fourthletter_c);
                //----------------------------------------------------
                fifthletter = String.valueOf(text.charAt(4));
                char fifthletter_c[]=fifthletter.toCharArray();
                fifthletter_c[0] -=key;
                String fifthletter_cs = String.valueOf(fifthletter_c);
                //--------------------------------------------------------
                sixthletter = String.valueOf(text.charAt(5));
                char sixthletter_c[]=sixthletter.toCharArray();
                sixthletter_c[0] -=key;
                String sixthletter_cs = String.valueOf(sixthletter_c);
                //------------------------------------------------------------
                seventhletter = String.valueOf(text.charAt(6));
                char seventhletter_c[]=seventhletter.toCharArray();
                seventhletter_c[0] -=key;
                String seventhletter_cs = String.valueOf(seventhletter_c);
                
                String full = firstletter_cs + secondletter_cs + thirdletter_cs
                      +  fourthletter_cs + fifthletter_cs + sixthletter_cs +
                        seventhletter_cs;
                container.put(text,full);
                
            }
        }

        System.out.print("\n");
        
        return 0;
    }
    
    
    public static void main(String[]args)
    {
     
        //Encrypt("text",1);
        //Decrypt("ufyu",1);
        Encrypt("testABC",1);
        Encrypt("Samurai",1);
        Encrypt("Bonzai7",2);
        Decrypt("Dqp|ck9",2);
        System.out.println(container);
    }
}
