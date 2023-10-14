package Repository;


import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author lekha
 */
public interface FunctionDictionary {
    void addNewWord(HashMap<String, String> hm);
    void deleteWork(HashMap<String, String> hm);
    void searchWork(HashMap<String, String> hm);
    void disPlayAllWord(HashMap<String, String> hm);
}
