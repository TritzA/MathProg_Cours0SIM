package tpNo1Math;

import javax.swing.JOptionPane;

public class DomaineEtLimitesEtAsymptotesDuneFonction {

	public static void main(String[] args) {

		double a, limiteA, limiteInfPos, limiteInfNeg;// Initialisation de nos variables de type primitif double
		boolean v;// Initialisation de notre variable de type primitif booléen(vrai ou faux)
		a = Double.parseDouble(JOptionPane.showInputDialog("Entrez la valeur à laquelle vous cherchez la limite."));// Entrée
																													// de
																													// la
																													// valeur
																													// de
																													// x
																													// dont
																													// nous
																													// devons
																													// calculer
																													// la
																													// limite
		limiteA = (Math.sqrt(a * a + 7) - 4) / (a - 3);// Calcul de la limite lorsque x tend vers a
		v = Double.isNaN(limiteA);// Confirmation ou infirmation de l'existence d'une valeur

		if (v == true) {// Début de la condition: si c'est vrai que la valeur des ordonnées n'existe
						// pas, alors
			double aPlus, aMoins;// Initialisation de nos variables de type primitif double dans notre structure
									// conditionnelle
			aPlus = (a + (0.000001));// Affectation de la valeur (a+0.000001) à la variable a autrement dit, on
										// travaille avec une valeur très près de a, mais légèrement supérieur
			double x = (Math.sqrt(aPlus * aPlus + 7) - 4) / (aPlus - 3);// Calcul de la limite lorsque x tend vers a
																		// (avec la nouvelle valeur de a)
			aMoins = (a - (0.000001));// Affectation de la valeur (a-0.000001) à la variable a autrement dit, on
										// travaille avec une valeur très près de a, mais légèrement inférieur
			double y = (Math.sqrt(aMoins * aMoins + 7) - 4) / (aMoins - 3);// Calcul de la limite lorsque x tend vers a
																			// (avec la nouvelle valeur de a)
			limiteA = (x + y) / 2;// Affectation de la valeur moyenne des images
		} // Fin de la structure conditionnelle

		System.out.println("La limite lorsque x tend vers " + a + " est " + limiteA);// Affiche la valeur de la limite

		a = Double.POSITIVE_INFINITY;// On affecte la valeur infini positif à a
		limiteInfPos = ((1 + 3 / a) / (Math.sqrt(1 + 7 / (a * a))) + (4 / (a)));// Calcule la valeur de la limite
																				// lorsque x tend vers l'infini positif
		System.out.println("La limite lorsque x tend vers l'infini positif est " + limiteInfPos);// Affiche la valeur de
																									// la limite lorsque
																									// x tend vers
																									// l'infini positif

		a = Double.NEGATIVE_INFINITY;// On affecte la valeur infini négatif à a
		limiteInfNeg = ((1 + 3 / a) / -(Math.sqrt(1 + 7 / (a * a))) + (4 / (a)));// Calcule la valeur de la limite
																					// lorsque x tend vers l'infini
																					// négatif

		System.out.println("La limite lorsque x tend vers l'infini négatif est " + limiteInfNeg);// Affiche la valeur de
																									// la limite lorsque
																									// x tend vers
																									// l'infini négatif

	}

}
