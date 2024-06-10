package droids;

public class Droid {

int batteryLevel;
String name;
int energy;

public String toString() {
    return "Hey there, I’m the droid " + name + "!";
} 

public Droid(String droidName){
  name = droidName;
  batteryLevel = 100;
}


public void performTask(String task) {
  System.out.println(name + " is performing task: " + task);
  batteryLevel -= 20;
}

public void energyReport(){
  System.out.println("The battery level is: " + batteryLevel + "%");
}

public void energyTransfer(Droid recipient, int energy){
  System.out.println(name + " is transferring " + energy + "% of its battery level to " + recipient.name);
  batteryLevel -= energy;
  recipient.batteryLevel +=  energy;
  if (recipient.batteryLevel > 100) {
    recipient.batteryLevel = 100;
  }
}


public static void main(String[] args){

  Droid codey = new Droid("Codey");
  Droid marget = new Droid("Marget");
  System.out.println(codey);
  System.out.println(marget);
  codey.performTask("dancing");
  marget.performTask("cooking");
  codey.performTask("flying");
  codey.energyTransfer(marget, 15);
  codey.energyReport();
  marget.energyReport();
  marget.energyTransfer(codey, 35);
  codey.energyReport();
  marget.energyReport();
  

}


}