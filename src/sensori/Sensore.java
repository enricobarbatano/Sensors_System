package src.sensori;
import java.util.Scanner;
import java.util.logging.Logger;
public class Sensore implements Misurazione{
    Scanner scanner= new Scanner(System.in);
    Logger logger = Logger.getLogger(getClass().getName());
    private int my_ID;
    public int samplingfrequency ;
    public boolean isMute;
    static int numberOfInstances;
    public String position;
    //costruttore della classe sensore
public Sensore( int my_ID, int samplingfrequency,boolean isMute,int numberOfInstances,String position){
    this.position=position;
    this.my_ID=my_ID;
    this.isMute=isMute;
    numberOfInstances++;
    this.samplingfrequency=samplingfrequency;
}
//metodi get classe sensore
public int getMy_ID(){
    return this.my_ID;
}
public int getSamplingfrequency(){
    return this.samplingfrequency;
}
public boolean getIsMute(){
    return this.isMute;
}
public int getnumberOfIstances(){
    return numberOfInstances;
}
public String getPosition(){
    return this.position;
}
//metodi set della classe sensore
public void setMy_ID(int ID){
    this.my_ID=my_ID;
}
public void setsamplingFrequency(int samplingfrequency){
    this.samplingfrequency=samplingfrequency;
}
@Override
public void accendiSensore() {

    this.isMute=false;
    logger.info("sensore attivato ");
}
@Override
public void effettuaMisurazione() {
    logger.info("misura = ");
    
}
@Override
public void spegniSensore() {
  this.isMute=true;
    logger.info("sensore attivato ");
}
@Override
public void taraSensore() {
  logger.info("sensore tarato ");
}
public void setPosition(String position){
    this.position=position;
}
public void stampacaratteristiche(){

    logger.info("id= "+getMy_ID()+" samplingfrequency= "+getSamplingfrequency()+" isMute= "+getIsMute()+" number of istances= "+getnumberOfIstances()+" position= "+getPosition());
}
}
