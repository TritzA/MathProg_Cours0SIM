package Tp1;

import javax.swing.JOptionPane;

public class RiemannTritzStPierre {

	public static void main(String[] args) {
		
		// TRITZ ST-PIERRE
		
		double aire; // D�claration de la variable d'aire
		double dx; // D�claration de la variable de base des rectangles ou d'hauteur des trap�zes (on pourrait qualifier cette variable d'"�cart")
		double n = Double.parseDouble(JOptionPane.showInputDialog("Veuillez entrer le nombre de rectangles souhait�s : ", "401")); // Affecter � la variable "n" le nombre de rectangles souhait�s par l'utilisateur (conseille � l'utilisateur la valeur de 401)
		double m = Double.parseDouble(JOptionPane.showInputDialog("Veuillez entrer le nombre de trap�zes souhait�s : ","16")); // Affecter � la variable "m" le nombre de trap�zes souhait�s par l'utilisateur (conseille � l'utilisateur la valeur de 16)
		double debut = Double.parseDouble(JOptionPane.showInputDialog("Veuillez entrer la valeur en x de d�part : ","1")); // Affecter � la variable de d�but le point de d�part (en x) de l'int�grale d�finie (conseille � l'utilisateur la valeur de 1)
		double fin = Double.parseDouble(JOptionPane.showInputDialog("Veuillez entrer la valeur en x de fin : ","3")); // Affecter � la variable de fin le point de fin (en x) de l'int�grale d�finie (conseille � l'utilisateur la valeur de 3)

		aire = 0; // Initialisation de la variable d'aire � 0
		dx = (fin - debut) / n; // Calcul de l'"�cart" qui correspond � la base de chaque rectangle
		for (double x = debut; x < fin; x += dx) { // D�but d'une boucle for qui commence en "d�but" et termine en "fin" par bon de dx
			aire += f(x) * dx; // Incr�mentation de la valeur d'aire par la valeur de la fonction en x multipli�e par l'�cart � chaque fois
		} // Fin de la boucle for
		System.out.println("L'aire sous la courbe entre " + debut + " et " + fin
				+ " avec "+n+" rectangles est de " + aire + " unit�s d'aire. L'erreur est de "+(aire-(8./3.))+"."); // Affiche la r�ponse trouv�e avec la m�thode des rectangles

		aire = 0; // R�-Initialisation de la variable d'aire � 0
		dx = (fin - debut) / m; // Calcul de l'"�cart" qui correspond � la hauteur de chaque trap�ze
		for (double x = debut; x < fin; x += dx) { // D�but d'une boucle for qui commence en "d�but" et termine en "fin" par bon de dx
			aire += (f(x) + f(x + dx)) / 2 * dx; // Incr�mentation de la valeur d'aire par la moyenne des valeurs de la fonction en x et en x+l'"�cart" multipli�e par l'�cart � chaque fois
		} // Fin de la boucle for
		System.out.println("L'aire sous la courbe entre " + debut + " et " + fin
				+ " avec "+m+" trap�zes est de " + aire + " unit�s d'aire. L'erreur est de "+(aire-(8./3.))+"."); // Affiche la r�ponse trouv�e avec la m�thode des trap�zes

	}

	public static double f(double x) { // D�but d'une m�thode qui re�oit une valeur d�cimale (en x) et retourne une valeur d�cimale (en y)
		return Math.pow(x, 2) - 2 * x + 1; // Calcule et retourne la valeur en y en fonction de la valeur donn�e en x
	} // Fin de la fonction
}
