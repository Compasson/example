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
	
	
	// ���� �� ������������
	@Override
    public int hashCode() {
        return x * 31 + y;
    }
    
    @Override
	// �������� �� ��������� ������� Ren
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
		// ������
        if (obj instanceof Ren) {        // �������� �� ���������
            Ren o = (Ren) obj;           // �������� obj � ���� �������� Ren
            return x == o.x && y == o.y; // ���������� int �������� x � y.
        }
        return false;
    }

}
