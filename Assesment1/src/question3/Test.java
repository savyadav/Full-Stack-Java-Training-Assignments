package question3;

public class Test {

	public static void main(String[] args) {
		BookMyMovie object1=new BookMyMovie(101, 5);
		double totalAmount =object1.calculateTicketAmount();
		System.out.println("totalAmount for Object1="+totalAmount);
		BookMyMovie object2=new BookMyMovie(102,4);
		totalAmount=object2.calculateTicketAmount();
		System.out.println("totalAmount for Object2="+totalAmount);
		BookMyMovie object3=new BookMyMovie(103,8);
		totalAmount=object3.calculateTicketAmount();
		System.out.println("totalAmount for Object3="+totalAmount);
	}

}
