/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famillieplanner;

/**
 *
 * @author cedricplouvier
 */

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Famillieplanner {


    /**
     * @param args the command line arguments
     */
    
    static User2 user;
    static ArrayList<User2> users = new ArrayList<>();
    static ArrayList<Taak> taken = new ArrayList<>();
    static ArrayList<Groep> groepen = new ArrayList<>();
    static JFrame beginscherm = new StartFrame(users,groepen);
    public static void main(String[] args) {
        beginscherm.setVisible(true);
        /*user = new User(); 
        user.meldAan();
        
        user.maakGroepAan();
         */       
                
    }
    
}
