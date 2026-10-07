 class Student 
 {
    String name;
    String dept;
    int age;
    Student(String n,String d,int a)
    {
        name=n;
        dept=d;
        age=a;
    }
    /*void setinfo(String n,String d,int a)
    {
        name=n;
        dept=d;
        age=a;


    }*/
    void displayinfo()
    {
        System.out.println("Name : " + name);
        System.out.println("Depertment : " + dept);
        System.out.println("Name : " + age);
    }

}

public class studentData {
    public static void main(String[] args) {
        Student student1 = new Student("Shahidul Alif", "Swe", 22);  
        student1.displayinfo();
        Student student2 = new Student("no name", "cse", 97);

        
        student2.displayinfo();

       

    }

}
