package main.sensori;

public class PressureSensor extends Sensore{

    int pressione;
    PressureScale scala;
  public PressureSensor(int my_ID, int samplingfrequency, boolean isMute, int numberOfInstances, String position, int pressione, PressureScale scala) {
        super(my_ID, samplingfrequency, isMute, numberOfInstances, position);
        this.pressione=pressione;
        this.scala=scala;
    } 
public int getPressione() {
    return pressione;
}
public PressureScale getScala() {
    return scala;
}
public void setPressureScale(PressureScale scala){
    this.scala=scala;
}
@Override
public void accendiSensore() {
   
    super.accendiSensore();
    logger.info("sensore di pressione attivato ");
}
@Override
public void effettuaMisurazione() {
    logger.info("pressione in "+getScala()+" :");
    int misura=scanner.nextInt();
    this.pressione=misura;
    logger.info("la nuova pressione misurata è di :"+ getPressione()+ " "+getScala());
}
@Override
public void spegniSensore() {
   
    super.spegniSensore();
    logger.info("sensore di pressione spento ");
}
@Override
public void taraSensore() {

    logger.info("sensore di pressione tarato ");
}

}

