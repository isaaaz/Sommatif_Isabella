import java.util.Arrays;

/*
* Author: Isabella Zhang 
* Date: 15-Dec-2020
* Le nom du programme: Sommatif_Isabella
* Description: un programme qui utilise un méthode et un tableau pour obtenir la moyenne 
* des nombres impairs dans un tableau de 20 nombres entiers générés au hasard 
*/
public class Sommatif
{


        public static void main(String[] args)
        	{
        		
        		// Tableau de 20 nombres entiers générés au hasard
        		
        		int []myTab=new int[20]; 
        		for(int i=0;i<20;i++) 
        		{
      			  myTab[i]=(int)(Math.random()*(i+1)); 
        		}
        		
        	
        		// Afficher la moyenne des nombres impairs dans le tableau
        		
       		    System.out.println(moyenne(myTab));
        		   
            }
        
        
        // Méthode permet de calculer la moyenne des nombres impairs
        
        static double moyenne (int[] a) {
        		
        		int somme = 0;
       			
       			for(int i=0; i<a.length; i++) 
       			{
       				if (a[i]%2!=0) 
       				{
       					somme+=a[i];
       				}
       			}
       			
       			double moy = (double)somme/a.length;
       			return moy; 
       			
        }
        
        
    }

