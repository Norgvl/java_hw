// Формат сдачи: ссылка на подписанный git-проект.

// Задание

// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Random;

public class sem3 {
    public static void main(String[] args) {
    // 1)
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10; i++){
            int k = new Random().nextInt(10);
            System.out.print(k+" ");
            list.add(k);
        }
        System.out.println(" ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 | list.get(i) == 0){
                list.remove(i);
            }
            
        }
        for (int i = 0; i <list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(" ");
    //2)
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) > max ){
                max = list.get(i);

            }
        }
        System.out.println("max: "+max);
    //3)
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) < min ){
                min = list.get(i);

            }
        }
        System.out.println("min: "+min);
    //4)
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);

        }
        int ave = sum / list.size();
        System.out.println("average: "+ ave);
    }
    

}
