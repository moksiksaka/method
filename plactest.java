import java.util.Scanner;
class plactest{
	
		String input(){
			Scanner sc = new Scanner(System.in);
			String in = sc.nextLine();
			return in;
		}
		String remove(String in){
			String space [] = in.split(" ");
			String rem = " ";
			for(int i=0;i<space.length;i++){
				rem+=Character.toUpperCase(space[i].charAt(0))+(space[i].substring(1));
			}
			return rem;
		}
		void print(String rem){
			System.out.println();
			System.out.println(rem);
			System.out.println();
		}
		public static void main(String[] args){
			plactest ob = new plactest();
			String in = ob.input();
			String rem = ob.remove(in);
			ob.print(rem);
	}
}

