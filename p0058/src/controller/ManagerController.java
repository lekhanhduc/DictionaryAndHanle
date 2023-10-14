/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.FunctionDictionary;
import Repository.ManagerRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import view.Menu;

public class ManagerController {
    private FunctionDictionary dictionary;
    static String[] function = {"Add Word", "Delete Word", "Search", "DisPlayAllWord", "Exit"};
    private HashMap<String, String> data = new HashMap<String, String>();

    public void run() {
        Menu menu = new Menu("PROGRAMMING", function) {
        };
        Scanner sc = new Scanner(System.in);
        ManagerRepository mng = new ManagerRepository(data); 

        while (true) {
            menu.displayMenu();
            System.out.println("Enter Choice: ");
            int choice = menu.getUserChoice();
            switch (choice) {
                case 1:
                    mng.addNewWord(data); 
                    break;
                case 2:
                    mng.deleteWork(data); 
                    break;
                case 3:
                    mng.searchWork(data); 
                    break;
                case 4:
                    mng.disPlayAllWord(data);
                    break;
                    
                case 5:
                    return;
            }
        }
    }
}
