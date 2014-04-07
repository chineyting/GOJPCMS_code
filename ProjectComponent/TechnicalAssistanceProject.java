package ProjectComponent;
import java.util.*;

/**
 * Write a description of class TechnicalAssistanceProject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TechnicalAssistanceProject extends Project
{
    // instance variables - replace the example below with your own
    private List<Consultant> consultants = new ArrayList<Consultant>();

    /**
     * Constructor for objects of class TechnicalAssistanceProject
     */
    public TechnicalAssistanceProject (String projectName, String projectDescription,String sector,Consultant cons)
    {
        super(projectName,projectDescription,sector);
        this.consultants.add(cons);
    }

    // adds consultant
    public void addConsultant(Consultant cons)
    {
        this.consultants.add(cons);

    }
}
