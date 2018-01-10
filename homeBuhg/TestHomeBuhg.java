package homeBuhg;

public class TestHomeBuhg
{
	public static void main (String[] args)
	{
		new BuhgFrame ();// создание фрейма
		
		// Инициализация Базы данных
		DBase dp = new DBase("Питание");
		DBase dk = new DBase("Квартплата");
		DBase dr = new DBase("Другое");
	
		for(int i = 0; i < 20; i++)
		{
			dp.ad(new Option(24, "Комментарий"));
			dk.ad(new Option(13, "Комментарий"));
			dr.ad(new Option(7, "Комментарий"));
		}
		
		System.out.println("Общая сумма по категории " + dp.catg + " = " + dp.allSummMonth());
		System.out.println("Общая сумма по категории " + dk.catg + " = " + dk.allSummMonth());
		System.out.println("Общая сумма по категории " + dr.catg + " = " + dr.allSummMonth());

		
		
	}
}