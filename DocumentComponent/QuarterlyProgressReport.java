package DocumentComponent;


/**
 * Write a description of class QuarterlyProgressReport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuarterlyProgressReport
{
    // instance variables - replace the example below with your own
    private double totalWork;

    /**
     * Constructor for objects of class QuarterlyProgressReport
     */
    public QuarterlyProgressReport(double ttlwrk)
    {
        this.totalWork = ttlwrk;
    }
    
    public double getTotalWork()
    {
       return this.totalWork;
    }

    
    public void updateTotalWork(double newTotal)
    {
       this.totalWork = newTotal;
    }
}
