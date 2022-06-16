import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 // Maria Luiza, Lazaro, Vinicius
public class AchadosPerdidos {



    private final String url = "jdbc:postgresql://localhost/AchadosPerdidos";
    private final String user = "postgres";
    private final String password = "123456";
    Connection conn = null;


    private static final String QUERY = "select * from autor where id_autor =?";
    private static final String SELECT_ALL_QUERY = "select * from AchadosPerdidos";
    private static final String INSERT_USERS_SQL = "INSERT INTO AchadosPerdidos"+
            "  (local_obj, data_obj, nome, status, tipo, observacao) VALUES " +
             " ( ?, ?, ?, ?, ?, ?);";

    private static final String UPDATE_USERS_SQL = "update users set name = ? where id = ?;";


    public Connection connect() {

        try {
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
            }
            //versão do postgreeSQL
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT VERSION()");
            if (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
        //conn.close();
    }

    public void insertRecord() throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager.getConnection(url, user, password);

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, local_obj);
            preparedStatement.setString(2, data_obj);
            preparedStatement.setString(3, nome);
            preparedStatement.setString(4, status);
            preparedStatement.setString(5, tipo);
            preparedStatement.setString(6, observacao);

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
    public void getAllUsers() {
        // Step 1: Establishing a Connection
        try {
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_QUERY);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id_autor");
                String name_autor = rs.getString("nm_autor");
                System.out.println(id + " - " + name_autor);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public void getUserById() {
        // Step 1: Establishing a Connection
        try {
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = conn.prepareStatement(QUERY);
            // Step 3: Execute the query or update query
            preparedStatement.setInt(1, 5);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            // Step 4: Process the ResultSet object.
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id_autor");
                String name_autor = rs.getString("nm_autor");
                System.out.println(id + " - " + name_autor);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
  /*  public static void main(String[] args) {
        AchadosPerdidos app = new AchadosPerdidos();
        app.connect();
        System.out.println("\nRealizando o select na tabela Autor");
        app.getAllUsers();
        System.out.println("\nRealizando o select na tabela Autor pelo ID");
        app.getUserById();
    }*/
}
