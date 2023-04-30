

public class AggregateurMeteo {

    private AppMeteo1 app1;
    private appMeteo2 app2;

    public AggregateurMeteo (AppMeteo1 app1, appMeteo2 app2){
        this.app1 = app1;
        this.app2 = app2;
    }
    public double getTemperature() {
        return (app1.getTemperatureCelcius() + toCelcius(app2.getTemperatureFahrenheit())) / 2;
     }
    
    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
     } 
}
