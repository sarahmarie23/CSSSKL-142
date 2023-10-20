public class Lab4LectureFiller {
    public static void main(String[] args) {
        int numBottles = 5; // number of bottles currently on the wall
        newSong(numBottles);

    }
    public static void newSong(int numBottles) {
        for(int i = numBottles; i > 1; i--) {
            System.out.print(i);
            onWall();
            System.out.print(i);
            botBeer();

            if(i == 2) {
                System.out.println("If one should happen to fall");
            } else {
                takeOneDown();
            }
            System.out.print(i-1);

            if(i == 2) {
                oneOnWall();
                System.out.println(); 
                lastVerse();
            } else {
                onWall();
            }
            
            System.out.println(); 
        }
    }
    public static void lastVerse() {
        System.out.print("1");
        oneOnWall();
        System.out.print("1");
        System.out.println(" bottle of beer");
        System.out.println("Take it down and pass it around");
        System.out.println("No more bottles of beer on the wall");
    }
    public static void onWall() {
        System.out.println(" bottles of beer on the wall");
    }
     
    public static void oneOnWall(){
        System.out.println (" bottle of beer on the wall");
    }

    public static void botBeer() {
        System.out.println(" bottles of beer");
    }
     
    public static void takeOneDown(){
        System.out.println("Take one down and pass it around");
    }
}