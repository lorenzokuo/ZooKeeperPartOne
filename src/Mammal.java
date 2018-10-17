
public class Mammal {
	public int energyLevel = 100;
	
	public void setEnergy(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public int getEnergy() {
		return energyLevel;
	}
	
	public void displayEvergy() {
		int level = this.energyLevel;
		System.out.println("The Energy Level is: " + level);
	}
}
