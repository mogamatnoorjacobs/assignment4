package Chatpter4Assignment.Question3.Singleton.Obey;

/**
 * Created by fatimam on 2016-06-21.
 */
public class ObeySingletonCalcSalary
{
    private double salary;
    private static double tax=0.14;
    public double calculateSalary(double amount)
    {

        salary=amount-(amount*tax);
        return salary;
    }
}
