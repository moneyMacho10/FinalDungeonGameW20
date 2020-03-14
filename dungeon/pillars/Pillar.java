package dungeon.pillars;

public class Pillar {
	private boolean found;
	
	Pillar(){
		this.found = false;
	}
	
	public boolean isFound() {
		return this.found;
	}
	
	public void setFound(boolean f) {
		this.found = f;
	}
	
	
}
