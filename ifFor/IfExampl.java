package ifFor;

public class IfExampl {

	public static void main(String[] args) {
		/*
		 *  Пример использования оператора IF
		 *  Если else только один, его можно опустить или писать так:
		 *  if (условие) {команда1}
		 *  else {команда2}
		 */
		
		int i = 0, k = 5, n = 9, m = 15; 
		int[] mass = new int[16];
		
		for (int j = 0; j < 16; j++){
		i = j;
            if (i < 16){
        	    if (i == k){
        		    mass[i] = k*k;
        		} else if (i == n){
        		    mass[i] = n*n;   
        		} else if (i == m){
        			mass[i] = m*m;	
        		} else if (i != k & i != n & i != m){
        	        mass[i] = i;  
        		}
            }
		}
		for (int p = 0; p < 16; p++){
		System.out.println(mass[p]);
		}
	}


}
