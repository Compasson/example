package ifFor;

public class IfExample2 {

	public static void main(String[] args) {
		/*
		 *  ќбычно при использовании оператора if условие это сравнение.
		 *  Ќо это не об€зательно.
		 *  ¬ условии может использоватьс€ переменна€ boolean
		 */
		boolean dataAvailable;
		// ѕровер€ет, есть ли даные
		if (dataAvailable){
			ProcessData(); 
		} else {
			waitForMoreData();
		}
			 
	}

}
