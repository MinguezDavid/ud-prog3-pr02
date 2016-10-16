package ud.prog3.pr02;

/** Clase para definir instancias de coches con sus datos l�gicos y una representaci�n
 * visual asociada lista para incluir en un panel de Swing.
 * Seg�n se mueva el coche, su representaci�n (JLabel) se mover� en consonancia.
 * @author Andoni Egu�luz
 * Facultad de Ingenier�a - Universidad de Deusto (2014)
 */
public class EstrellaJuego extends Estrella {
	private JLabelEstrella miGrafico;  // Etiqueta gr�fica de la estrella
	
	/**  Crea un nuevo coche de juego
	 */
	public EstrellaJuego() {
		miGrafico = new JLabelEstrella();
	}
	
	/** Devuelve el JLabel gr�fico asociado al coche de juego
	 * @return	Etiqueta gr�fica del coche
	 */
	public JLabelEstrella getGrafico() {
		return miGrafico;
	}

	@Override
	public void setPosX(double posX) {
		super.setPosX(posX);
		miGrafico.setLocation( (int)posX, (int)posY );
		// miGrafico.repaint();  // Al cambiar la location, Swing redibuja autom�ticamente
	}

	@Override
	public void setPosY(double posY) {
		super.setPosY(posY);
		miGrafico.setLocation( (int)posX, (int)posY );
		// miGrafico.repaint();  // Al cambiar la location, Swing redibuja autom�ticamente
	}
}
