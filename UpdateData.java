import java.sql.*;

public class UpdateData {
    public static void main(String[] args)  {

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password  = "root177";
        String query  = "UPDATE students.students\n"+
                "SET university = 'IBA SUKKUR' , UNI_FEEs = 50000\n"+
                "WHERE CMS_ID = 111;";
        Connection con;
        Statement stmt;
        ResultSet rs;
        int rowsaffected =0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("not installed ");
        }
        try{
            con = DriverManager.getConnection(url ,username ,  password );
            stmt = con.createStatement();
            rowsaffected= stmt.executeUpdate(query);

            if(rowsaffected > 0 ){
                System.out.println("Data updatd  succesfully ");
                System.out.println("Rows affescted :: "+rowsaffected);
            }



        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }




    }
}