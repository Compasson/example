package inOutThread;

import java.util.ArrayList;

public class BasesData {
	
	ArrayList<String> list;
	
	public BasesData()
	{
		list = new ArrayList<>();
	}
    
	public void addString(String s)
	{
		list.add(s);
	}
	
	public String readString(int i)
	{
		return(list.get(i));
	}
}
