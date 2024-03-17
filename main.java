import java.util.Scanner;
class main{

	public static void show_game(char[] pos){
		System.out.println(positions);
	}	


	public static void main(String[] args){
	char[] positions = new char[9];
	byte turn = 1;
	Scanner scan = new Scanner(System.in);
	
	while(true){
		if(turn == 1){
	
			System.out.println("Onde você quer jogar 1 ");
			var play = scan.nextLine();	
			turn = 2;
	
		}else if(turn == 2){
	
			System.out.println("Onde você que jogar 2 ");
			var play = scan.nextLine();
			turn = 1;
			show_game();
		
		}
	}

	}
}
