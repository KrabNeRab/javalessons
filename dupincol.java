
import java.util.*;


public class dupincol{
    public static  void  main(String[] args){
        Collection mycol = new ArrayList();
        mycol.add("1");
        mycol.add("2");
        mycol.add("3");
        mycol.add("3");
        mycol.add("1");

        System.out.println(mycol);

        Set<String> set = new HashSet<>(mycol);
        mycol.clear();
        mycol.addAll(set);
        System.out.println(mycol);




    }
}
