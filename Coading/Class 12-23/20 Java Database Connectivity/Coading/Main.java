
import java.sql.*;

class Main {
    public static void main(String[] args) {

        String url =
            "jdbc:mysql://localhost:3306/mydatabase";

        String username = "root";
        String password = "hello123";

        String query = "SELECT * FROM students";

        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection con = DriverManager.getConnection(
                url, username, password
            );

            System.out.println(
                "Connection Established Successfully"
            );

            // Step 3: Create Statement
            Statement st = con.createStatement();

            // Step 4: Execute Query
            ResultSet rs = st.executeQuery(query);

            // Step 5: Process Result
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
            }

            // Step 6: Close Resources
            rs.close();
            st.close();
            con.close();

            System.out.println("Connection Closed");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
