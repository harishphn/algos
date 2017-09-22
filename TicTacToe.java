import java.util.Scanner;

public class TicTacToe
{
	public static void main(String[] args)
	{
		tictactoe();
	}

	public static void tictactoe()
	{
		//create a 3x3 array and initialize it with say -1
		//ask player 1 for his position in the matrix
		//mark that position as say x
		//display the matrix
		//ask player 2 for his position in the matrix
		//player 2 enters his position
		//check if the  entered position is a valid one - see if its not -1 and throw an error if its nor -1.

		int[][] matrix = new int[3][3];
		int freeSpaces = 9;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j] = -1;
			}
		}

		Scanner scan = new Scanner(System.in);

		int player = 1;
		boolean done = false;
		while(!done)
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(matrix[i][j]!=-1)
					{
						System.out.print("| " + matrix[i][j]);
					}
					else
					{
						System.out.print("| ");
					}
					
				}
				System.out.println("|");
			}
			System.out.println("Player: " + player + " Enter the position in the form a,b ");
			String pos = scan.next();
			Scanner ext = new Scanner(pos).useDelimiter("\\s*,\\s*");
			int x = ext.nextInt();
			int y = ext.nextInt();
			x--;
			y--;
			if(matrix[x][y] != -1)
			{
				System.out.println("Invalid Move!");
			}
			else
			{
				matrix[x][y] = player;
				freeSpaces--;

				//check if a player has won
				boolean won = true;
				for(int k=0;k<3;k++)
				{
					
					if(matrix[x][k]!=player)
					{
						System.out.println("Row" + matrix[x][k]);
						won=false;
					}
				}
				if(won)
				{
					System.out.println("Congrats Player: " + player + ". You Won!");
					done = true;
				}
				won = true;
				for(int k=0;k<3;k++)
				{
					
					if(matrix[k][y]!=player)
					{
						System.out.println("Col" + matrix[k][y]);
						won=false;
					}
				}
				if(won)
				{
					System.out.println("Congrats Player: " + player + ". You Won!");
					done = true;
				}
				
				if(x==y)
				{
					won = true;
					for(int k=0;k<3;k++)
					{
						if(matrix[k][k]!=player)
						{
							won=false;
						}
					}	
				}

				if(won)
				{
					System.out.println("Congrats Player: " + player + ". You Won!");
					done = true;
				}
				else if(freeSpaces==0)
				{
					System.out.println("Game Drawn!");
					done = true;
				}

				player = (player == 1) ? 2: 1;
			}
		}
		

	}
}