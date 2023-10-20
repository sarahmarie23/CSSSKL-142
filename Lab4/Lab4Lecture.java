public class Lab4Lecture {
    public static void main(String[] args) {
        int numBottles; // number of bottles currently on the wall

        // first verse - 5 bottles
        numBottles = 5;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        numBottles = 4;
        System.out.print(numBottles);
        onWall();

        System.out.println();  // display blank line between verses
        
        // 2nd verse - 4 bottles
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        numBottles = 3;
        System.out.print(numBottles);
        onWall();

        System.out.println();
        
        // 3rd verse - 3 bottles
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        numBottles = 2;
        System.out.print(numBottles);
        onWall();

        System.out.println();
        
        // 4th verse - 2 bottles
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        System.out.println("If one should happen to fall");
        numBottles = 1;
        System.out.print(numBottles);
        oneOnWall();

        System.out.println();
        
        // 5th verse - 1 bottle
        System.out.print(numBottles);
        oneOnWall();
        System.out.print(numBottles);
        System.out.println(" bottle of beer");
        System.out.println("Take it down and pass it around");
        System.out.println("no more bottles of beer on the wall");
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