import java.util.ArrayList;
/**
 * ACS-1903 Lab 9 Q8 
 * @author (your name and student number)
 */
public class FindLargestKey{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(33);
        numbers.add(4);
        numbers.add(32);
        numbers.add(24);
        int largest = Integer.MIN_VALUE;
        
        // enter your code here
        for(int n : numbers)
            largest = Integer.max(largest, n);
        System.out.println(largest); 
        
        /* or you could also use an if
         * statement. 
         */
        for(int n : numbers)
            if(n > largest)
                largest = n;
        System.out.println(largest);        
        /* or you could also use the conditional 
         * operator. while there are some small performance differences
         * between all three options they are 
         * small enogh that the main consideration 
         * in choosing which one to use should be
         * redability, which approach makes the intent of 
         * the code most obvious
         */
        for(int n : numbers)
            largest = n > largest ? n : largest;
       
            
        System.out.println(largest);
    }
}
