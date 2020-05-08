
package nyatproje;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author mervenuryazanel B171210069
 */

public class DBC {
Connection connection;
String url = "jdbc:postgresql://localhost:5432/dogrulama";
String user = "postgres";
String password = "postgres";

public Connection dbConnection() {
   
    try {
       
    Class.forName("org.postgresql.Driver");
   
    } catch(ClassNotFoundException e ){
              e.getMessage();
    }
   
    try {
       connection = DriverManager.getConnection(url, user, password);
        //JOptionPane.showMessageDialog(null, "Veri tabanina başarıyla bağlandi");
        System.out.println("Veri tabanina başarıyla bağlandi...");
        
        
    } catch (SQLException ex) {
        Logger.getLogger(DBC.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "veri tabanina bağlanamadi");
    }
   
    return connection;
}

public void dogrulama(){
    String SQL = "SELECT public.kullanici.kullaniciAdi,public.kullanici.sifre";
    try {
       connection = DriverManager.getConnection(url, user, password);
        JOptionPane.showMessageDialog(null, "basarili");
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(SQL);
        while (rs.next()) {
            System.out.println(rs.getString("kullanici") + "\t"
                    + rs.getString("isim") + "\t"
                    + rs.getString("sifre"));

        }
        
    } catch (SQLException ex) {
        Logger.getLogger(DBC.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "basarisiz");
    }
}

   
   
}
