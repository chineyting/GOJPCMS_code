package ProjectComponent;
import java.util.ArrayList;

/**
 * Write a description of class CapitalProject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CapitalProject extends Project
{
    // instance variables - replace the example below with your own
    private Contract contract;

    /**
     * Constructor for objects of class CapitalProject
     */
    public CapitalProject (String projectName, String projectDescription,String sector, ArrayList<String> act)
    {
        super(projectName,projectDescription,sector,act);
       
    }
    
    
    public Contract getContract(){
        return this.contract;    
    }
    
    public void setContract(Contract con){
        this.contract = con;    
    }

    
}
