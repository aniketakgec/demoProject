import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Program
{
   private ArrayList<Integer> data;
 

   Program()
   {
       data=new ArrayList<Integer>();
      
   }
   
   public void InsertValue(int d)
   {
       data.add(d);
   }
   

   public List<Integer> getSortedList()
   {
       Collections.sort(data);
       return data;
   }



    public static void main(String[] args) {
        
        Program p=new Program();
        p.InsertValue(5);
        p.InsertValue(2);
        p.InsertValue(4);
        p.InsertValue(3);
        p.InsertValue(1);

        List<Integer> result=p.getSortedList();
        for (Integer i : result) {
            System.out.println(i);
        }



    }
}