package controlador;

import modelo.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped	
public class UmbralControlador {
	public int umbralId;
	public int valorMin;
	public int valorMax;
	public String estado;
	public String fechaRegistro;
	public String fechaActualiza;
	public String fechaInactiva;
	public String usuarioModifica;
	public int numeroUmbral;

    
    Sql sql = new Sql();
    Umbral u = new Umbral();
    
    public UmbralControlador (){
    	
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
		u = new Umbral ( umbralId,  valorMin,  valorMax,  estado,  
				fechaRegistro,  fechaActualiza,  fechaInactiva,  usuarioModifica, numeroUmbral);
		
		u.insertar();
	}
	
	public void modificar(){
		u = new Umbral ( umbralId,  valorMin,  valorMax,  estado,  
				fechaRegistro,  fechaActualiza,  fechaInactiva,  usuarioModifica, numeroUmbral);
		
		u.modificar();
	}
	
	public void borrar(){
		u = new Umbral ( umbralId,  valorMin,  valorMax,  estado,  
				fechaRegistro,  fechaActualiza,  fechaInactiva,  usuarioModifica, numeroUmbral);
		
		u.borrar();
	}
	
public String consultar(){
		
		u = new Umbral ( umbralId,  valorMin,  valorMax,  estado,  
			fechaRegistro,  fechaActualiza,  fechaInactiva,  usuarioModifica, numeroUmbral);
		
		
		u.consultar();
			
		umbralId = u.umbralId;
		valorMin = u.valorMin;
		valorMax = u.valorMax;
		estado = u.estado;
		fechaRegistro = u.fechaRegistro;
		fechaActualiza = u.fechaActualiza;
		fechaInactiva = u.fechaInactiva;
		usuarioModifica = u.usuarioModifica;
		numeroUmbral = u.numeroUmbral;
		
		return "umbral";
		
	
	}
	
	
}
