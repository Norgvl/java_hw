// Организовать вводи и хранение данных пользователей. ФИО возраст и пол
// вывод в формате Фамилия И.О. возраст пол
// добавить возможность выхода или вывода списка отсортированного по возрасту!)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.zip.Adler32;

public class sem4 {
    public static void main(String[] args) {

        ArrayList<String> mainList = new ArrayList();
        Scanner in = new Scanner(System.in);
        String st = "";
        while (!st.equals("stop")) {
            System.out.println("Введите ФИО, ворзаст, (чтобы завершить, введите 'stop'): ");
            st = in.nextLine();

            if (!st.equals("stop")){
                // mainList.add(st);
                String[] arrs = new String[3];
                arrs = st.split(",");

                String[] fio = new String[3];

                fio = arrs[0].split(" ");

                String finStr = arrs[1]+fio[0]+" "+fio[1]+" " +fio[2]+arrs[1]+arrs[2];

                mainList.add(finStr);
            }
        }
        mainList.sort(Comparator.naturalOrder());
        
        for (int i = 0; i < mainList.size(); i++) {
            
            System.out.println(mainList.get(i).substring(3));
        }
    }
}
