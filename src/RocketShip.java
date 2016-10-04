
public class RocketShip {
	
	public static final int SIZE= 3;
	
	public static void main(String[] args) {
		partOne();
		partTwo();
		partThree();
		partFour();
		partTwo();
		partFour();
		partThree();
		partTwo();
		partOne();
	}
		
	public static void partOne() {
		for (int line=1; line<= (2*SIZE)-1; line++) {
			for (int space=1; space<= (-1*line)+6; space++) {
				System.out.print(" ");
			}
			for (int forwardslash= 1; forwardslash<= 1*line; forwardslash++) {
				System.out.print("/");
			}
			for (int astericks=1; astericks<=2; astericks++) {
				System.out.print("*");
			}
			for (int backslashes=1; backslashes<= 1*line; backslashes++) {
				System.out.print("\\");
			}
			System.out.println();
	}
	}
		
	public static void partTwo() {
		for (int second=1; second<= 1; second++) {
			for (int plus=1; plus<= 1; plus++) {
				System.out.print("+");
			}
			for (int group=1; group<= SIZE*2; group++) {
				System.out.print("=*");
			}
			for (int plus=1; plus<= 1; plus++) {
				System.out.print("+");
			}
			System.out.println();
		}
	}
	
	public static void partThree() {
		for (int line=1; line<= SIZE; line++) {
			for (int straightline= 1; straightline<=1; straightline++) {
				System.out.print("|");
			}
			for (int periods=1; periods<= (-1*line)+3; periods++) {
				System.out.print(".");
			}
			for (int triangle=1; triangle<= 1*line; triangle++) {
				System.out.print("/\\");
			}
			for (int midperiod=1; midperiod<= (-2*line)+6; midperiod++) {
				System.out.print(".");
			}
			for (int triangle=1; triangle<= 1*line; triangle++) {
				System.out.print("/\\");
			}
			for (int periods=1; periods<= (-1*line)+3; periods++) {
				System.out.print(".");
			}
			for (int straightline= 1; straightline<=1; straightline++) {
				System.out.print("|");
			}
			System.out.println();
		}
	}
	
	public static void partFour() {
		for(int line=1; line<= SIZE; line++) {
			for (int straightline=1; straightline<=1; straightline++) {
				System.out.print("|");
			}
			for (int periods=1; periods<= 1*line-1; periods++) {
				System.out.print(".");
			}
			for (int vtrangles=1; vtrangles<= -1*line +1; vtrangles++) {
				System.out.print("\\/");
			}
			for (int midperiods=1; midperiods<= 2*line-2; midperiods++) {
				System.out.print(".");
			}
			for (int vtrangles=1; vtrangles<= -1*line +1; vtrangles++) {
				System.out.print("\\/");
			}
			for (int periods=1; periods<= 1*line-1; periods++) {
				System.out.print(".");
			}
			for (int straightline=1; straightline<=1; straightline++) {
				System.out.print("|");
			}
			System.out.println();
		}
	}
	
}


