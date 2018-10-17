
class Gorilla extends Mammal {
	
	public void throwSomething() {
		this.setEnergy(this.getEnergy()-5);
		System.out.println("Gorilla has thrown something! energy level -5: " + this.energyLevel);
	}
	public void eatBananas() {
		this.setEnergy(this.getEnergy()+10);
		System.out.println("Ate banana! energy level +10: " + this.energyLevel);
	}
	public void climb() {
		this.setEnergy(this.getEnergy()-10);
		System.out.println("Gorilla has climbed a tree! energy level -10: " + this.energyLevel);
	}
		
}
