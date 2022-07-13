class HoTGameApplication{
    public static void main(String[] args){
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
    }
}
