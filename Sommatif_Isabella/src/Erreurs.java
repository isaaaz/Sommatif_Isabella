/*
* Author: isabella
* Date: 16-Dec-2020
* Nom de programme: Sommatif_erreurs 
* Description: Correction des erreurs dans un programme donné
*/
public class Erreurs
{

	public static void main(String[] args)
		{
			
				System.out.println(saluerAmi("John"));

		} // Mettre la parenthèse bouclée (}) de main après que le main soit terminée plutôt qu'à la fin du programme 
			
		public static String saluerAmi(String nom) // Ajouter "static" pour que la méthode puisse retourner le String
			{ 
			
				String message = "Bonjour mon ami " + nom; // Ajouter un espace après "ami"; sinon les lettres d'amies resteraient ensemble avec le String nom "John"
				
			return message;
			}


		}


