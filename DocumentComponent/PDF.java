package DocumentComponent;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class PDF {

	public PDF() {
		
	}
	public void write(String fileName,String paragraph){
		Document document = new Document();
		try{
			PdfWriter.getInstance(document, new FileOutputStream(fileName+".pdf"));
			document.open();
			Paragraph para = new Paragraph();
			para.add(paragraph);
			document.add(para);
			document.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args){
		Document document = new Document();
		try{
			PdfWriter.getInstance(document, new FileOutputStream("mydocument.pdf"));
			document.open();
			Paragraph paragraph = new Paragraph();
			paragraph.add("This is my document");
			document.add(paragraph);
			document.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
