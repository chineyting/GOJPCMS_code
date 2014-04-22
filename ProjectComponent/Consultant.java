package ProjectComponent;


/**
 * Write a description of class Consultant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Consultant
{
    // instance variables - replace the example below with your own
    private String termsOfReference;
    private String scheduleOfPayments;
    private String name;

    /**
     * Constructor for objects of class Consultant
     */
    public Consultant(String nm,String tof,String sop)
    {
        this.termsOfReference = tof;
        this.scheduleOfPayments = sop;
        this.name = nm;
    }
    
    public String getTermsOfReference(){
        return this.termsOfReference;
        
    }
     public String getScheduleOfPayments(){
        return this.scheduleOfPayments;
        
    }
     
     public String getName(){
         return this.name;
         
     }
    
    public void setTermsOfReference(String tor){
        this.termsOfReference = tor;
        
    }
    public void setScheduleOfPayments(String sop){
        this.scheduleOfPayments = sop;
        
    }
    public void setName(String nm){
        this.name = nm;
        
    }

   
}
