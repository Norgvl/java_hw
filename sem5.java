import java.util.HashMap;

public class sem5 {
    public static void main(String[] args) {



        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Александр","+12312313");
        hashMap.merge("Александр", "+23133955", (old, ne) -> old+" "+ne);

        hashMap.put("Анна","+12312313");
        hashMap.merge("Анна", "+23133955", (old, ne) -> old+" "+ne);
        hashMap.merge("Анна", "+23133912", (old, ne) -> old+" "+ne);
        hashMap.merge("Анна", "+23133934", (old, ne) -> old+" "+ne);

        hashMap.put("Олег","+12312546");

        hashMap.put("Николай","+23834823");
        hashMap.merge("Николай", "+23133546", (old, ne) -> old+" "+ne);
        hashMap.merge("Николай", "+23133438", (old, ne) -> old+" "+ne);

        System.err.println(hashMap+"\n");

        String[] arr = new String[hashMap.size()];
        int j = 0;

        for (String i : hashMap.values()) {
        arr[j] = i;   
        j++;
        }

        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            int index = i;
            for (int k = i; k < arr.length; k++) {
                if (arr[i].length() < arr[k].length()){
                    arr[i] = arr[k];
                    index = k;
                }
                
            }
            arr[index] = temp; 
            System.out.println(arr[i]);
        }
    }
}
