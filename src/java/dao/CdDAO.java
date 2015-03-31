
package dao;
import java.sql.*;
import java.util.*;
import javax.naming.*;
import javax.sql.*;
import beans.*;
import dto.*;
public class CdDAO {
    
    
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement prepStatement = null;
    private ResultSet results = null;
    private static final String DATASOURCE_NAME = "java:comp/env/jdbc/cdcol";
    //private static final String INSERT_STATEMENT = "INSERT INTO Claim (reference, description, amount, approved, claimDate) VALUES (?,?,?,?,?)";
    private String whereClause="";
    private void getConnection() {
        if (connection == null) {
            try {
                Context initialContext = new InitialContext();
                DataSource ds = (DataSource) initialContext.lookup(DATASOURCE_NAME);
                connection = ds.getConnection();
            } catch (NamingException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void setWhereClause(String whereClause){
        this.whereClause = whereClause;
    }
    
    public Collection<CdDTO> getCds() {
        
        Collection<CdDTO> cds = new ArrayList<CdDTO>();
        try {
            getConnection();
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM cds " + whereClause);
            String titel = null;
            String interpret = null;
            String jahr = null;
            int id = 0;
           
            CdDTO cdDTO = null;
            while (results.next()) {
                
                titel = results.getString("titel");
                interpret = results.getString("interpret");
             
                jahr = results.getString("jahr");
                id = results.getInt("id");
                cdDTO = new CdDTO(titel, interpret, jahr, id);
                //System.out.println(titel);
                cds.add(cdDTO);
            }
            results.close();
            results = null;
            statement.close();
            statement = null;
            connection.close();
            connection = null;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cleanUp();
        }
        return cds;
    }
     private void cleanUp() {
        // always make sure result sets, statements and connections are closed,
        if (results != null) {
            try {
                results.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            results = null;
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement = null;
        }
        if (prepStatement != null) {
            try {
                prepStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            prepStatement = null;
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection = null;
        }
    }
}
