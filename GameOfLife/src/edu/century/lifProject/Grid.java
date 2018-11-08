package edu.century.lifProject;

import java.util.Scanner;

public class Grid {
	
	LifeNode [][] sea; 
	int rows, columns; 
	
	public Grid(int rows ,int columns)
	{
		this.rows = rows;
		this.columns = columns; 
		
		sea = new LifeNode[rows][columns];
		 
	}
	
	public Grid()
	{
		 sea = new LifeNode[10][10];
	}
	
	public void runSim()
	{
		Scanner keyBoard  = new Scanner(System.in);
	
		String input = keyBoard.next(); 
		
		
		while(input != "")
		{
			for(int rowIndex = 0; rowIndex < rows; rowIndex++)
			{
				for(int columnIndex = 0; rowIndex < rows; rowIndex++)
					
				{
					
					sea[rowIndex][columnIndex].determineStatus(); 
				}

			}
			for(int rowIndex = 0; rowIndex < rows; rowIndex++)
			{
				for(int columnIndex = 0; rowIndex < rows; rowIndex++)
				{
					sea[rowIndex][columnIndex].setStatus(); 
				}

			}

			input = keyBoard.next(); 
		}
	}
	
	public int aliveNebighors(int rowIndex, int columnIndex) 
	{
		sea[rowIndex + 1][columnIndex].getStatus(); 
		
		
	}

}
