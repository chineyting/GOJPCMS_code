package Driver;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

import ProjectComponent.*;

/**
 * Write a description of class Project_Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProjectDriver
{
    private static ArrayList<Project> projList = new ArrayList <Project> ( );
    
    public static void main(String[] args){
        Project proj;
        String choice = "";
        proj = new Project("","","");
        String act;
       
        while(!choice.toUpperCase().equals("Q")){
        	System.out.println("WELCOME TO GOJPMS");
        	System.out.println("AP - Add project");
        	System.out.println("EP - Edit project");
        	System.out.println("AC - Add Consultant");
        	System.out.println("RC - Remove Consultant");
        	System.out.println("AS - Add Subproject");
        	System.out.println("SR - Generate a status report for a project");
        	System.out.println("Q - Quit the program");
  
        	System.out.println("Select an option ->");
  
        	Scanner scan = new Scanner (System.in);
        	System.out.println("Enter your choice: ");
        	choice = scan.nextLine();
      
        
        	if (choice.toUpperCase().equals("AP")){
        		System.out.println("TA - Technical Assistance");
        		System.out.println("C - Capital");
        		String type = scan.nextLine();
        		if(type.toUpperCase().equals("TA")){
        			System.out.println("Enter Project Name: ");
        			String name= scan.nextLine();
                
        			System.out.println("Enter Project Description: ");
        			String description = scan.nextLine();
                
        			System.out.println("Enter Project Sector: ");
        			String sector = scan.nextLine();
                
        			System.out.println("Enter Project Consultant Name: ");
        			String cname = scan.nextLine();
                
        			System.out.println("Enter Project Consultant Terms of reference: ");
        			String terms = scan.nextLine();

                
        			System.out.println("Enter Project Consultant Schedule Of Payments: ");
        			String pay = scan.nextLine();
        			
        			ArrayList a = new ArrayList();
        			
        			while (act !=null){
        			    
        			
        			
	                	System.out.println("Enter Project Activity: ") ;
        			act = scan.nextLine();
        			
        			
        			a.add(act);
        		    	}
        			
        			

                
        			Consultant consultant = new Consultant(cname,terms, pay); 
        			proj = new TechnicalAssistanceProject(name,description,sector,act,consultant);
        			System.out.println ( proj.toString());
            	
        		}else if(type.toUpperCase().equals("C")){
        			System.out.println("Enter Project Name: ");
        			String name= scan.nextLine();
                
        			System.out.println("Enter Project Description: ");
        			String description = scan.nextLine();
                
        			System.out.println("Enter Project Sector: ");
        			String sector = scan.nextLine();
                
        			proj =  new CapitalProject(name,description,sector);
        			System.out.println ( proj.toString());
            	
        		}
            
            
        
            
        	}
        
        	if (choice.toUpperCase().equals("EP")){
        		System.out.println("Enter New Project Name: ");
        		String name = scan.nextLine();
            
        		System.out.println("Enter New Project Description: ");
        		String description = scan.nextLine();
            
        		System.out.println("Enter New Project Sector: ");
        		String sector = scan.nextLine();
            
        		proj.editProject(name, description, sector);

            
        	}
        	if (choice.toUpperCase().equals("AC")){
        		if (proj instanceof TechnicalAssistanceProject){
        			System.out.println("Enter Project Consultant Name: ");
        			String cname = scan.nextLine();
               
        			System.out.println("Enter Project Consultant Terms of reference: ");
        			String terms = scan.nextLine();

               
        			System.out.println("Enter Project Consultant Schedule Of Payments: ");
        			String pay = scan.nextLine();
               
        			Consultant consultant = new Consultant(cname,terms, pay); 
        			((TechnicalAssistanceProject) proj).addConsultant(consultant);
        	   
        		}
        	}
        
        	if (choice.toUpperCase().equals("RC")){
        		if (proj instanceof TechnicalAssistanceProject){
        			System.out.println("Enter Project Consultant Name: ");
        			String cname = scan.nextLine();
        			((TechnicalAssistanceProject) proj).removeConsultant(cname);
        		}
            

            
        	}
        
        	if (choice.toUpperCase().equals("AS")){
        		System.out.println("Enter Project Name: ");
        		String name= scan.nextLine();
            
        		System.out.println("Enter Project Description: ");
        		String description = scan.nextLine();
            
        		System.out.println("Enter Project Sector: ");
        		String sector = scan.nextLine();
        		proj.addProject(name, description, sector);
            

            
        	}
        
        	if (choice.toUpperCase().equals("SR")){
        		System.out.println("Enter project Name: ");
        		String name = scan.nextLine();

            
        	}
        }
    }
}
