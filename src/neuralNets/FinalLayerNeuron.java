package neuralNets;

public class FinalLayerNeuron extends Neuron implements Comparable<FinalLayerNeuron>{
	private double desiredOutput;
	
	public FinalLayerNeuron() 
	{
	}
	
	public FinalLayerNeuron(double desiredOutput) 
	{
		this.desiredOutput = desiredOutput;
	}
	
	public void updateDelta()
	{			
		this.delta = this.output * ( 1.0 - this.output ) * (desiredOutput - this.output); 
	}
	
	public void setDesiredOutput(double desiredOutput)
	{
		this.desiredOutput = desiredOutput;
	}

	public int compareTo(FinalLayerNeuron o) {
		return (int) (this.output - o.getOutput());
	}

	
}
