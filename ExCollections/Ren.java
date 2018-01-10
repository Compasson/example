package aaa;

public class Ren {
	
	private final int x;
	private final int y;
	
	Ren(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	
	// Пока не используется
	@Override
    public int hashCode() {
        return x * 31 + y;
    }
    
    @Override
	// Проверка на экхемпляр обьекта Ren
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
		// еводит
        if (obj instanceof Ren) {        // Проверка на экземпляр
            Ren o = (Ren) obj;           // Приводит obj к типу обьектов Ren
            return x == o.x && y == o.y; // Возвращает int значение x и y.
        }
        return false;
    }

}
