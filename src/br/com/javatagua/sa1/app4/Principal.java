package br.com.javatagua.sa1.app4;

import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.DivisaoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "VoeAirlines");
		
        DivisaoBO dbo = new DivisaoBO();
		
		JOptionPane.showMessageDialog(null,"Cada cliente especial recebe: " + "R$" + dbo.divisor() + ".");
		

		

	}

}
