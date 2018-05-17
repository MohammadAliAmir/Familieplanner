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
public class Taak {
    private String persoon;
    private String beschrijving;
    private String deadline;
    private boolean volbracht;
    private int status=0;
    
    public Taak(String p, String b, String d)
    {
        persoon=p;
        deadline=d;
        beschrijving=b;
    }
    
    public void beeindigTaak()
    {
        volbracht=true;
        status=1;
    }
    
    public void printTaak()
    {
        System.out.println("Verantwoordelijke : "+persoon+"\nBeschrijving: "+beschrijving+"\nDeadline: "+deadline+"\nVolbracht: "+volbracht);
    }
    
    public String getBeschrijving()
    {
        return beschrijving;
    }
    
    public String getVerantwoordelijke()
    {
        return persoon;
    }
    
    public String getDeadline()
    {
        return deadline;
    }
    
    public int getStatus(){
        return status;
    }
}
