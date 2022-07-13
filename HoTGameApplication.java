import java.util.Scanner;
class HoTGameApplication{
    public static void main(String[] args){
	System.out.printf("Who are you?\n> ");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	System.out.printf("Hello, %s!\n", str);
        System.out.println("Tossing a coin...");
        int coftails = 0;
        for(int i = 1; i <= 3; i++){
            System.out.print("Round " + i + ": ");
            if((int)(Math.random()*2)==0){
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
                coftails++;
            }
        }
        System.out.println("Heads: " + (3-coftails) + ", Tails: " + coftails);
	if(coftails < 2){
	    System.out.printf("You won!\n");
	} else {
	    System.out.printf("You lost!\n");
	}
    }
}
