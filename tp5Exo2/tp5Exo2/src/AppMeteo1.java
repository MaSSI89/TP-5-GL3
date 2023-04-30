public class AppMeteo1 implements aggregInterface {
    
    public double toCelsius(double temperatureFehrenhait){
        return (temperatureFehrenhait - 32) / 1.8;
    }

    public double getTemperatue(){
        return 14;
    }
}
