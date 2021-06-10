class Student 
{
 
    private String stdName; 
    private int stdRollNo;          
    private int stdId;  
    
    
    // getters
    public String getStdName()
    {
          
      return stdName;         
    }         
    public int getStdRollNo()
    { 
      
      return stdRollNo;         
    }         
    public int getStdId()
    {             
     return stdId;       
    } 
        

    //setters
    public void setStdName(String name)
    {             
      if(name.equals(""))
       {
         System.out.println("Name cannot be empty!");
          return ;
       }
      stdName = name;         
    }         
    public void setStdRollNo(int rollNo)
    {            
      stdRollNo = rollNo;   
    }         
    public void setId(int id)
    {             
      stdId = id;        
    }      
   } 
public class EncapsulationTest
{    
 public static void main(String[]args)
 { 

     Student obj = new Student(); 
         
      obj.setStdName("");           
      obj.setStdRollNo(1702710026);           
      obj.setId(12345);
         
      System.out.println("Student's Name: " +obj.getStdName());           
      System.out.println("Student's Roll no.: " +obj.getStdRollNo());           
      System.out.println("Student's Id: " +obj.getStdId());    
   } 
  }