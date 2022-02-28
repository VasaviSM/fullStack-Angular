        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.Statement;

public class JavaConnectApp {

    public static void main(String[] args) throws ClassNotFoundException {
        // TODO Auto-generated method stub
        Connection con=null;
        Statement st=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
            System.out.println("connected..");
            st=con.createStatement();

            st.execute("insert into stores (store_id,store_name,phone,email,street,city,state,zip_code)" + "values (1,'ABC','9134882534','abc@gmail.com','park avenue','bangalore','karnataka','56432')");
        }

        catch(SQLException sq)
        {
            sq.printStackTrace();
        }
    }

}
