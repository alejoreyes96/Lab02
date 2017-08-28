package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue);
		this.commonFactor = commonFactor; 
		
	}
	@Override
	public double nextValue() throws IllegalStateException {
		if(firstValueCounter ==0)
			throw new IllegalStateException("nextValue: Invalid operation; firstValue has not been executed first.");
		
		current*= commonFactor;
		
		return current;
		
	}
	
	public String toString(){
		return "Geom(3, 2)";
		
	}
	
	public double getTerm(int n)  { 
		return super.firstValue()*Math.pow(commonFactor,n-1); 
	}
}
