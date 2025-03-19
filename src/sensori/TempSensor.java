package sensori;


public class TempSensor extends Sensore {
    private int temp;
    private TemperatureScale scale;
public TempSensor(int ID, int samplingfrequency,boolean isMute,int numberOfInstances,String position,int temp,TemperatureScale scale){
    super(ID, samplingfrequency, isMute, numberOfInstances,position);
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
    System.out.println("sensore di temperatura attivato ");
}
@Override
public void spegniSensore() {
    
    this.isMute=true;
    System.out.println("sensore di temperatura spento ");
}
@Override
public void effettuaMisurazione(){
    System.out.println("temperatura in "+getScale()+" :");
    int misura=scanner.nextInt();
    this.temp=misura;
    System.out.println("il sensore di temperatura ha misurato il seguente valore: "+getTemp()+ " gradi "+ getScale());
}
@Override
public void taraSensore() {

    System.out.println("sensore di temperatura tarato ");   
}
@Override
public void stampacaratteristiche() {
    
    System.out.println("id= "+getID()+" samplingfrequency= "+getSamplingfrequency()+" isMute= "+getIsMute()+" number of istances= "+getnumberOfIstances()+" position= "+getPosition()+" Temp= "+getTemp()+" scala= "+ getScale());
}
}
