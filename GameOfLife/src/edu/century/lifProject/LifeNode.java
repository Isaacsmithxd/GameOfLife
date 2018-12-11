package edu.century.lifProject;

public class LifeNode implements Cloneable{
	
	private int status; 
	
	NodeList list;
	
	int row, column; 
	
	
	public LifeNode()
	{
		status = 0; 
		list = new NodeList(); 
		
	}
	
	public LifeNode(int status)
	{
		if(status == 0 || status == 1)
		{	this.status = status;
			list = new NodeList();	} 
		else
			System.out.println("Error! LifeNodes may only be 1's or 0's");
	}
	
	public LifeNode(int status, int row, int column)
	{
		this.row =  row;
		this.column = column; 
		list = new NodeList(); 
	
		if(status == 0 || status == 1)
		{
			this.status = status;
			//System.out.println("LifeNode " + '[' + row + "] [" + column + ']' + "intalized as " + status); 
		}
		else
			System.err.println("\"Error! LifeNodes may only be 1's or 0's Cell:[" + row + "] [" + column + ']');
					
	}

	public int determineNebighors()
	{
		return ListNode.countNeighbors(list.getHead());
	}
	
	@Override
	public LifeNode clone()
	{
		LifeNode copy = new LifeNode(this.status, this.row, this.column); 
		copy.setList(this.list.clone());
		
		return copy;
		
	}
	
	//getters and setters
	public int getStatus() {
		return status;
	}

	public void setStatus(int grid) {
		
		if(grid == 0 || grid == 1)
			this.status = grid;
		else
			System.err.println("\"Error! LifeNodes may only be 1's or 0's Cell:[" + row + "] [" + column + ']');
		
	}
	
	public NodeList getList() {
		return list;
	}

	public void setList(NodeList list) {
		this.list = list;
	}

	

}
