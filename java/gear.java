import java.io.*;
interface Vehicle
{
    void ChangeGear(int a);
    void SpeedUp(int a);
    void ApplyBreak(int a);
}
class Bicycle implements Vehicle
{
    int speed;
    int gear;
    public void ChangeGear(int newgear)
    {
        gear=newgear;
    }
    public void SpeedUp(int increment)
    {
        speed=speed+increment;
    }
    public void ApplyBreak(int decrement)
    {
        speed= speed-decrement;
    }
    public void printstate()
    {
        System.out.println("Rasing Speed:"+speed+"\t\tChanging Gear:"+gear);
    }
}
class Bike implements Vehicle
{
    int speed;
    int gear;
    public void ChangeGear(int newgear)
    {
        gear=newgear;
    }
    public void SpeedUp(int increment)
    {
        speed=speed+increment;
    }
    public void ApplyBreak(int decrement)
    {
        speed=speed-decrement;
    }
    public void printstate()
    {
        System.out.println("Increzing Speed:"+speed+"\tChanging Gear:"+gear);
    }
}
class gear {
    public static void main(String args[]) {
        Bicycle bi = new Bicycle();
        bi.ChangeGear(2);
        bi.SpeedUp(3);
        bi.ApplyBreak(1);
        System.out.println("Bicycle Present state:");
        bi.printstate();
        Bike bk = new Bike();
        bk.ChangeGear(1);
        bk.SpeedUp(4);
        bk.ApplyBreak(3);
        System.out.println("Bike Present State:");
        bk.printstate();
    }
}