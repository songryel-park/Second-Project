
import java.util.*;

public class taxi {
	int num;
	int oil;
	int pas;
	String state;
	String station;
	int speed;
	int amount;
	int price;
	int addPrice;
	int total;
	
	public taxi(int num, int oil, int pas, String state, String station, 
			int speed, int amount, int price, int addPrice, int total) {
		this.num = num;
		this.oil = oil;
		this.pas = pas;
		this.state = state;
		this.station = station;
		this.speed = speed;
		this.amount = amount;
		this.price = price;
		this.addPrice = addPrice;
		this.total = total;
	}
	
	public taxi(int num) {
		this(num, 0, 0, "������", "", 0, 0, 0, 0, 0);
	}
	
	public void start(int oil) {
		if(oil >= 10) {
			this.state = "����";
			this.oil = oil;
		} else {
			this.oil = oil;
			System.out.println("�������� Ȯ���ϼ���");
		}
	}
	
	public void take(int pas) {
		if(state.equals("����")) {
			this.pas = pas;
			if(pas > 0) {
				this.state = "������";
				System.out.println("������");
			} else {
				System.out.println("����");
			}
		} else {
			System.out.println("ž�ºҰ�");
		}
	}
	
	public void go(String station) {
		if(station == "S") {
			this.station = "���￪";
			amount = 3;
		} else if(station == "H") {
			this.station = "ȫ��";
			amount = 12;
		} else if(station == "I") {
			this.station = "��õ";
			amount = 65;
		} else if(station == "B") {
			this.station = "�λ�";
			amount = 400;
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
	
	public void pay() {		
		this.amount = amount;
		if (amount <= 10) {
	        price = 3000;
	    } else if (amount > 10 && amount <= 50) {
            addPrice = 50 * (amount-10);
	    	price = 3000;
	    } else if (amount > 50 && amount <= 100) {
            addPrice = (50 * 40) + (200 * (amount-50));
	    	price = 3000;
	    } else {
	    	addPrice = (50 * 40) + (200 * 50) + (1000 * (amount-100));
	    	price = 3000;
	    }
		total = (price + addPrice);
	}
	
	public static void main(String[] args) {	
		taxi t1 = new taxi(1);
		t1.start(11);
		t1.take(3);
		t1.go("I");
		t1.convert(30);
		t1.convert(10);
		t1.convert(-5);
		t1.pay();
		
		System.out.println(t1.num + "�� �ý�/" + t1.oil + "L/" + t1.pas + "�� ž��/" 
				+ "����ӵ� " + t1.speed + "km/h " + t1.state + " " + t1.station + " �Ÿ� " + t1.amount + "km/"
				+ "�⺻�� " + t1.price + "��" + " �߰��ݾ� " + t1.addPrice + "��" + "�� ������" + t1.total + "��");
	}
}