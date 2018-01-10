package Povtorenie;

public class PereMetod{
	
	// Overloading
	
	private String name;
	
	public int number;
	
	public void summ(int a){
		
		
		PereMetod b = new PereMetod("Vtoroj");
		
		b.number = 5+a;
	}
	
	public void summ(int a, int b){
		
		PereMetod one = new PereMetod("summ2");
		
		one.number = 5+a+b;
	}
	
    public PereMetod(String name){
		super();
		this.name = name;	
	} 
    

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name){
		this.name = name;
	}
	
	
	

}
