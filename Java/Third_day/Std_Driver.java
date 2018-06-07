
public class Std_Driver {
	public static void main(String[] args) {


		Student stds = new Student(1522,"asf");
		System.out.println(stds);//there toString

		stds.setName("Sr");
		stds.setRoll(0100);

		System.out.println("This is called getter "+stds.getName());
		System.out.println("This is called getter "+stds.getRoll());
		System.out.println("Student 1 " + stds);//there toString
		
		
		Student stds1 = new Student(stds); //copying constructure
		System.out.println("Student 2 " + stds1);//there toString
	}
}
