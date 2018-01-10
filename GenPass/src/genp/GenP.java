package genp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenP {
	
	public String fullsign = "mnbvcxzlkjhgfdsapoiuytrewqMNBVCXZLKJHGFDSAPOIUYTREWQ1234567890!@#$%^&*() ";// В конце специально добавлен пробел, что бы substring(x1,x2) не выдал ошибку
	public String fullp = "";
	public String sign = "";
	public int kollsign = 12;
	public List<String> fullsigna = new ArrayList<>();
	public Random r = new Random();
	
	public GenP()
	{
		// Создается коллекция из строковых элементов, для удобного доступа к ним
				for(int j = 0; j < fullsign.length() - 1; j++)
				{
					String s = fullsign.substring(j, j+1);
					fullsigna.add(s);
				}
	}


	public void generate()
	{
		/** Эти варианты уникальности паролей не помогают
		String temp1 = fullsigna.get(a);
		String temp2 = fullsigna.get(a + 5);
		fullsigna.set(a, temp2);
		fullsigna.set(a + 5, temp1);
		Collections.shuffle(fullsigna);
		  */
		// Генерируется пароль из 10 символов
		for(int i = 0; i < kollsign; i++)
		{
			sign = fullsigna.get(r.nextInt(fullsigna.size()));
			fullp = fullp + sign;
		}
		kollsign = 0;
	}

	

}
