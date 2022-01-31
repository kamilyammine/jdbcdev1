import java.sql.*;
public class TestJDBC {

        public static void main( String[] args ) throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgbddatabase", "root", "");
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery( "SELECT * FROM personnes" );
            while (rs.next()) {
                String nom = rs.getString("nom");
                int age = rs.getInt("age");
                System.out.println( nom + " a " + age + " ans" );
            }
            rs.close();
            st.close();
            cx.close();
        }

}
