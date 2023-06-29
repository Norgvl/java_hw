import java.util.HashMap;
import java.util.Iterator;

public class sem6 {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OB = new Object();
    public static void main(String[] args) {
        add(2);
        add(5);
        add(57);
        add(18); 
        add(55);
        add(0);
        add(6);
        add(43);
        add(12);

        ToString();
        System.out.println();
        System.out.println(findElem(5));

    }

    public static void add(Integer number){
        hMap.put(number, OB);   
    } 


    private static void ToString(){
        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }


    private static int findElem(int index){
        return (Integer)hMap.keySet().toArray()[index];
    }      
}