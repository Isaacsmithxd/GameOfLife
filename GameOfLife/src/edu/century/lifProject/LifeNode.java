package edu.century.lifProject;

public class LifeNode {
	
	private boolean status; 
	private boolean toBeStatus; 
	
	private int neighbors; 
	
	
	LifeNode()
	{
		status = false; 
		
	}
	
	LifeNode(boolean status, int neighbors)
	{
		this.status = status;
		this.neighbors = neighbors; 
	}
	
	//determineStatus are the two main functions to determine if a cell is alive
	public void determineStatus()
	{
		if(neighbors >= 0 && neighbors <= 8)
		{
			
		
			if (neighbors >= 0 && neighbors < 2) 
			{
				toBeStatus = false;
			}
		
//			else if(neighbors <= 2 && neighbors <= 3)
//			{
//				break; 
//			}
			
			else if(neighbors == 3)
			{
				toBeStatus = true; 
			}
			
			else if(neighbors > 3)
			{
				toBeStatus = false; 
			}
		}
	}
	
	public void setStatus()
	{
		status = toBeStatus; 
	}
	
	
	
	//getters and setters
	public boolean getStatus() {
		return status;
	}

	public void isStatus(boolean status) {
		this.status = status;
	}

	public boolean getToBeStatus() {
		return toBeStatus;
	}

	public void setToBeStatus(boolean toBeStatus) {
		this.toBeStatus = toBeStatus;
	}

	public int getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(int neighbors) {
		this.neighbors = neighbors;
	}
	

}
