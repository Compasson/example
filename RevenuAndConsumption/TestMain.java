package RevenuAndConsumption;

import RevenuAndConsumption.Money;
import java.util.ArrayList;

public class TestMain {
	
	// Программа должна записать 10 расходов и 2 дохода, посчитать уставшуюся сумму и вывести.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Money> january = new ArrayList<Money>();
		
		// У обьекта типа Money должно быть чило-дата месяца, и число-порядковый номер затраты или дохода.
		
		Money aple = new Money();
		aple.getDate();
		aple.setCount(5.0);
		
		Money lemon = new Money();
		aple.getDate();
		lemon.setCount(5.0);
		
		
		january.add(aple);
		january.add(lemon);
		
		System.out.println(aple.getDate());
		System.out.println(aple.getCount() + lemon.getCount());
		
		//Создаем два листа: расход и доход, добавляем в них обьекты. Высчитываем сумму прибыли.
		
		ArrayList<Consamption> januaryC = new ArrayList<Consamption>();
		
		Consamption car1 = new Consamption();
		Consamption car2 = new Consamption();
		car1.setCount(10.0);
		car2.setCount(5.0);
		
		januaryC.add(car1);
		januaryC.add(car2);
		
		ArrayList<Revenu> januaryR = new ArrayList<Revenu>();
		Revenu r1 = new Revenu();
		Revenu r2 = new Revenu();
		car1.setCount(20.0);
		car2.setCount(5.0);
		
		januaryR.add(r1);
		januaryR.add(r2);
		
		System.out.println(januaryC.get(0).getCount());
		
	}

}
