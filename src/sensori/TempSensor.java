package src.sensori;


public class TempSensor extends Sensore {

    private int temp;
    private TemperatureScale scale;
public TempSensor(int my_ID, int samplingfrequency,boolean isMute,int numberOfInstances,String position,int temp,TemperatureScale scale){
    super(my_ID, samplingfrequency, isMute, numberOfInstances,position);
         this.temp=temp;
         this.scale=scale;
    }
public int getTemp(){
    return this.temp;
}
public TemperatureScale getScale(){
    return this.scale;
}
public void setTemp(int temp){
  this.temp=temp;
}
public void setScale( TemperatureScale scale){
    this.scale=scale;
}
@Override
public void accendiSensore() {
    
    this.isMute=false;
    logger.info("sensore di temperatura attivato ");
}
@Override
public void spegniSensore() {
    
    this.isMute=true;
    logger.info("sensore di temperatura spento ");
}
@Override
public void effettuaMisurazione(){
    logger.info("temperatura in "+getScale()+" :");
    int misura=scanner.nextInt();
    this.temp=misura;
    logger.info("il sensore di temperatura ha misurato il seguente valore: "+getTemp()+ " gradi "+ getScale());
}
@Override
public void taraSensore() {

    logger.info("sensore di temperatura tarato ");
}
@Override
public void stampacaratteristiche() {

    logger.info("id= "+getMy_ID()+" samplingfrequency= "+getSamplingfrequency()+" isMute= "+getIsMute()+" number of istances= "+getnumberOfIstances()+" position= "+getPosition()+" Temp= "+getTemp()+" scala= "+ getScale());
}
}
