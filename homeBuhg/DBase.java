package homeBuhg;

import java.util.ArrayList;
import java.util.Calendar;

import homeBuhg.Option;

public class DBase
{
	public int month;
	public String catg;
	public ArrayList<Option> listo;
	
	// Конструктор для определенной категории расхода
	DBase(String s){
		catg = s;
		month = Calendar.MONTH;
		listo = new ArrayList<Option>(10);
	}
	
	
	// Добавление в лист операции покатегории
	public void ad(Option o)
	{
	    this.listo.add(o);
	}
	
	// Общая сумма затрат за определенный месяц по конкретной категории (пока только один месяц)
	public int allSummMonth()
	{
		int summ = 0;
		    for(Option x : listo)
		    {
		    	summ = summ + x.volume;
		    }
	    return summ;
	}
}
