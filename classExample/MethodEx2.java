package classExample;


class Recept{
	int muka;
	int sucar;
	int milk;
	int oil;
	int egg;
	
	void omlet(int porcion){
		egg = 2;
		milk = 70;
		System.out.println("Для приготовление омлета на " + porcion + " порции возьмите:");
		System.out.println("Яйца: " + egg*porcion + " шт.");
		System.out.println("Молоко: " + milk*porcion + " мл.");


	}
}

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recept r1 = new Recept();
		r1.omlet(4);

	}

}
