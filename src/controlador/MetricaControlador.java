package controlador;

import modelo.*;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped	
public class MetricaControlador {
	Sql sql = new Sql();
	Metrica m = new Metrica();
	public int metricaId;
	public String metrica;
	public String descripcion;
	public int parametros;
	public int tiempo;
	public int timeOut;
	public String estado;
	public String fechaRegistro;
	public String fechaActualiza;
	public String fechaInactiva;
	public String usuarioModifica;
	

	
    public MetricaControlador(){
    }
    
    
    
    public MetricaControlador(int metricaId, String metrica, String descripcion, int parametros, int tiempo,
			int timeOut, String estado, String fechaRegistro, String fechaActualiza, String fechaInactiva,
			String usuarioModifica) {
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
			m = new Metrica(metricaId,  metrica,  descripcion,  parametros,  tiempo,
					 timeOut,  estado,  fechaRegistro,  fechaActualiza,  fechaInactiva,
					 usuarioModifica);
			
			m.insertar();
	}
	
	public void modificar(){
		m = new Metrica(metricaId,  metrica,  descripcion,  parametros,  tiempo,
				 timeOut,  estado,  fechaRegistro,  fechaActualiza,  fechaInactiva,
				 usuarioModifica);
		
		m.modificar();
	}
	
	public void borrar(){
		m = new Metrica(metricaId,  metrica,  descripcion,  parametros,  tiempo,
				 timeOut,  estado,  fechaRegistro,  fechaActualiza,  fechaInactiva,
				 usuarioModifica);
		
		m.borrar();
	}
	
	public String consultar(){
		
		m = new Metrica(metricaId,  metrica,  descripcion,  parametros,  tiempo,
				 timeOut,  estado,  fechaRegistro,  fechaActualiza,  fechaInactiva,
				 usuarioModifica);
		
		
		m.consultar();
			
		metricaId = m.metricaId;
		metrica = m.metrica;
		descripcion = m.descripcion;
		parametros = m.parametros;
		tiempo = m.tiempo;
		timeOut = m.timeOut;
		estado = m.estado;
		fechaRegistro = m.fechaRegistro;
		fechaActualiza = m.fechaActualiza;
		fechaInactiva = m.fechaInactiva;
		usuarioModifica = m.usuarioModifica;
		
		return "metrica";
		
	
	}
}
