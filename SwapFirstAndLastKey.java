import java.util.ArrayList;
public class SwapFirstAndLastKey
{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Dobby");
        names.add("Hedwig");
        names.add("Buckbeak");
        names.add("Fang");
                
        int last = names.size();
        System.out.println(last);
        System.out.println(names);
        // enter your code here
        
        /* this will be the most common
         * solution
         */
        String temp = names.get(0);
        names.set(0, names.get(names.size() - 1));
        names.set((last - 1), temp);
        
        // or this also works
        // String temp = names.set(0, names.get(names.size() -1));
        // names.set(names.size() - 1, temp);
        
         
        
        System.out.println(names);
    }
}
