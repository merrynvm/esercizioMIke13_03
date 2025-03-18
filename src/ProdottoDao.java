import java.sql.*;

public class ProdottoDao {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/productDB";
    private static final String USER = "root";
    private static final String PASS = "root";

    public void createDB() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String createQuery = """
            CREATE DATABASE IF NOT EXISTS productDB;
            """;

        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Database productDB creata");
    }

    public void createTable() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String createQuery = """
            CREATE TABLE IF NOT EXISTS prodotti (
	            id INT PRIMARY KEY AUTO_INCREMENT,
	            nome_prodotto VARCHAR(255),
	            prezzo DECIMAL(10,2),
	            quantita INT
            );
            """;

        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella Prodotti creata");
    }

    public void insertProduct(Prodotto value) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO prodotti (id, nome_prodotto, prezzo, quantita) VALUES " +
                            "('" + value.getId() + "', '" + value.getNome_prodotto() + "', '" + value.getPrezzo() + "', '" + value.getQuantita() + "');";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Prodotti inseriti");
    }

    public void printAllProducts() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from prodotti;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        while (resultSet.next()) {
            System.out.println(" id " + resultSet.getString("id"));
            System.out.println(" nome " + resultSet.getString("nome_prodotto"));
            System.out.println(" prezzo " + resultSet.getString("prezzo"));
            System.out.println(" quantità " + resultSet.getString("quantita") + "\n");

        }

        conn.close();
    }

    public void printByID(int id) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * FROM prodotti
                WHERE prodotti.id =""" + "'" + id + "'";

        ResultSet resultSet = statement.executeQuery(printQuery);

        while(resultSet.next()) {
            System.out.println(" id " + resultSet.getInt("id"));
            System.out.println(" nome " + resultSet.getString("nome_prodotto"));
            System.out.println(" prezzo " + resultSet.getDouble("prezzo"));
            System.out.println(" quantità " + resultSet.getInt("quantita") + "\n");

        }

        if(!resultSet.next()){
            System.err.println("ID non valido!");
        }

        conn.close();
    }

    public void deleteByID(int id) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                DELETE FROM prodotti
                WHERE prodotti.id =""" + "'" + id + "'";

        boolean resultSet = statement.execute(printQuery);

        System.out.println("Elemento eliminato!");

        conn.close();
    }

    public void updateByID(Prodotto productWithNewData) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery =
                "UPDATE prodotti SET nome_prodotto=" + "'" + productWithNewData.getNome_prodotto()
                        + "', prezzo='" + productWithNewData.getPrezzo()
                        + "', quantita='" + productWithNewData.getQuantita()
                        + "'WHERE ID=" + productWithNewData.getId() + " ";

        int resultSet = statement.executeUpdate(printQuery);

        System.out.println("Aggiornata la riga!");

        conn.close();
    }
}