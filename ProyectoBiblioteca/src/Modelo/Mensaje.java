package Modelo;

import javax.swing.*;

public class Mensaje {

	public enum TipoMensaje{
		ADVERTENCIA,
		ERROR
	}
	
	public static void show(String mensaje, TipoMensaje tipo)
	{
		switch(tipo) {
			case ADVERTENCIA:
			{
				JOptionPane.showMessageDialog(
					null,
					mensaje,
					"Advertencia",
					JOptionPane.WARNING_MESSAGE
				);
				break;
			}
			case ERROR:
			{
				JOptionPane.showMessageDialog(
					null,
					mensaje,
					"Error",
					JOptionPane.ERROR_MESSAGE
				);
				break;
			}
		}
	}
}
