/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author lekha
 */
public class Validation {
    private static Scanner sc  = new Scanner(System.in);
    public static int checkInputIntLimit(int min, int max){
        while(true){
            try {
                int result = sc.nextInt();
                if(result < min || result > max){
                    throw new NumberFormatException();
                   
                }
                sc.nextLine();
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be Input from "+min +"to"+ max);
                System.out.println("Enter again: ");
            }
        }
    }
      public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

   
    public static boolean checkInputYN() {
        System.out.print("Do you want to replace(Y/N)? ");
        while (true) {
            String result = checkInputString();
            
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
      public static boolean checkKeywordExist(HashMap<String, String> hm, String english) {
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            if (english.equalsIgnoreCase(mentry.getKey().toString())) {
                return false;
            }
        }
        return true;
    }
}
