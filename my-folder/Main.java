public class Main{
    public static void main(String args[]){
        subsystems FRC = new subsystems("Code orange",3476);
        FRC.shooter_setter(5);
        FRC.hood_setter(74);
        FRC.result();
    }
}
