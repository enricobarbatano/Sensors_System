// Importazione corretta dell'enum annidato temperatureScale dentro la classe TemperatureScale
package sensori;
public class App {
    public static void main(String[] args) throws Exception {
        // Creazione corretta dell'istanza dell'enum temperatureScale
        PressureScale ps= PressureScale.ATMOSPHERE;
        TemperatureScale ts = TemperatureScale.CELSIUS;
        Sensore tempSensor =new TempSensor(1, 5000, false, 0, "porta", 0, ts);
        Sensore sensoredipressione= new PressureSensor(2,6000 , false, 0,"scala", 0, ps);
        tempSensor.effettuaMisurazione();
        sensoredipressione.effettuaMisurazione();
    }   
}

