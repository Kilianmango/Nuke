public class Reactor {

    private ReactorState state;
    private ReactorParameters params;

    private double controlRod; // 1.00 - 0.00
    private double coolantControl;    // 1.00 - 0.00

    public Reactor(ReactorState initialState,ReactorParameters params) {
        this.state = initialState;
        this.params = params;

        this.controlRod = 0.8; // safe default
        this.coolantControl = 0.7;
    }

    public void setRodInsertion(double value){
        controlRod = clamp(value,0,1);
    }

    public void setCoolantFlow(double value){
        coolantControl = clamp(value, 0,1);
    }

    public void SCRAM(){
        controlRod = 1.0;
    }









}