package JLab10;

public class Footballer 
{
	String name;
	int goals;
	int points;
	
	//Constructors
	
	public Footballer()
	{
		
	}
	public Footballer(String name)
	{
		setName(name);
	}
	public Footballer(String name, int points , int goals)
	{
		setName(name);
		setGoals(goals);
		setPoints(points);
	}
	
	//Getters and Setters;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
	//toString
	@Override
	public String toString() 
	{
		return "Footballer [name=" + name + ", goals=" + goals + ", points=" + points + "]";
	}
	
	//Misc
	public int totalPoints()
	{
		int total = (goals * 3) + points;
		return total;
	}
}




