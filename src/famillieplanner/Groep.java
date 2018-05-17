/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famillieplanner;

import java.util.ArrayList;

/**
 *
 * @author Yasin
 */
public class Groep {
    private String naam;
    private String beheerder;
    private ArrayList<Taak> taken;
    private ArrayList<User2> groepleden;
    private ArrayList<Poll> polls;
    private User2 admin;
    private ArrayList<Event> events;
    
    public Groep(String n, String b)
    {
        naam=n;
        beheerder=b;
        taken = new ArrayList<Taak>();
        groepleden= new ArrayList<User2>();
        polls = new ArrayList<Poll>();
        events = new ArrayList<Event>();
    }
    public String getNaam()
    {
        return naam;
    }
    public String getBeheerder()
    {
        return beheerder;
    }
    public ArrayList getTaken()
    {
        return taken;
    }
    
    public ArrayList getPolls(){
        return polls;
    }
    
    public ArrayList getEvents(){
        return events;
    }
    
    public void addToGroep(User2 u)
    {
        groepleden.add(u);
    }
    public void setAdmin(User2 u){
        admin = u;
    }
    
    public User2 getAdmin(){
        return admin;
    }
}
