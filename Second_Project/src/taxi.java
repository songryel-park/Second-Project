
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
		this(num, 0, 0, "차고지", "", 0, 0, 0, 0, 0);
	}
	
	public void start(int oil) {
		if(oil >= 10) {
			this.state = "empty";
			this.oil = oil;
		} else {
			this.oil = oil;
			System.out.println("주유량을 확인하세요");
		}
	}
	
	public void take(int pas) {
		if(state.equals("empty")) {
			this.pas = pas;
			if(pas > 0) {
				this.state = "";
				System.out.println("운행중");
			} else {
				System.out.println("빈차");
			}
		} else {
			System.out.println("탑승불가");
		}
	}
	
	public void go(String station) {
		if(station == "S") {
			this.station = "서울역";
			amount = 100;
		} else if(station == "H") {
			this.station = "홍대";
			amount = 150;
		} else if(station == "I") {
			this.station = "인천";
			amount = 400;
		} else if(station == "B") {
			this.station = "부산";
			amount = 1000;
		}
	}
	
	public void convert(int speed) {
		if(speed >= 0) {
			this.speed += speed;
			//System.out.println("빠르게");
		} else {
			this.speed -= speed;
			//System.out.println("느리게");
		}
	}
	
	public void pay() {		
		this.amount = amount;
		if (amount <= 100) {
	        price = 3000;
	    } else if (amount > 100 && amount <= 300) {
            addPrice = 10 * (amount-100);
	    	price = 3000;
	    } else if (amount > 300 && amount <= 500) {
            addPrice = (10 * 100) + (30 * 200) + (50 * (amount-300));
	    	price = 3000;
	    } else {
	    	addPrice = (10 * 100) + (30 * 200) + (50 * 200) + (100 * (amount-500));
	    	price = 3000;
	    }
		total = (price + addPrice);
	}
	
	public static void main(String[] args) {	
		taxi t1 = new taxi(1);
		t1.start(11);
		t1.take(7);
		t1.go("I");
		t1.convert(10);
		t1.convert(5);
		t1.convert(-2);
		t1.pay();
		
		System.out.println(t1.num + " " + t1.oil + " " + t1.pas + " " + t1.state + " " + t1.station + " " 
				+ t1.speed + " " + t1.amount + " " + t1.price + " " + t1.addPrice + " " + t1.total + " ");
	}
}
