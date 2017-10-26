/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import java.util.Date;



@ManagedBean
@SessionScoped
public class Metrica {
	Sql sql = new Sql();
	public int metricaId;
	public String metrica;
	public String descripcion;
	public int parametros;
	public int tiempo;
	public int timeOut;
	public String estado;
	public Date date = new Date();
	public Date date1 = new Date();
	public Date date2 = new Date();
	public Date date3 = new Date();
	public String fechaRegistro = new SimpleDateFormat("yyyy-MM-dd").format(date);
	public String fechaActualiza = new SimpleDateFormat("yyyy-MM-dd").format(date1);
	public String fechaInactiva = new SimpleDateFormat("yyyy-MM-dd").format(date2);
	public String usuarioModifica = new SimpleDateFormat("yyyy-MM-dd").format(date3);
	Statement st;
    ResultSet myRs;
	

	

	public Metrica() {
		
	}
	
	public Metrica(int metricaId, String metrica, String descripcion, int parametros, int tiempo, int timeOut,
			String estado, String fechaRegistro, String fechaActualiza,
			String fechaInactiva, String usuarioModifica) {
		super();
		this.metricaId = metricaId;
		this.metrica = metrica;
		this.descripcion = descripcion;
		this.parametros = parametros;
		this.tiempo = tiempo;
		this.timeOut = timeOut;
		this.estado = estado;
		this.fechaRegistro = fechaRegistro;
		this.fechaActualiza = fechaActualiza;
		this.fechaInactiva = fechaInactiva;
		this.usuarioModifica = usuarioModifica;
	}



	public int getMetricaId() {
		return metricaId;
	}

	public void setMetricaId(int metricaId) {
		this.metricaId = metricaId;
	}

	public String getMetrica() {
		return metrica;
	}

	public void setMetrica(String metrica) {
		this.metrica = metrica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getParametros() {
		return parametros;
	}

	public void setParametros(int parametros) {
		this.parametros = parametros;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(int timeOut) {
		this.timeOut = timeOut;
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

	public void insertar(){
		try{
			String query = "insert into bmf_metricas (metricaId,metrica,descripcion,cantParametros,intervaloTiempo,timeOut,estado,fechaRegistro,fechaActualiza,fechaInactiva,usuarioModifica) values('"+this.metricaId+"','"+ this.metrica + "','" 
            		+ this.descripcion+ "','" + this.parametros + "','" + this.tiempo + "','" + this.timeOut +  "','" + this.estado+ 
          		  "','" + this.getFechaRegistro() + "','" + this.getFechaActualiza() + "','" + this.getFechaInactiva() +  "','" + this.getUsuarioModifica() + "')";
			sql.conectar();
			sql.insertar(query);
			
			 

        }
        catch(Exception ex){}
	}
	
	public void modificar(){
		try{
			
            String query = "update bmf_metricas set metrica = '"+this.getMetrica()+"',descripcion = '"+this.getDescripcion()+"', cantParametros = '"+this.getParametros()+ "', intervaloTiempo = '"+this.getTiempo() + 
                    "', timeOut = '"+this.getTimeOut() + "', estado = '"+ this.getEstado() + "', fechaRegistro = '"+ this.getFechaRegistro() + "', fechaActualiza = '"+ this.getFechaActualiza() +
                    "', fechaInactiva = '"+ this.getFechaInactiva() + "', usuarioModifica = '"+ this.getUsuarioModifica() + "' where metricaId = "+this.getMetricaId();
            sql.conectar();
			sql.modificar(query);
			
          }
          catch(Exception ex){}
	}
	
	public void borrar(){
		try{
			
            String query = "delete from bmf_metricas where metricaId = "+this.getMetricaId();
            sql.conectar();
			sql.borrar(query);
        }
        catch(Exception ex){}
	}
	
	public void consultar(){
		try{

            String query = "select * from bmf_metricas where metricaId = " + metricaId;
            sql.conectar();
			sql.consultar(query);
			
			while (sql.myRs.next()) {

            	metricaId = sql.myRs.getInt("metricaId");
				metrica = sql.myRs.getString("metrica");
				descripcion = sql.myRs.getString("descripcion");
				parametros = sql.myRs.getInt("cantParametros");
				tiempo = sql.myRs.getInt("intervaloTiempo");
				timeOut = sql.myRs.getInt("timeOut");
				estado = sql.myRs.getString("estado");
				fechaRegistro = sql.myRs.getString("fechaRegistro");
				fechaActualiza = sql.myRs.getString("fechaActualiza");
				fechaInactiva = sql.myRs.getString("fechaInactiva");
				usuarioModifica = sql.myRs.getString("usuarioModifica");

			
			}

			System.out.println(metrica);
 
            
		}
        
		catch(Exception ex){
        	System.out.println(ex.getMessage());
        }
		
	}
	

	
	
    
}