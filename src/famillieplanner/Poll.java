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
import java.util.ArrayList;

public class Poll {
    
    private String vraag;
    private String antwoord1;
    private String antwoord2;
    private String antwoord3;
    private ArrayList<User2> usersGestemd;
    private User2 user;
    
    int stem1=0;
    int stem2=0;
    int stem3=0;
    
    public Poll (String vraag, String antwoord1, String antwoord2, String antwoord3){
        this.vraag=vraag;
        this.antwoord1=antwoord1;
        this.antwoord2=antwoord2;
        this.antwoord3=antwoord3;
        usersGestemd= new ArrayList<User2>();
    }
    
    public String getVraag(){
        return vraag;
    }
    
    public void setVraag(String v){
        vraag=v;
    }
    
    public void setAntwoord1(String a1){
        antwoord1 = a1;  
    }
    
    public void setAntwoord2(String a2){
        antwoord2 = a2;
    }
    
    public void setAntwoord3(String a3){
        antwoord3 = a3;
    }
    
    public String getAntwoord1(){
        return antwoord1;
    }
    
    public String getAntwoord2(){
        return antwoord2;
    }
    
    public String getAntwoord3(){
        return antwoord3;
    }
    
    public void stem1(){
        stem1++;
    }
    
    public void stem2(){
        stem2++;
    }
    
    public void stem3(){
        stem3++;
    }
    
    public int getStem1(){
        return stem1;
    }
    
    public int getStem2(){
        return stem2;
    }
    
    public int getStem3(){
        return stem3;
    }
    
    public void voegGestemdToe(User2 user){
        usersGestemd.add(user);
    }
    
    public boolean nogNietGestemd(User2 user){
        boolean nietGestemd = true;
        for(User2 u : usersGestemd){
            nietGestemd = !u.equals(user);
        }
        return nietGestemd;
    }
     
}
