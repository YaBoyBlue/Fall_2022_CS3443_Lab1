public class Mission {

	private String name;
	private String operator;
	private int year;
	private String type;
	private Spacecraft[] craft = new Spacecraft[5];
	private Astronaut[] crew = new Astronaut[10];
	private int i = 0;
	private int j = 0;
	
	public Mission(String name, String operator, int year, String type) {
		this.name = name;
		this.operator = operator;
		this.year = year;
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public String getOperator() {
		return this.operator;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void addSpacecraft(Spacecraft craft) {
		this.craft[i] = craft;
		i++;
	}
	
	public void addCrewMember(Astronaut crew) {
		this.crew[j] = crew;
		j++;
	}
	
	public String toString() {
		String str = "";
		
		str = str + String.format("%s (%s)\n\t%s, %d\n\tSpacecrafts:\n", this.name, this.operator, this.type, this.year);
		
		for (Spacecraft craft : this.craft) {
			if (craft == null) break;
			str = str + craft;
		}
		
		str = str + String.format("\tCrew:\n");
		
		for (Astronaut crew : this.crew) {
			if (crew == null) break;
			str = str + crew;
		}
		
		return str;
	}
}