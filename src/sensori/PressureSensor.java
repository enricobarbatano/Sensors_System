package sensori;

public class PressureSensor extends Sensore{
    int pressione;
    PressureScale scala;
  public PressureSensor(int ID, int samplingfrequency, boolean isMute, int numberOfInstances, String position, int pressione, PressureScale scala) {
        super(ID, samplingfrequency, isMute, numberOfInstances, position);
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
    System.out.println("sensore di pressione attivato ");
}
@Override
public void effettuaMisurazione() {
    System.out.println("pressione in "+getScala()+" :");
    int misura=scanner.nextInt();
    this.pressione=misura;
    System.out.println("la nuova pressione misurata è di :"+ getPressione()+ " "+getScala());
}
@Override
public void spegniSensore() {
   
    super.spegniSensore();
    System.out.println("sensore di pressione spento ");
}
@Override
public void taraSensore() {
    
 System.out.println("sensore di pressione tarato ");
}

}

