import java.util.Scanner;
import java.util.ArrayList;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class Lab9ShortAnswer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Q1
        
        ArrayList<String> st = new ArrayList<>();
        
        st.add("Bird");
        st.add("Cow");
        st.add("Bat");
        System.out.println(st.get(0) + " is one of " + st.size());
        
        //Q2
        
        
        st.add("Iguana");
        String word = "Rincewind";
        st.add(1, word);
        System.out.println(st);
        
        
        //myMethod(st);
        //System.out.println(st.get(2));
        
        // for(String s: st){
            // System.out.println("Slytherin rules.");
        // }// end for
        
        // ArrayList<String> stAgain = new ArrayList<>();
        // stAgain = st;
        // st.set(1, "Manatee");
        // System.out.println(stAgain);
        
        //Q3
        
        
        String animal = st.set(2, "Koala");
        System.out.println(animal + " is now a " + st.get(1));
        

        //Q4
        
        ArrayList<String> stAgain = new ArrayList<>();
        //stAgain = new ArrayList<>();
        stAgain = st;
        st.set(1, "Manatee");
        System.out.println(stAgain);
        
        //Q5
        
        
        int index = st.indexOf("Bat");
        for(int i = 0; i < index; i++){
            System.out.print(st.get(i) + " ");
        }// end for
        
        
        System.out.println();
        
        
        System.out.println("end of program");
    }
    
    public static void myMethod(ArrayList<String> list){
       list.set(2, "Robin"); 
    }//end myMethod
}
