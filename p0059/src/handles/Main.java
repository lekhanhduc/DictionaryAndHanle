/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handles;

/**
 *
 * @author lekha
 */
public class Main {
    public static void main(String[] args) {
          while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.findPersonInfo();
                    break;
                case 2:
                    Manager.coppyNewFile();
                    break;
                case 3:
                    return;
            }
        }
    }
}
