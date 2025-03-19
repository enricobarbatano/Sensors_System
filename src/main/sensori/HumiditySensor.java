package main.sensori;

public class HumiditySensor extends Sensore{
private int humidity;
private HumidityScale humidityScale;
public HumiditySensor(int my_ID, int samplingfrequency,boolean isMute,int numberOfInstances,String position, int humidity, HumidityScale humidityScale){
    super(my_ID, samplingfrequency, isMute, numberOfInstances, position);
    this.humidity=humidity;
    this.humidityScale=humidityScale;
}
public int getHumidity() {
    return humidity;
}
public HumidityScale getHumidityScale() {
    return humidityScale;
}

@Override
public void accendiSensore() {
   
    super.accendiSensore();
    logger.info("sensore di umidità attivato ");
}
@Override
public void effettuaMisurazione() {
    logger.info("pressione in "+getHumidityScale()+" :");
    int misura=scanner.nextInt();
    this.humidity=misura;
    logger.info("la nuova umidità misurata è di :"+ getHumidity()+ " "+getHumidityScale());
}
@Override
public void spegniSensore() {
   
    super.spegniSensore();
    logger.info("sensore di umidità spento ");
}
@Override
public void taraSensore() {

    logger.info("sensore di umidità tarato ");
}


}
