package ud.prog3.pr02;

import java.util.Calendar;

/** Clase para definir instancias l�gicas de coches con posici�n, direcci�n y velocidad.
 * @author Andoni Egu�luz
 * Facultad de Ingenier�a - Universidad de Deusto (2014)
 */
public class Estrella {
	protected double posX;  // Posici�n en X (horizontal)
	protected double posY;  // Posici�n en Y (vertical)
	
	
	private long hora;
	
	public long getHora()
	{
		return hora;
	}
	
	public void setHora( long time )
	{
		hora = time;
	}
	
	
	// Constructores
	
	public Estrella() {
		
		hora = Calendar.getInstance().getTimeInMillis();
	}
	
	public double getPosX() {
		return posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosicion( double posX, double posY ) {
		setPosX( posX );
		setPosY( posY );
	}
	
	public void setPosX( double posX ) {
		this.posX = posX; 
	}
	
	public void setPosY( double posY ) {
		this.posY = posY; 
	}
}
