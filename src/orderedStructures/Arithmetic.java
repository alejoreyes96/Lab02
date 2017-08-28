package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	
	public String toString(){
		return "Arith(3, 2)";
		
	}

	@Override
	public double nextValue() throws IllegalStateException {
		if(firstValueCounter ==0)
			throw new IllegalStateException("nextValue: Invalid operation; firstValue has not been executed first.");
		
		current += commonDifference;
		return current;
	}
	
	public double getTerm(int n)  { 
		return super.firstValue()+commonDifference*(n-1); 
	}
}
