package com.solitaire.view;

import com.solitaire.controller.GamePlay;

public class MainMenu {
	public static void show() {
		// System.out.println("Welcome to Patience Game!");
		System.out.println("\033[34;1mS.Start Game\033[0m");
		System.out.println("\033[34;1mQ.Quit\033[0m");

		char selection = new java.util.Scanner(System.in).next().charAt(0); // 锁定字节长度

		System.out.println("Your input is " + selection);
		if (selection == 'S' || selection == 's')// 大小写适配
		{
			System.out.println("Game Start");
			GamePlay.start();
		}

		else if (selection == 'Q' || selection == 'q') {
			System.out.println("You have exited the game");
			System.out.println("Welcome back");
			System.exit(0);
		}

		else {

			for (int i = 0; i < 50; i++)
				System.out.println(" ");    // clear
			
			System.out.println("————————————————————————————————————————————————————");
			System.out.println("\033[31;1minvalid command! please enter the correct command!!\033[0m");

			//System.out.println("——————————————————————————————————————————————————");
			System.out.println("————————————————————————————————————————————————————");

			MainMenu.show();

		}

	}

}
