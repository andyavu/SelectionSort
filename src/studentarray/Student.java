package studentarray;

import java.util.Random;

public class Student 
{
    Random random = new Random();
    private String name, broncoID;
    private int age, totalMarks;
    
    public Student(String name, String broncoID, int age, int totalMarks)
    {
        this.name = name;
        this.broncoID = broncoID;
        age = random.nextInt(11) + 15;
        this.age = age;
        totalMarks = random.nextInt(101);
        this.totalMarks = totalMarks;
    }
    public String getName()
    {
        return name;
    }
    public String getBroncoID()
    {
        return broncoID;
    }
    public int getAge()
    {
        return age;
    }
    public int getTotalMarks()
    {
        return totalMarks;
    }
    public String toString()
    {
        return "\t" + name + " \t" + broncoID + "\t" + age + "\t" + totalMarks;
    }
}
