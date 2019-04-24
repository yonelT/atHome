package fr.diginamic.utils;

public class TestTableau {

	public static void main(String[] args) {

		int[] array = {7, 4, 6, 3};
		
		TriTableau t = new TriTableau(array);
		
		System.out.println(t.trieur(array));

	}

}
