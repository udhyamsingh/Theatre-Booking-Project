import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFCreation {
  public static void addData(String name, String phone, String email, String otp, String seat){
	try {
		Document document = new Document(); 
		OutputStream outputStream = new FileOutputStream(new File("D:\\java advance\\jdbc\\practice\\abc.pdf"));
        PdfWriter.getInstance(document, outputStream);
 
        document.open();
 
        document.add(new Paragraph(" Name : "+name));
		document.add(new Paragraph(" Phone :"+phone));
        document.add(new Paragraph(" Email : "+email));
		document.add(new Paragraph(" OTP :"+otp));
		document.add(new Paragraph(" Seat :"+seat));
        document.close();
        outputStream.close();
 
        System.out.println("Pdf created successfully.");
    } catch (Exception e) {
	e.printStackTrace();
    }
  }
}