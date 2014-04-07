package DocumentComponent;

/**
 * Write a description of class MonthlyExpenditureReport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonthlyExpenditureReport
{
    // instance variables - replace the example below with your own
    private int totalExpenditure;

    /**
     * Constructor for objects of class MonthlyExpenditureReport
     */
    public MonthlyExpenditureReport(int te)
    {
        this.totalExpenditure = te;
    }

    public int getTotalExpenditure(){
        return this.totalExpenditure;    
    }

    //updates current expenditure
    public void updateTotalExpenditure(int newTotal)
    {
        this.totalExpenditure = newTotal;
    }
}
