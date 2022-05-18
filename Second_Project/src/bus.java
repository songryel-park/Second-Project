
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
		this(num, "운행", 0, 25, 100, 0, 0);
	}
	
	public void fuel(int oil) {
		this.state = state;
		if(oil < 10) {
			this.oil = oil;
			this.state = "차고지행";
			System.out.println("주유량 확인 - 차고지");
		}
		else {
			this.oil = oil;
			System.out.println("운행중");
		}
	}
	
	public void convert(int speed) {
		if(speed >= 0) {
			this.speed += speed;
			//System.out.println("빠르게");
		} else {
			this.speed += speed;
			//System.out.println("느리게");
		}
	}
	
	public void runnig(int pas) {
		if(pas >= maxPas) {
			System.out.println("만차");
		} else if(pas < 0) {
			this.state = "차고지행";
			System.out.println("운행 종료 - 차고지");
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
		
		System.out.println(b1.num + "번 버스 " + "잔여 주유량 " + b1.oil + "L " + "현재 " + b1.pas + "명 탑승 중 "
				+ "현재 속도 "+ b1.speed + "km/h " + "요금 " + b1.price + "원");
	}
}