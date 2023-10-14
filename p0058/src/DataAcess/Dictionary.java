package DataAcess;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.Validation;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author lekha
 */
public class Dictionary {

    private static Dictionary instance = null;

    public static Dictionary Instance() {
        if (instance == null) {
            synchronized (Dictionary.class) {
                if (instance == null) {
                    instance = new Dictionary();
                }
            }
        }
        return instance;
    }

    public void addNewWord(HashMap<String, String> hm) {
        System.out.println("Enter English: ");
        String english = Validation.checkInputString();
        if (!Validation.checkKeywordExist(hm, english)) {
            System.err.println("English Exits");
            return;
        }
        System.out.println("Enter Vietnamese: ");
        String vietnamese = Validation.checkInputString();
        hm.put(english, vietnamese);
        System.err.println("Add successfull");
    }

    public void deleteWord(HashMap<String, String> hm) {
        System.out.println("Enter English: ");
        String english = Validation.checkInputString();
        if(Validation.checkKeywordExist(hm, english)){
            System.err.println("Not Exits");  
            return;
        }
        hm.remove(english);
        System.err.println("Delete successfull");
    }

    public void searchWork(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = Validation.checkInputString();
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry entry : entries) {
            if (entry.getKey().equals(english)) {
                System.out.println("Vietnamese: " + entry.getValue());
                return;
            }
        }
        System.err.println("Not found in data");
    }

    public void disPlayAllWord(HashMap<String, String> hm) {
        if(hm.isEmpty()){
            System.err.println("Empty dictionary list");
            return;
        }
        System.err.println("All words in the dictionary:");
        for (HashMap.Entry<String, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            
                
            }
        }
    }

