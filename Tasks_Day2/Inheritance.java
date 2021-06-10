package Tasks_Day2;

class Teacher {
    String designation = "Teacher";
    String collegeName = "Beginnersbook";
    void does(){
     System.out.println("Teaching");
    }
 }
 
class PhysicsTeacher extends Teacher{
    String mainSubject = "Physics";

 }

public class Inheritance {
    public static void main(String[] args) {
    PhysicsTeacher obj = new PhysicsTeacher();
     System.out.println(obj.collegeName);
     System.out.println(obj.designation);
     System.out.println(obj.mainSubject);
     obj.does();
        
    }
    
}
