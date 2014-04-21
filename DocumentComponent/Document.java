package DocumentComponent;
import java.io.*;
import java.util.Scanner;






/**
 * Write a description of class Document here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Document
{
    public String docID;
    public String docName;
    public String info;

    //Creating document given parameter
    public Document (String docID, String docName){
        this.docID=docID;
        this.docName=docName;
    }

    //returns Document ID
    public String getDocId(){
        return this.docID;
    }

    //Prints document
    public void printDoc(){}

    //returns information on Document
    public String toString()
    {
        return ("Document Name:"+docName+"\nDocument ID:"+docID+"\nDocument Info:"+info);
    }

    //saves document
    public void saveDoc() {
    	PDF pdf = new PDF();
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Please enter name of file");
    	String file = scan.nextLine();
    	pdf.write(file, toString());
       
    }

    //deletes document
    public void deleteDoc(){}

    //returns document name
    public String getDocName(){
        return docName;
    }
    
    public void setDocId(String id){
        this.docID = id;
        
    }
    public void setDocName(String name){
        this.docName = name;
        
    }
    public static void main(String[] args){
		Document document = new Document("1234","Season Pass");
		document.saveDoc();
		
	}
}
