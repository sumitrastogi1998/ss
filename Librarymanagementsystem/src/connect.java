import java.sql.*;
import javax.swing.JOptionPane;
public class connect {
    Connection conn;
    public static Connection ConnecrDb()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sumit\\Documents\\NetBeansProjects\\Librarymanagementsystem\\Library.sqlite");
            return conn;
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    return null;
}
}
