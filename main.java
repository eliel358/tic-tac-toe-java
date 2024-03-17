import java.util.Scanner;
class main{
        public static void show_game(String[] pos){
                System.out.println(" "+pos[0]+"|"+pos[1]+"|"+pos[2]);
                System.out.println("-------");
                System.out.println(" "+pos[3]+"|"+pos[4]+"|"+pos[5]);
                System.out.println("-------");
                System.out.println(" "+pos[6]+"|"+pos[7]+"|"+pos[8]);
        }
        public static void check_winner(String[] pos){
                if(pos[0].equals(pos[1]) && pos[0].equals(pos[2]) && pos[0].equals("X") ||
                   pos[3].equals(pos[4]) && pos[3].equals(pos[5]) && pos[3].equals("X") ||
                   pos[6].equals(pos[7]) && pos[6].equals(pos[8]) && pos[6].equals("X") ||
                   pos[0].equals(pos[4]) && pos[0].equals(pos[8]) && pos[0].equals("X") ||
                   pos[2].equals(pos[4]) && pos[2].equals(pos[6]) && pos[2].equals("X")){
                                System.out.println("X ganhou !!!");
                }else if(
                   pos[0].equals(pos[1]) && pos[0].equals(pos[2]) && pos[0].equals("O") ||
                   pos[3].equals(pos[4]) && pos[3].equals(pos[5]) && pos[3].equals("O") ||
                   pos[6].equals(pos[7]) && pos[6].equals(pos[8]) && pos[6].equals("O") ||
                   pos[0].equals(pos[4]) && pos[0].equals(pos[8]) && pos[0].equals("O") ||
                   pos[2].equals(pos[4]) && pos[2].equals(pos[6]) && pos[2].equals("O")){
                                System.out.println("O ganhou !!!");
                }

        }
        public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                String[] positions = {"0","0","0","0","0","0","0","0","0"};
                int turn = 1;
                while(true){
                        if(turn == 1){
                                show_game(positions);
                                System.out.println("Onde quer jogar? ");
                                int play = scan.nextInt();
                                positions[play] = "X";
                                turn = 2;
                                check_winner(positions);
                        }else if(turn == 2){
                                show_game(positions);
                                System.out.println("Onde quer jogar? ");
                                int play = scan.nextInt();
                                positions[play] = "O";
                                turn = 1;
                                check_winner(positions);
                        }

                }
        }
}