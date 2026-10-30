public class Student {
    String name ;
    String department ;
    int age ;
    public Student(String name,String dep,int age){
        this.name = name;
        this.department = dep;
        this.age = age;
    }
    public void DisplayInfo(){
        System.out.println("Student name :" +this.name);
        System.out.println("department :"+this.department);
        System.out.println("age :"+ this.age);
    }
    public static void main(String[] args) {
        Student s1 = new Student("vetri","CSE", 19);
        s1.DisplayInfo();

    }
}
