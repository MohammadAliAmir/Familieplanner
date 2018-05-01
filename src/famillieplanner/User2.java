/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famillieplanner;

/**
 *
 * @author Yasin
 */
public class User2 {
    private String naam;
    private String passwoord;
    private boolean hasGroep=false;
    private String groepnaam;
    private boolean gestemd=false;
    
    public User2()
    {
        naam= new String();
        passwoord = new String();
    }
    
    public void setNaamEnPasswoord(String n, String p)
    {
        naam=n;
        passwoord=p;
    }
    
    public String getNaam()
    {
        return naam;
    }
    
    public String getPasswoord()
    {
        return passwoord;
    }
    
    public boolean hasGroep()
    {
        return hasGroep;
    }
    
    public void inGroepZetten()
    {
        hasGroep=true;
    }
    
    public void setGroepnaam(String g)
    {
        groepnaam=g;
        hasGroep=true;
    }
    
    public String getGroepnaam()
    {
        return groepnaam;
    }
    
    public boolean heeftGestemd(){
        gestemd = true;
        return gestemd;
    }
    
}
