package designpattern.creational.builder;

class FloodResistantBuilder implements Builder{

	private Home floodResistantHome = new Home();
	
	@Override
	public void buildFloor() {
		floodResistantHome.floor = "10 feets above the ground level Floor." ;
		
	}
	
	@Override
	public void buildWalls() {
		floodResistantHome.walls = "Water resistant Walls.";
		
	}
	
	@Override
	public void buildTerrace() {
		floodResistantHome.terrace = "Water leakage resistant Terrace.";
		
	}
	
	@Override
	public Home getComplexHomeObject() {

		return this.floodResistantHome;
	}
}
