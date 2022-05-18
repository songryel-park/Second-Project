
import java.util.*;

public class bus {
	int num;
	String state;
	int pas;
	int maxPas;
	int oil;
	int speed;
	int age;
	int price;
	
	public bus(int num, String state, int pas, int maxPas, int oil, int speed, int price) {
		this.num = num;
		this.state = state;
		this.pas = pas;
		this.maxPas = maxPas;
		this.oil = oil;
		this.speed = speed;
		this.price = price;
	}
	
	public bus(int num) {
		this(num, "����", 0, 25, 100, 0, 0);
	}
	
	public void fuel(int oil) {
		this.state = state;
		if(oil < 10) {
			this.oil = oil;
			this.state = "��������";
			System.out.println("������ Ȯ�� - ������");
		}
		else {
			this.oil = oil;
			System.out.println("������");
		}
	}
	
	public void convert(int speed) {
		if(speed >= 0) {
			this.speed += speed;
			//System.out.println("������");
		} else {
			this.speed += speed;
			//System.out.println("������");
		}
	}
	
	public void runnig(int pas) {
		if(pas >= maxPas) {
			System.out.println("����");
		} else if(pas < 0) {
			this.state = "��������";
			System.out.println("���� ���� - ������");
		} else {
			this.pas += pas;
		}
	}
	
	public void pay(int age) {
		if(age < 5) {
			price = 0;
		} else if(age >= 5 && age < 12) {
			price = 500;
		} else if(age >= 12 && age < 19) {
			price = 900;
		} else {
			price = 1200;
		}
	}
	
	public static void main(String[] args) {
		bus b1 = new bus(1);
		b1.fuel(31);
		b1.runnig(7);
		b1.convert(30);
		b1.convert(10);
		b1.convert(-5);
		b1.pay(19);
		
		System.out.println(b1.num + "�� ���� " + "�ܿ� ������ " + b1.oil + "L " + "���� " + b1.pas + "�� ž�� �� "
				+ "���� �ӵ� "+ b1.speed + "km/h " + "��� " + b1.price + "��");
	}
}