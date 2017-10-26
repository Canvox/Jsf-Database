package modelo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {
	private static final String USERNAME = "root";
    private static final String PASSWORD = "canvox123";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/proyecto01";
    java.sql.Connection conn = null;
    public ResultSet myRs;
    public Statement st;
    public void conectar(){
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Conectado a la base de datos");         
		} catch(Exception ex){
        	System.out.println(ex.getMessage());
        }
    }
    
    public void insertar(String query){
    	Statement st = null;
    	try {
    		st = conn.createStatement();
            st.executeUpdate(query);
            System.out.println(query);
            System.out.println("Query Ejecutado");  
		} catch (SQLException e) {
	        System.err.println(e);
	    }
    }
    
    public void modificar(String query){
    	Statement st = null;
    	try {
    		st = conn.createStatement();
            st.executeUpdate(query); 
            System.out.println("Query Ejecutado");  
		} catch (SQLException e) {
	        System.err.println(e);
	    }
    }
	
	public void borrar(String query){
		Statement st = null;
    	try {
    		st = conn.createStatement();
            st.executeUpdate(query);    
            System.out.println("Query Ejecutado");  
		} catch (SQLException e) {
	        System.err.println(e);
	    }
	}
	
	public void consultar(String query){
		
		
    	try {
    		st = conn.createStatement();
            myRs = st.executeQuery(query);   
            System.out.println(query);
            System.out.println("Query Ejecutado");  
		} catch (SQLException e) {
	        System.err.println(e);
	    }
    }
    
    public void cerrar(){
    	try {
			conn.close();
			System.out.println("Conexion finalizada \n ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    
    public void theQuery(String query){
        Statement st = null;
        try{
        	Class.forName("com.mysql.jdbc.Driver");
        	conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Conectado a la base de datos");  
            st = conn.createStatement();
            st.executeUpdate(query);
            System.out.println("Query Executed");
        }catch(Exception ex){
        	System.out.println(ex.getMessage());
        }
    } 
}
