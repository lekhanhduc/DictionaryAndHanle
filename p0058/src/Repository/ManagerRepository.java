/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lekha
 */
public class ManagerRepository implements FunctionDictionary{
    private HashMap<String , String> hm = new HashMap<String, String>();

    public ManagerRepository(HashMap<String, String> hm) {
    }
    @Override
    public void addNewWord(HashMap<String, String> hm) {
        Dictionary.Instance().addNewWord(hm);
    }

    @Override
    public void deleteWork(HashMap<String, String> hm) {
      Dictionary.Instance().deleteWord(hm);
    }

    @Override
    public void searchWork(HashMap<String, String> hm) {
        Dictionary.Instance().searchWork(hm);
    }

    @Override
    public void disPlayAllWord(HashMap<String, String> hm) {
        Dictionary.Instance().disPlayAllWord(hm);
    }
    
}
