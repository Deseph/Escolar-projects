package licaolaercio;

/*Utilizando m�todos com JOptionPane
Criar um m�todo em java que multiplique dois valores 
digitados pelo usu�rio atrav�s do JOptionPane e devolva o 
resultado da multiplica��o em uma Janela JOptionPane.*/

import javax.swing.*;

public class jopitionpane {
	public static void main(String args[]) {
		double n1, n2, resp = 0;
		String jo = "";
		
		jo = JOptionPane.showInputDialog(null, "Insira o primeiro n�mero");
		n1 = Double.parseDouble(jo);
		
		jo = JOptionPane.showInputDialog(null, "Insira o segundo n�mero");
		
		n2 = Double.parseDouble(jo);
		
		resp = n1*n2;
		
		JOptionPane.showMessageDialog(null, "A multiplica��o � "+resp);
	}
}
