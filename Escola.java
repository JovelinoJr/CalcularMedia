package br.com.principal;

import javax.swing.JOptionPane;

/**
 * @author Jovelino Junior
 * @version 14/01/2025
 */
public class Escola {

	public static void main(String[] args) {
		 
		
		String nota01 = JOptionPane.showInputDialog("Informe a nota 01 :");
		String nota02 = JOptionPane.showInputDialog("Informe a nota 02 :");
		String nota03 = JOptionPane.showInputDialog("Informe a nota 03 :");
		String nota04 = JOptionPane.showInputDialog("Informe a nota 04 :");
		
		double dNota01 = Double.parseDouble(nota01);
		double dNota02 = Double.parseDouble(nota02);
		double dNota03 = Double.parseDouble(nota03);
		double dNota04 = Double.parseDouble(nota04);
		
		double media = (dNota01 + dNota02 + dNota03 + dNota04) / 4;
	
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno está aprovado com média :" + media);
			}else if(media == 5) {
				JOptionPane.showMessageDialog(null, "Aluno está de recuperação:" + media);				
			}else{ 
				JOptionPane.showMessageDialog(null, "Aluno reprovado com média :" + media);
					}
		}
		
		
	

	}


