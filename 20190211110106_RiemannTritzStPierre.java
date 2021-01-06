package Tp1;

import javax.swing.JOptionPane;

public class RiemannTritzStPierre {

	public static void main(String[] args) {
		
		// TRITZ ST-PIERRE
		
		double aire; // Déclaration de la variable d'aire
		double dx; // Déclaration de la variable de base des rectangles ou d'hauteur des trapèzes (on pourrait qualifier cette variable d'"écart")
		double n = Double.parseDouble(JOptionPane.showInputDialog("Veuillez entrer le nombre de rectangles souhaités : ", "401")); // Affecter à la variable "n" le nombre de rectangles souhaités par l'utilisateur (conseille à l'utilisateur la valeur de 401)
		double m = Double.parseDouble(JOptionPane.showInputDialog("Veuillez entrer le nombre de trapèzes souhaités : ","16")); // Affecter à la variable "m" le nombre de trapèzes souhaités par l'utilisateur (conseille à l'utilisateur la valeur de 16)
		double debut = Double.parseDouble(JOptionPane.showInputDialog("Veuillez entrer la valeur en x de départ : ","1")); // Affecter à la variable de début le point de départ (en x) de l'intégrale définie (conseille à l'utilisateur la valeur de 1)
		double fin = Double.parseDouble(JOptionPane.showInputDialog("Veuillez entrer la valeur en x de fin : ","3")); // Affecter à la variable de fin le point de fin (en x) de l'intégrale définie (conseille à l'utilisateur la valeur de 3)

		aire = 0; // Initialisation de la variable d'aire à 0
		dx = (fin - debut) / n; // Calcul de l'"écart" qui correspond à la base de chaque rectangle
		for (double x = debut; x < fin; x += dx) { // Début d'une boucle for qui commence en "début" et termine en "fin" par bon de dx
			aire += f(x) * dx; // Incrémentation de la valeur d'aire par la valeur de la fonction en x multipliée par l'écart à chaque fois
		} // Fin de la boucle for
		System.out.println("L'aire sous la courbe entre " + debut + " et " + fin
				+ " avec "+n+" rectangles est de " + aire + " unités d'aire. L'erreur est de "+(aire-(8./3.))+"."); // Affiche la réponse trouvée avec la méthode des rectangles

		aire = 0; // Ré-Initialisation de la variable d'aire à 0
		dx = (fin - debut) / m; // Calcul de l'"écart" qui correspond à la hauteur de chaque trapèze
		for (double x = debut; x < fin; x += dx) { // Début d'une boucle for qui commence en "début" et termine en "fin" par bon de dx
			aire += (f(x) + f(x + dx)) / 2 * dx; // Incrémentation de la valeur d'aire par la moyenne des valeurs de la fonction en x et en x+l'"écart" multipliée par l'écart à chaque fois
		} // Fin de la boucle for
		System.out.println("L'aire sous la courbe entre " + debut + " et " + fin
				+ " avec "+m+" trapèzes est de " + aire + " unités d'aire. L'erreur est de "+(aire-(8./3.))+"."); // Affiche la réponse trouvée avec la méthode des trapèzes

	}

	public static double f(double x) { // Début d'une méthode qui reçoit une valeur décimale (en x) et retourne une valeur décimale (en y)
		return Math.pow(x, 2) - 2 * x + 1; // Calcule et retourne la valeur en y en fonction de la valeur donnée en x
	} // Fin de la fonction
}
