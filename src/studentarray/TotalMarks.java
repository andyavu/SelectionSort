package studentarray;

public class TotalMarks 
{
    private final int MAX_STUDENTS = 10;
    private int numStudents, listStudents;
    private Student[] student;
    
    public TotalMarks()
    {
        numStudents = 0;
        listStudents = 0;
        student = new Student[MAX_STUDENTS];
    }
    public void add(Student s)
    {
        int i = listStudents;
        for( ; i < MAX_STUDENTS; i++)
        {
            student[i] = s;
        }
        listStudents++;
    }
    public String studentList()
    {
        String string = "";
        int i = 0;
        string += "\tName\t  Bronco ID\tAge\tTotal Marks\n-----------------------------------------------------------\n";
        for( ; i < listStudents - 1; i++)
        {
            string += " " + (i + 1) + ".) " + student[i] + "\n";
        }
        string += (i + 1) + ".) " + student[i] + "\n";
        return string;
    }
    public void selectionSort(Student s)
    {
        int newTotal = s.getTotalMarks();
        if(numStudents >= MAX_STUDENTS)
        {
            if(newTotal <= student[numStudents - 1].getTotalMarks())
            {
                return;
            }
        }
        else
        {
            numStudents++;
            int i = numStudents - 1;
            for( ; (i >= 1) && (newTotal > student[i - 1].getTotalMarks()); i--)
            {
                student[i] = student[i - 1];
            }
            student[i] = s;
        }
    }
    public String toString()
    {
        String string = "";
        int i = 0;
        string += "\tName\tBronco ID\tAge\tTotal Marks\n-----------------------------------------------------------\n";
        for( ; i < numStudents - 1; i++)
        {
            string += " " + (i + 1) + ".)" + student[i] + "\n";
        }
        string += (i + 1) + ".) " + student[i] + "\n";
        return string;
    }
}