package Class;

public class Item {
	//variables
	private int idItem;
	private String tipo;
	private String titulo;
	private String estadoItem;
	private int idProyecto;
	private String idLider;
	private String bugsActivos;
	private String comentarios;
	private String fecha;
	private String historial;
	
	/**método constructor*/
	public Item(){
		/**Se inicializan las variables*/
		idItem =0;
		tipo="";
		titulo="";
		estadoItem="";
		idProyecto=0;
		idLider="";
		bugsActivos="";
		comentarios="";
		fecha="";
		historial="";
	}

	
	/**@se inicializan metodos getters and setters del objeto de la clase item*/	
	/**
	 * @return the idItem
	 */
	public int getIdItem() {
		return idItem;
	}

	/**
	 * @param idItem the idItem to set
	 */
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the estadoItem
	 */
	public String getEstadoItem() {
		return estadoItem;
	}

	/**
	 * @param estadoItem the estadoItem to set
	 */
	public void setEstadoItem(String estadoItem) {
		this.estadoItem = estadoItem;
	}

	/**
	 * @return the idProyecto
	 */
	public int getIdProyecto() {
		return idProyecto;
	}

	/**
	 * @param idProyecto the idProyecto to set
	 */
	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	/**
	 * @return the idLider
	 */
	public String getIdLider() {
		return idLider;
	}

	/**
	 * @param idLider the idLider to set
	 */
	public void setIdLider(String idLider) {
		this.idLider = idLider;
	}

	/**
	 * @return the bugsActivos
	 */
	public String getBugsActivos() {
		return bugsActivos;
	}

	/**
	 * @param bugsActivos the bugsActivos to set
	 */
	public void setBugsActivos(String bugsActivos) {
		this.bugsActivos = bugsActivos;
	}

	/**
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}

	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the historial
	 */
	public String getHistorial() {
		return historial;
	}

	/**
	 * @param historial the historial to set
	 */
	public void setHistorial(String historial) {
		this.historial = historial;
	}
	

	
	
	
	

}
