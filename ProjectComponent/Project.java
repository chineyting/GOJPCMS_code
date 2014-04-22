package ProjectComponent;
import DocumentComponent.*;

import java.util.*;

/**
 * Write a description of class Project here.
 * 
 * @author (your name) 
 * @version 1
 */
public class Project
{
    //declarations 
    AclComponent.Authentication user; //object of AclComponent 

    public int projectid;
    public String projectName;
    public String sector,activity; 
    public String projectDescription;
    

    //added 
    private ProjectBudget projectBudget;
    private ProjectSchedule projectSchedule;
    private ProjectPlan projectPlan;
    private Costing costing;
    private FeasibilityStudy feasibilityStudy;
    private FundingArrangement fundingArrangement;
    private MonthlyExpenditureReport monthlyExpenditureReport;
    private QuarterlyProgressReport quarterlyProgressReport;
    private FinalReport finalReport;
    private ExPostEvaluation exPostEvaluation;
    private List<Project> projects = new ArrayList<Project>();

    /**
     * Create contructor with project name, description
     * @param projectName, projectDescription
     * 
     */
    public Project(String projectName, String projectDescription,String sector)
    {
        //constructor code
        this.projectName=projectName;
        this.projectDescription=projectDescription;
        this.sector = sector;

    }

    /***
     * Add a project Name and Desciption 
     * @param project name and project description
     * @return "Failure" or "success"
     */
    public void addProject(String projectName, String projectDescription,String sector)
    {
      this.projects.add(new Project(projectName,projectDescription,sector));
    }
    
    public String (String projectName, String activity)
    {
        this.activity = activity;
    }

    /**
     * Edit roject name and desciption 
     * @param project name and description
     * @return
     */
    public void editProject(String projectName,String projectDescription,String sector)
    {
        this.projectName=projectName;
        this.projectDescription=projectDescription;  
        this.sector=sector;

    }

    // develop schedule 
    public ProjectSchedule establishProjectSchedule()
    {
        // put your code here
        return new ProjectSchedule();
    }

    // develop budget
    public ProjectBudget establishProjectBudget()
    {
        // put your code here
        return new ProjectBudget();
    }

    // create document
    public void prepareDocument(){

    }

    // record monthly expenditure
    public void recordMonthlyExpenditureReport(){
    }

    //record quarterly expenditure
    public void recordQuarterlyProgressReport(){
    }

    public ProjectSchedule getProjectSchedule(){
        return this.projectSchedule;
    }

    public ProjectBudget getProjectBudget(){
        return this.projectBudget;
    }

    public ProjectPlan getProjectPlan(){
        return this.projectPlan;
    }

    public Costing getCosting(){
        return this.costing;
    }

    public FeasibilityStudy getFeasibilityStudy(){
        return this.feasibilityStudy;
    }

    public FundingArrangement getFundingArrangement(){
        return this.fundingArrangement;
    }

    public MonthlyExpenditureReport getMonthlyExpenditureReport(){
        return this.monthlyExpenditureReport;
    }

    public QuarterlyProgressReport getQuarterlyProgressReport(){

        return this.quarterlyProgressReport;
    }

    public FinalReport getFinalReport(){
        return this.finalReport;
    }

    public  ExPostEvaluation getExPostEvaluation(){
        return this.exPostEvaluation;

    }

    public void setProjectSchedule(ProjectSchedule ps){
        this.projectSchedule = ps;
    }

    public void setProjectBudget(ProjectBudget pb){
        this.projectBudget = pb;
    }

    public void setProjectPlan(ProjectPlan pp){
        this.projectPlan = pp;
    }

    public void setCosting(Costing cost){
        this.costing = cost;
    }

    public void setFeasibilityStudy(FeasibilityStudy fs){
        this.feasibilityStudy = fs;
    }

    public void setFundingArrangement(FundingArrangement fa){
        this.fundingArrangement = fa;
    }

    public void setMonthlyExpenditureReport(MonthlyExpenditureReport mer){
        this.monthlyExpenditureReport = mer;
    }

    public void setQuarterlyProgressReport(QuarterlyProgressReport qpr){

        this.quarterlyProgressReport = qpr;
    }

    public void setFinalReport(FinalReport fr){
        this.finalReport = fr;
    }

    public  void setExPostEvaluation(ExPostEvaluation epe){
        this.exPostEvaluation = epe;

    }

    /**
     * Display the contents of the project 
     */
    public String  toString()
    {

        return ("Project Name:"+projectName+"\tProject Description:"+projectDescription); //will be updated in version 2
    }
}
