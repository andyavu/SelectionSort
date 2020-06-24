package studentarray;

public class StudentArray
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Becky", "012264445", 0, 0);
        Student s2 = new Student("Dinh", "012264446", 0, 0);
        Student s3 = new Student("Andy", "012264447", 0, 0);
        Student s4 = new Student("Kathy", "041634564", 0, 0);
        Student s5 = new Student("Thomas", "503918754", 0, 0);
        Student s6 = new Student("Tracy", "749206773", 0, 0);
        Student s7 = new Student("Cindy", "457014783", 0, 0);
        Student s8 = new Student("Han", "126726630", 0, 0);
        Student s9 = new Student("Tin", "506416371", 0, 0);
        Student s10 = new Student("Van", "377647465", 0, 0);
        TotalMarks total = new TotalMarks();
        total.add(s1);
        total.add(s2);
        total.add(s3);
        total.add(s4);
        total.add(s5);
        total.add(s6);
        total.add(s7);
        total.add(s8);
        total.add(s9);
        total.add(s10);
        System.out.println(total.studentList());
        total.selectionSort(s1);
        total.selectionSort(s2);
        total.selectionSort(s3);
        total.selectionSort(s4);
        total.selectionSort(s5);
        total.selectionSort(s6);
        total.selectionSort(s7);
        total.selectionSort(s8);
        total.selectionSort(s9);
        total.selectionSort(s10);
        System.out.println("Selection Sort\n" + total.toString());
    }
}