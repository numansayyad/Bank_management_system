import java.sql.*;

public class condatabase {

    Connection c;
    Statement s;
 public condatabase(){
    try{
        c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","786786");
        s = c.createStatement();
    }
    catch(Exception e){  // 
        System.out.println(e);
    }
 }   
}
