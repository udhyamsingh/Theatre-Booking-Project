import java.util.Scanner;
import java.sql.*;
class Updatingrecords
{
	private Connection con;
	private Statement st;

	public Updatingrecords() throws SQLException {
        String url = "jdbc:oracle:thin:@localHost:1521:XE";
        String user = "system";
        String password = "1234";
        con = DriverManager.getConnection(url, user, password);
        st = con.createStatement();
    }

	 public void setData(String name, String phone, String email, String otp ,String buttonId, int bill) throws SQLException {
        String sqlQuery = String.format("insert into udhyam1234.ticket values ('%s', '%s', '%s', '%s','%s',%d)", name, phone, email, otp, buttonId, bill );
        st.executeUpdate(sqlQuery);
        System.out.println("Ticket Added Into Database Successfully");

		PDFCreation.addData(name,phone,email,otp,buttonId);
        con.close();
    }
	 public static void main(String[] args) throws Exception {
        Updatingrecords updater = new Updatingrecords();
		TheatreSeatsSelection th=new TheatreSeatsSelection();
       // th.actionPerformed();
        updater.setData("Udhyam Singh", "1234567890", "udhyam@example.com", "1234", "134", 100);
		System.out.println("Ticket Udated  Into Database Successfully");
		
		
    }
}