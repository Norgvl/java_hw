// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

import java.util.Random;

/**
 * sem1
 */
public class sem1 {


    public static int RNumber() {
        int i = new Random().nextInt(2000); 
        System.out.println("Случайное число: "+ i);
        return i;
    }
    public static int MB(int i) {
        int n = Integer.toBinaryString(i).length()-1;
        System.out.println("Номер старшего значащего бита: " + n);
        return n;
    }
    public static void array1(int n, int j){
        int count = 0;
        for (int i = j; i < Short.MAX_VALUE; i++) {
            if (i % n == 0) count++; 
        }
        int[] m1 = new int[count];
        int c = 0;
        for (int i = j; i < Short.MAX_VALUE; i++)
        {
            if (i % n == 0) {
                m1[c] = i;
                c++;
        }
        }
        int m = m1.length;
        System.out.println("Длина первого массива: "+m);
    }
        public static void array2(int n, int j){
        int count = 0;
        for (int i = Short.MIN_VALUE; i < j; i++) {
            if (i % n != 0) count++; 
        }
        int[] m2 = new int[count];
        int c = 0;
        for (int i = Short.MIN_VALUE; i < j; i++)
        {
            if (i % n != 0) {
                m2[c] = i;
                c++;
        }
        }
        int m = m2.length;
        System.out.println("Длина второго массива: "+m);
    }
        public static void main(String[] args) {
        int i = RNumber();
        int n = MB(i);
        array1(n,i);
        array2(n,i);
    }
}

