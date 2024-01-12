import java.util.*;
public class Main{
  public static void main(String[] args){
    List<Person> persons;// = new ArrayList<>();
    
    
    try {
      Storage.save(Poplutator.generatePersonList(5));
      persons = Storage.fetchPersons();
      System.out.println(persons);
      
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    //persons=Storage.fetchPersons();
   

  }
}
