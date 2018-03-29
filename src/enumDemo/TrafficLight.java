package enumDemo;

public enum TrafficLight {
	GREEN(30), YELLOW(5), RED(17);
	
	private double duration;
	
	private TrafficLight(double duration) {
		this.duration = duration;
	}

	public double getDuration() {
		return duration;
	}
	
	@Override
	public String toString() {
		return String.format("%s[%d]", super.toString().toLowerCase(), Math.round(this.getDuration()));
	}
}
