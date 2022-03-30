package taller3.televisores;

public class TV {
	public static int numTV = 0;
	public Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	public Control control;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setControl(Control control){
		this.control = control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		if(this.estado == true){
			if(volumen >= 1 && volumen <=7) {
				this.volumen = volumen;
			}
		}
	}
	
	public void setCanal(int canal) {
		if(this.estado == true){
			if(canal>=1 && canal<=120){
				this.canal = canal;
			}
		}
		
	}
	
	public Marca getMarca(){
		return this.marca;
	}
	public Control getControl(){
		return this.control;
	}
	public int getPrecio(){
		return this.precio;
	}
	
	public int getVolumen(){
		return this.volumen;
	}
	
	public int getCanal(){
		return this.canal;
	}
	
	public static int getNumTV(){
		return TV.numTV;
	}
	
	public static void setNumTV(int numTV){
		TV.numTV = numTV;
	}
	
	public void turnOn(){
		this.estado = true;
	}
	
	public void turnOff(){
		this.estado = false;
	}
	
	public boolean getEstado(){
		return this.estado;
	}
	
	public void canalUp(){
		if(this.estado==true) {
			if(this.canal<120){
				this.canal++;
			} 
		}
	}
	
	public void canalDown(){
		if(this.estado==true) {
			if(this.canal>1){
				this.canal--;
			} 
		}
	}
	
	public void volumenUp(){
		if(this.estado==true) {
			if(this.volumen<7){
				this.volumen++;
			} 
		}
	}
	
	public void volumenDown(){
		if(this.estado==true) {
			if(this.volumen>1){
				this.volumen--;
			} 
		}
	}
	
}
