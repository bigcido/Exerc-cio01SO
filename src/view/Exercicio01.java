package view;
import controller.metodo;
public class Exercicio01 {

	public static void main(String[] args) {
		metodo mth = new metodo();
		 int[] array0 = new int [1000];
		 int[] array1 = new int [10000];
		 int[] array2 = new int [100000];
		 
		 mth.arrayTime(array0); 
		 mth.arrayTime(array1); 
		 mth.arrayTime(array2); 
		}

	}

