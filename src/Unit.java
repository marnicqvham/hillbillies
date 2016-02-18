
public class Unit {
	public Unit(double[] position)throws IllegalPositionException{
		if (!isValidPosition(position))
			throw new IllegalPositionException(position);
		this.position = position;
		
		
	}
	@basic@immutable
	public double getPosition(){
		return this.Position;
	}
	public static boolean isValidPosition(double[] position){
		return position[0]>0 && position[1]>0 && position[2]> 0 &&
		position[0]<49 && position[0]<49 && position[0]<49;
	}
	public void setPosition(double[] position){
		assert isValidPosition(position)
	}
	private final double[] position;
	
}
