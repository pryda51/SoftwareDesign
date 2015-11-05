package mx.iteso.adapter.enemy;

// This is the Adaptee. The Adapter sends method calls
// to objects that use the EnemyAttacker interface
// to the right methods defined in EnemyRobot

public interface EnemyRobot {

    public boolean smashWithHands();

    public boolean walkForward();

    public boolean reactToHuman(String driverName);

}
