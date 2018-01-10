package classExample;


class BoXXX {
	int width, height, depth;
	
	BoXXX(){  
		width = -1;
		height = -1;
		depth = -1;
	}

	BoXXX(BoXXX ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	BoXXX(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
	}
	
	BoXXX(int len){
		width = height = depth = len;
	}
	
	int volume() {
		return width*height*depth;
	}
}

class WeightBox extends BoXXX{
        int weight;
	
        WeightBox(int w, int h, int d, int ww){
		width = w;
		height = h;
		depth = d;
		weight = ww;
	}
}

public class ExtendsClassEx1 {
	

	public static void main(String[] args) {
		WeightBox mybox1 = new WeightBox(10, 20, 15, 34);
		WeightBox mybox2 = new WeightBox(2, 3, 4, 1);
		int vol;
		
		vol = mybox1.volume();
		System.out.println("Объем равен " + vol);
		System.out.println("Вес mybox1 равен " + mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("Объем равен " + vol);
		System.out.println("Вес mybox1 равен " + mybox2.weight);
	}
}
