package com.kodcu.question03;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */


/*
TODO:
 1 - Story : Let’s assume that rooms must be cleaned before they are reclaimed.
 2 - How do you clean the Room - Create Room and clean numJunkPiles - 5 mins
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/

public class Adult {
    public static void main(String[] args) {
        
        try(Room room = new Room(5)) {
            System.out.println(" cleaning the room ");
        };
        
        
        
        
        

    }
}
