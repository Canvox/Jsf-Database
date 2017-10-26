package modelo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



@ManagedBean
@SessionScoped
public class Servidor  {

    public int servidorId;
    public String nombreServidor;
    public String direccionIp;
    public String descripcion;
    public String estado;
    public String fechaRegistro;
    public String fechaActualiza;
    public String fechaInactiva;
    public String usuarioModifica;
    Sql sql = new Sql();
    
    public Servidor (){
    	
    }
    
    
    
    public Servidor(int servidorId, String nombreServidor, String direccionIp, String descripcion, String estado,
			String fechaRegistro, String fechaActualiza, String fechaInactiva, String usuarioModifica) {
		super();
		this.servidorId = servidorId;
		this.nombreServidor = nombreServidor;
		this.direccionIp = direccionIp;
		this.descripcion = descripcion;
		this.estado = estado;
		this.fechaRegistro = fechaRegistro;
		this.fechaActualiza = fechaActualiza;
		this.fechaInactiva = fechaInactiva;
		this.usuarioModifica = usuarioModifica;
	}



	public int getServidorId() {
		return servidorId;
	}

	public void setServidorId(int servidorId) {
		this.servidorId = servidorId;
	}

	public String getNombreServidor() {
		return nombreServidor;
	}

	public void setNombreServidor(String nombreServidor) {
		this.nombreServidor = nombreServidor;
	}

	public String getDireccionIp() {
		return direccionIp;
	}

	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
            String query = "insert into bmf_servidores (servidorId,nombreServidor,direccionIp,descripcion,estado,fechaRegistro,fechaActualiza,fechaInactiva,usuarioModifica) values('"+this.servidorId+"','"+ this.nombreServidor + "','" 
            		+ this.direccionIp+ "','" + this.descripcion + "','" + this.estado + "','" + this.fechaRegistro + "','" + this.fechaActualiza + "','" + this.fechaInactiva +  "','" + this.usuarioModifica + "')";
            sql.conectar();
			sql.insertar(query);
		}
        catch(Exception ex){}
	}
	
	public void modificar(){
		try{

            String query = "update bmf_servidores set nombreServidor = '"+this.getNombreServidor()+"',direccionIp = '"+this.getDireccionIp()+"', descripcion = '"+this.getDescripcion()+  
                     "', estado = '"+ this.getEstado() + "', fechaRegistro = '"+ this.getFechaRegistro() + "', fechaActualiza = '"+ this.getFechaActualiza() +
                    "', fechaInactiva = '"+ this.getFechaInactiva() + "', usuarioModifica = '"+ this.getUsuarioModifica() + "' where servidorId = "+this.getServidorId();
            sql.conectar();
			sql.modificar(query);
		}
          catch(Exception ex){}
	}
	
	public void borrar(){
		try{

			String query ="delete from bmf_servidores where servidorId = "+this.getServidorId();
			sql.conectar();
			sql.borrar(query);
        }
        catch(Exception ex){}
	}
	
	public void consultar(){
		
		try{

            String query = "select * from bmf_servidores where servidorId = " + servidorId;
            sql.conectar();
			sql.consultar(query);
			
			while (sql.myRs.next()) {
            	servidorId = sql.myRs.getInt("servidorId");
            	nombreServidor = sql.myRs.getString("nombreServidor");
				direccionIp = sql.myRs.getString("direccionIp");
				descripcion = sql.myRs.getString("descripcion");
				estado = sql.myRs.getString("estado");
				fechaRegistro = sql.myRs.getString("fechaRegistro");
				fechaActualiza = sql.myRs.getString("fechaActualiza");
				fechaInactiva = sql.myRs.getString("fechaInactiva");
				usuarioModifica = sql.myRs.getString("usuarioModifica");

			
			}

 
            
		}
        
		catch(Exception ex){
        	System.out.println(ex.getMessage());
        }
		
	}
	

    	
    
   
}
