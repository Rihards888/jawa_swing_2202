import java.sql.*;

public class DBlogic { // šī ir klase

    String DB = "jdbc:mysql://localhost:3306/java_sql";
    String USER = "root";
    String PASS = "$#Ikskile888";

    //method - insert, connection, insert

    public void insert(String email) throws SQLException { //ši ir metode

        Connection conn = DriverManager.getConnection(DB, USER, PASS); //adrese kur ir jānogādā sutijums
        Statement stmt = conn.createStatement(); //auto ar kuru nogādā uz adresi vajadzīgais sūtījums

        String sql = "INSERT INTO users (email) VALUES ('"+ email +"')"; //šis jau ir mysql kods

        stmt.executeUpdate(sql); //zaļā gaisma auto ir aizbraucis

        System.out.println("Dati tika ierakstīti!");

        //pēc tam ejam uz main.java un pieliekam klasi


    }

    //delete - method, connection, delete

    public void delete(int id) throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS); //adrese kur ir jānogādā sutijums
        Statement stmt = conn.createStatement(); //auto ar kuru nogādā uz adresi vajadzīgais sūtījums

        String sql = "DELETE FROM users WHERE id = '"+ id + "' "; //šis jau ir mysql kods

        stmt.executeUpdate(sql); //zaļā gaisma auto ir aizbraucis

        System.out.println("Dati tika izdzēsti!");

        //pēc tam ejam uz main.java un pieliekam klasi


        //select metode - connection, select
    }

    public void select() throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS); //adrese kur ir jānogādā sutijums
        Statement stmt = conn.createStatement(); //auto ar kuru nogādā uz adresi vajadzīgais sūtījums
        ResultSet resultset = stmt.executeQuery("SELECT id, email FROM users");

        while(resultset.next()){
            System.out.println("id: " + resultset.getInt("id"));
            System.out.println("Email: " + resultset.getString("email"));
            System.out.println(" ");
        }



    }

    //update metode , connection, update

    public void update(String email, int id) throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS); //adrese kur ir jānogādā sutijums
        Statement stmt = conn.createStatement(); //auto ar kuru nogādā uz adresi vajadzīgais sūtījums

        String sql = "UPDATE users SET email = '"+ email +"' WHERE id = '"+ id +"'"; //šis jau ir mysql kods

        stmt.executeUpdate(sql); //zaļā gaisma auto ir aizbraucis

        System.out.println("Dati tika mainīti!");

        //pēc tam ejam uz main.java un pieliekam klasi



    }











}
