
public class IllegalPositionException extends RuntimeException {
	public IllegalPositionException(double[] position){
		this.position = position;
	}
	@basic@immutable
	public double[] getPosition(){
		return this.position;
	}
	private static double[] position;
}
