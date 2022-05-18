
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
			this.state = "빈차";
			this.oil = oil;
		} else {
			this.oil = oil;
			System.out.println("주유량을 확인하세요");
		}
	}
	
	public void take(int pas) {
		if(state.equals("빈차")) {
			this.pas = pas;
			if(pas > 0) {
				this.state = "목적지";
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
			amount = 3;
		} else if(station == "H") {
			this.station = "홍대";
			amount = 12;
		} else if(station == "I") {
			this.station = "인천";
			amount = 65;
		} else if(station == "B") {
			this.station = "부산";
			amount = 400;
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
		
		System.out.println(t1.num + "번 택시/" + t1.oil + "L/" + t1.pas + "명 탑승/" 
				+ "현재속도 " + t1.speed + "km/h " + t1.state + " " + t1.station + " 거리 " + t1.amount + "km/"
				+ "기본금 " + t1.price + "원" + " 추가금액 " + t1.addPrice + "원" + "총 결제액" + t1.total + "원");
	}
}