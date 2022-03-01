import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbQueries {

    public static void main(String[] args) throws ClassNotFoundException {
        // TODO Auto-generated method stub
        Connection con=null;
        Statement st=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            System.out.println("connected..");
            st=con.createStatement();
            /*st.execute("create database student");
            st.execute("use student");
            st.execute("create table stud (st_id int,course varchar(10),st_name varchar(20))");
            st.execute("insert into stud (st_id,course,st_name)" + "values (1,'Python','abc')");
            st.execute("insert into stud (st_id,course,st_name)" + "values (2,'Java','mnp')");
            st.execute("insert into stud (st_id,course,st_name)" + "values (3,'C#','xyz')");
            st.execute("update stud set course = 'Python' where st_id = 2");
            st.execute("delete from stud where st_id = 3");*/
            st.execute("select * from stud");
        }

        catch(SQLException sq)
        {
            sq.printStackTrace();
        }
    }

}