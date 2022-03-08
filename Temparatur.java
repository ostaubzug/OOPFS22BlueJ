
/**
 * Beschreiben Sie hier die Klasse Temparatur.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Temparatur
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private float temparatureCelsius;

    public Temparatur(double input)
    {
        // Instanzvariable initialisieren
        temparatureCelsius = (float)input;
    }
        public Temparatur()
    {
    }

        public void setTemparatureCelsius(double input)
    {
        temparatureCelsius = (float)input;
    }

    public float getTemparatureCelsius()
    {
        // tragen Sie hier den Code ein
        return temparatureCelsius;
    }
    
    public float getTemparatureKelvin(){
        return temparatureCelsius + 273.15f;
    }
    
    public float getTemparatureFahrenheit(){
        return temparatureCelsius * 1.8f + 32f;
    }
    
    public void increaseTemparatureKelvin(double input){
        temparatureCelsius += (float)input;
    }
    
    public void decreaseTemparatureKelvin(double input){
        temparatureCelsius -= (float)input;
    }

}
