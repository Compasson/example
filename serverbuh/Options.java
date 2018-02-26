package serverbuh;

import java.util.Calendar;

public class Options {
	
	public int value;
	public String sort;
	public String comment;
	public Calendar dat;
	
	public Options (int v, String s, String c)
	{
		value = v;
		sort = s;
		comment = c;	
		dat = Calendar.getInstance();
	}

}
