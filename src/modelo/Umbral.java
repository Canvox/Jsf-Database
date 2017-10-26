package modelo;
/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.ResultSet;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Umbral {

    Sql sql = new Sql();
    Statement st;
    ResultSet myRs;

	public int umbralId;
	public int valorMin;
	public int valorMax;
	public String estado;
	public String fechaRegistro;
	public String fechaActualiza;
	public String fechaInactiva;
	public String usuarioModifica;
	public int numeroUmbral;

	public Umbral(){
		
	}

	public Umbral(int umbralId, int valorMin, int valorMax, String estado, String fechaRegistro, String fechaActualiza,
			String fechaInactiva, String usuarioModifica, int numeroUmbral) {
		super();
		this.umbralId = umbralId;
		this.valorMin = valorMin;
		this.valorMax = valorMax;
		this.estado = estado;
		this.fechaRegistro = fechaRegistro;
		this.fechaActualiza = fechaActualiza;
		this.fechaInactiva = fechaInactiva;
		this.usuarioModifica = usuarioModifica;
		this.numeroUmbral = numeroUmbral;
	}
	
	
	public int getUmbralId() {
		return umbralId;
	}

	public void setUmbralId(int umbralId) {
		this.umbralId = umbralId;
	}

	public int getValorMin() {
		return valorMin;
	}

	public void setValorMin(int valorMin) {
		this.valorMin = valorMin;
	}

	public int getValorMax() {
		return valorMax;
	}

	public void setValorMax(int valorMax) {
		this.valorMax = valorMax;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getFechaActualiza() {
		return fechaActualiza;
	}

	public void setFechaActualiza(String fechaActualiza) {
		this.fechaActualiza = fechaActualiza;
	}

	public String getFechaInactiva() {
		return fechaInactiva;
	}

	public void setFechaInactiva(String fechaInactiva) {
		this.fechaInactiva = fechaInactiva;
	}

	public String getUsuarioModifica() {
		return usuarioModifica;
	}

	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	public int getNumeroUmbral() {
		return numeroUmbral;
	}

	public void setNumeroUmbral(int numeroUmbral) {
		this.numeroUmbral = numeroUmbral;
	}

	public void insertar(){
		try{
			String query = "insert into bmf_umbrales (umbralId, valorMin, valorMax, estado, fechaRegistro, fechaActualiza, fechaInactiva, usuarioModifica, numeroUmbral) values('"+this.getUmbralId()+"','"+ this.getValorMin() + "','" 
            		+ this.getValorMax() + "','" + this.getEstado() + "','" + this.getFechaRegistro() + "','" + this.getFechaActualiza() +  "','" + this.getFechaInactiva()+ 
            		  "','" + this.getUsuarioModifica() + "','" + this.getNumeroUmbral() + "')";
			sql.conectar();
			sql.insertar(query);

        }
        catch(Exception ex){}
	}
    
	public void modificar(){
		try{
			
            String query = "update bmf_umbrales set valorMin = '"+this.getValorMin()+"',valorMax = '"+this.getValorMax()+"', estado = '"+this.getEstado()+ "', fechaRegistro = '"+this.getFechaRegistro() + 
                    "', fechaActualiza = '"+this.getFechaActualiza() + "', fechaInactiva = '"+ this.getFechaInactiva() + "', usuarioModifica = '"+ this.getUsuarioModifica() + "', numeroUmbral = '"+ this.getNumeroUmbral() +
                      "' where umbralId = "+this.getUmbralId();
            sql.conectar();
			sql.modificar(query);
			
          }
          catch(Exception ex){}
	}
 
	public void borrar(){
		try{
			
            String query = "delete from bmf_umbrales where umbralId = "+this.getUmbralId();
            sql.conectar();
			sql.borrar(query);
        }
        catch(Exception ex){}
	}

	public void consultar(){
		try{

            String query = "select * from bmf_umbrales where umbralId = " + umbralId;
            sql.conectar();
			sql.consultar(query);
			
			while (sql.myRs.next()) {

            	umbralId = sql.myRs.getInt("umbralId");
				valorMin = sql.myRs.getInt("valorMin");
				valorMax = sql.myRs.getInt("valorMax");
				estado = sql.myRs.getString("estado");
				fechaRegistro = sql.myRs.getString("fechaRegistro");
				fechaActualiza = sql.myRs.getString("fechaActualiza");
				fechaInactiva = sql.myRs.getString("fechaInactiva");
				usuarioModifica = sql.myRs.getString("usuarioModifica");
				numeroUmbral = sql.myRs.getInt("numeroUmbral");

			
			} 
            
		}
        
		catch(Exception ex){
        	System.out.println(ex.getMessage());
        }
		
	}
	

    
}
