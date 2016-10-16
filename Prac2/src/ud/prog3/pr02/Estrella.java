package ud.prog3.pr02;

import java.util.Calendar;

/** Clase para definir instancias lógicas de coches con posición, dirección y velocidad.
 * @author Andoni Eguíluz
 * Facultad de Ingeniería - Universidad de Deusto (2014)
 */
public class Estrella {
	protected double posX;  // Posición en X (horizontal)
	protected double posY;  // Posición en Y (vertical)
	
	
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
