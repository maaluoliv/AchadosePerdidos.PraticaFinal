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


    private static final String QUERY = "select * from AchadosPerdidos where AchadosPerdidos =?";
    private static final String SELECT_ALL_QUERY = "select * from AchadosPerdidos";
    private static final String INSERT_USERS_SQL = "INSERT INTO AchadosPerdidos" +
            "  (local_obj, data_obj, nome, status, tipo, observacao) VALUES " +
            " ( ?, ?, ?, ?, ?, ?);";
    private static final String UPDATE_USERS_SQL = "update AchadosPerdidos set" +
            " (local_obj, data_obj, nome, status, tipo, observacao) VALUES" +
            " ( ?, ?, ?, ?, ?, ?);";

    public static String getInsertUsersSql(){
           return INSERT_USERS_SQL ;   }
    private void printSQLException (SQLException e){

    }
    public Connection connect() {

        try {
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Conexão com o banco de dados concluída.");
            } else {
                System.out.println("FALHA NA CONEXÃO");
            }

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

    public void insertRecorde(String local_obj, String data_obj, String nome, String status, String tipo, String observacao) throws SQLException {

        System.out.println(INSERT_USERS_SQL);

        try (Connection connection = DriverManager.getConnection(url, user, password);

             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, local_obj);
            preparedStatement.setString(2, data_obj);
            preparedStatement.setString(3, nome);
            preparedStatement.setString(4, status);
            preparedStatement.setString(5, tipo);
            preparedStatement.setString(6, observacao);

            System.out.println(preparedStatement);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            printSQLException1(e);
        }

    }

    public void insertRecord(String local_obj, String data_obj, String nome, String status, String tipo, String observacao) throws SQLException {

        System.out.println(UPDATE_USERS_SQL);

        try (Connection connection = DriverManager.getConnection(url, user, password);

             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            preparedStatement.setString(1, local_obj);
            preparedStatement.setString(2, data_obj);
            preparedStatement.setString(3, nome);
            preparedStatement.setString(4, status);
            preparedStatement.setString(5, tipo);
            preparedStatement.setString(6, observacao);

            System.out.println(preparedStatement);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            printSQLException1(e);
        }
}
    public void getUserBuscaNome(String nome) {
            Alterar al = new Alterar();
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_QUERY);

            preparedStatement.setString(1, nome);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("local_obj"));
                al.txtlocal.setText(rs.getString("local_obj"));

                System.out.println(rs.getString("data_obj"));
                al.txtdata.setText(rs.getString("data_obj"));

                System.out.println(rs.getString("nome"));
                al.txtnome.setText(rs.getString("nome"));

                System.out.println(rs.getString("status"));
                al.txtstatus.setText(rs.getString("status"));

                System.out.println(rs.getString("tipo"));
                al.txttipo.setText(rs.getString("tipo"));

                System.out.println(rs.getString("observacao"));
                al.txtobservacao.setText(rs.getString("observacao"));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

        public void create (PreparedStatement statement) {
            try {
                statement = conn.prepareStatement("CREATE TABLE item\r\n"

                        + "(\r\n"
                        + "	id_obj  		SERIAL,\r\n"
                        + "	local_obj   VARCHAR(20),\r\n"
                        + "	data_obj   VARCHAR(12),\r\n"
                        + "	nome VARCHAR(40),\r\n"
                        + "	status    VARCHAR(40),\r\n"
                        + "	tipo VARCHAR(20),\r\n"
                        + "	observacao VARCHAR(20),\r\n"
                        + "  PRIMARY KEY(id_item)\r\n"
                        + ");\r\n"
                        + "INSERT INTO AchadosPerdidos (local_obj, data_obj, nome, status, tipo, observacao)\r\n"
                        + "	VALUES ('shopping', '07/10/2018', 'bolsa', 'encontrado', 'couro', 'próximo à loja Rihappy');	\r\n"
                        + "INSERT INTO AchadosPerdidos (local_obj, data_obj, nome, status, tipo, observacao)\r\n"
                        + "	VALUES 'parque', '28/07/2020', 'celular', 'perdido', 'iphone', 'visto pela última vez próximo á lanchonete');	\r\n"
                        + "INSERT INTO AchadosPerdidos (local_obj, data_obj, nome, status, tipo, observacao)\r\n"
                        + "	VALUES ('supermercado', '07/03/2021', 'cartão', 'encontrado', 'banco inter', 'esquecido no caixa');	\r\n"
                        + "INSERT INTO AchadosPerdidos (local_obj, data_obj, nome, status, tipo, observacao))\r\n"
                        + "	VALUES ('biblioteca', '26/10/2017', 'documento', 'perdido', 'identidade', 'esquecida na mesa');	\r\n");

                statement.executeUpdate();
            } catch(SQLException e ) {
            }
        }  static void printSQLException1(SQLException ex){
            for (Throwable e : ex) {
                if (e instanceof SQLException) {
                    e.printStackTrace(System.err);
                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                    System.err.println("Message: " + e.getMessage());
                    Throwable t = e.getCause();
                    while (t != null) {
                        System.out.println("Cause: " + t);
                        t = t.getCause();
                    }
                }
            }
        }
        public Connection closeConn () throws SQLException {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return conn;
        }


}