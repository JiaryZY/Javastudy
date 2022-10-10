package com.solitaire.controller;

public class GameController {
    public static void control() {
        System.out.println("Please input your command:");
        String input= new java.util.Scanner(System.in).nextLine();
        System.out.println("Your input is "+input);
        if (input.equals("Q")||input.equals("exit")){
            System.out.println("Game Over");
            System.exit(0);
        }
        else if (input.equals("D")){
            System.out.println("Uncover a new card from the pile");
            CardController.uncover();
        }
        else{
            String [] command=input.split(" ");
            if (command.length==2){
                System.out.println("Move card "+command[0]+" to "+command[1]);
                
                //MOVE
            }
            else{
                System.out.println("Invalid command");//todo: show error message
                //need to refactor
//                throw new RuntimeException("Invalid command");
            }
        }
    }
}
