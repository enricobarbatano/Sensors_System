package main.sensori;

public class Main {
public static void main(String[] args){
     TemperatureScale scalaTemp= TemperatureScale.KELVIN;
     PressureScale scalePressure = PressureScale.ATMOSPHERE;
     HumidityScale scaleHumidity = HumidityScale.PER_CENTO;
    Sensore t1 = new TempSensor(1, 5000, true, 0, "giardino", 13, scalaTemp );
    Sensore p1 = new PressureSensor(2 , 5000, true, 0, "tetto", 6, scalePressure);
    Sensore h1= new HumiditySensor(3, 5000, false, 0, "bagno", 85, scaleHumidity);

    t1.accendiSensore();
    p1.accendiSensore();
    h1.getPosition();

    t1.effettuaMisurazione();
    p1.effettuaMisurazione();
    h1.effettuaMisurazione();

    
}
}
