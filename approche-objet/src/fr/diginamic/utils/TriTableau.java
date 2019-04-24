package fr.diginamic.utils;

public class TriTableau {
		int[] tabClass;
		
	public TriTableau(int[] tabConst){
		int i;
		
		System.out.println("array envoyé au constructeur");
		for (i = 0; i < tabConst.length; i++){
			this.tabClass[i] = tabConst[i];
		}
	}
	
	public int[] trieur(int[] tabTrieur){
		int min = tabTrieur[0];
		int temp = 0;
		int i = 0;
		int iMin = i;
		
		for (i = 0; i < tabTrieur.length; i++){
			if (tabTrieur[i] < min){
				
				temp = min;
				tabTrieur[iMin] = tabTrieur[i] ;
				tabTrieur[i] = temp;
				iMin++;
			}
		}		

		return tabTrieur;
	}

}
