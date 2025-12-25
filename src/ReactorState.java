public class ReactorState {

public double time; // time passed in seconds 
public double power; // MegaWatts
public double fuelTemp; // celcius
public double coolantTemp; // celcius
public double steamPressure; // pascals

    public ReactorState(double time, double power, double fuelTemp, double coolantTemp, double steamPressure) {
        this.time = time;
        this.power = power;
        this.fuelTemp = fuelTemp;
        this.coolantTemp = coolantTemp;
        this.steamPressure = steamPressure;
    }

}