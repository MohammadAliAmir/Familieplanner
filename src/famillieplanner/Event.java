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
import java.util.*;

public class Event {
    
    String naamEvent;
    String dag;
    String jaar;
    String maand;
    ArrayList<String> usersevent;
    int vanTijd;
    int totTijd;
    
    public Event(String naamEvent, String jaar, String maand,String dag, int vanTijd, int totTijd, ArrayList<String> usersevent){
        this.naamEvent=naamEvent;
        this.jaar=jaar;
        this.maand=maand;
        this.dag=dag;
        this.vanTijd=vanTijd;
        this.totTijd=totTijd;
        this.usersevent=usersevent;
    }
    
    public String getNaamEvent(){
        return naamEvent;
    }
    
    public String getJaar(){
        return jaar;
    }
    
    public String getMaand(){
        return maand;
    }
    
    public String getDag(){
        return dag;
    }
    
    public int getVanTijd(){
        return vanTijd;
    }
    
    public int getTotTijd(){
        return totTijd;
    }
    
    public String usersEvent(){
        String users="";
        for(String u : usersevent){
            users = users + u;
        }
        return users;
    }
    
    
    
}
