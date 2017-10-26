package controlador;

import modelo.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped	
public class ServidorControlador {
	private int servidorId;
    private String nombreServidor;
    private String direccionIp;
    private String descripcion;
    private String estado;
    private String fechaRegistro;
    private String fechaActualiza;
    private String fechaInactiva;
    private String usuarioModifica;
    
    Sql sql = new Sql();
    Servidor s  = new Servidor();
    
    public ServidorControlador (){
    	
    }
    
    
    
    public ServidorControlador(int servidorId, String nombreServidor, String direccionIp, String descripcion,
			String estado, String fechaRegistro, String fechaActualiza, String fechaInactiva, String usuarioModifica) {
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
		s = new Servidor ( servidorId,  nombreServidor,  direccionIp,  descripcion,
				 estado,  fechaRegistro,  fechaActualiza,  fechaInactiva,  usuarioModifica);
		
		s.insertar();
	}
	
	public void modificar(){
		s = new Servidor ( servidorId,  nombreServidor,  direccionIp,  descripcion,
				 estado,  fechaRegistro,  fechaActualiza,  fechaInactiva,  usuarioModifica);
		
		s.modificar();
	}
	
	public void borrar(){
		s = new Servidor ( servidorId,  nombreServidor,  direccionIp,  descripcion,
				 estado,  fechaRegistro,  fechaActualiza,  fechaInactiva,  usuarioModifica);
		
		s.borrar();
	}
	
	public String consultar(){
		
		s = new Servidor ( servidorId,  nombreServidor,  direccionIp,  descripcion,
				 estado,  fechaRegistro,  fechaActualiza,  fechaInactiva,  usuarioModifica);
		
		s.consultar();
		
		servidorId = s.servidorId;
		nombreServidor = s.nombreServidor;
		direccionIp = s.direccionIp;
		descripcion = s.descripcion;
		estado = s.estado;
		fechaRegistro = s.fechaRegistro;
		fechaActualiza = s.fechaActualiza;
		fechaInactiva = s.fechaInactiva;
		usuarioModifica = s.usuarioModifica;
		
		return "servidor";
		
	}
}
