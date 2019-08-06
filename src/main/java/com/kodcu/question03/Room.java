package com.kodcu.question03;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */

public class Room implements AutoCloseable{


    int numJunkPiles; // Number of junk piles in this room

    public Room(int numJunkPiles) {
        this.numJunkPiles = numJunkPiles;
    }
    
    public void clean() {
        numJunkPiles = 0 ; 
        System.out.println(" cleaned " + numJunkPiles);
    }

    

    @Override
    public void close()  {
        this.clean();
    }

    


}
