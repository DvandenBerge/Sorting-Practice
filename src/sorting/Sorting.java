package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author dvandenberge
 */
public class Sorting {

    public static void main(String[] args) {
        Turkey t1=new Turkey("Willy","TKY1",4);
        Turkey t2=new Turkey("Gobbly","TKY2",6);
        Turkey t3=new Turkey("Baster","TKY3",5);
        
        Set treeSet1=new TreeSet();
        treeSet1.add(t1);
        treeSet1.add(t2);
        treeSet1.add(t3);
        treeSet1.add(t2);
        
        List<Turkey> list1=new ArrayList<Turkey>(treeSet1);
        
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i).toString());
        }
        
    }
    
}
