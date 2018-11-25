package edu.century.lifProject;

public class LifeNode {
	
	private boolean status; 
	private boolean toBeStatus; 
	
	
	LifeNode()
	{
		status = false; 
		
	}
	
	LifeNode(boolean status)
	{
		this.status = status;
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

}
