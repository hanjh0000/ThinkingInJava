import com.sun.jdi.Value;

import java.util.Random;

public class Sort {
    public static void sort(Comparable[] a){
        for (int n =0 ; n < a.length ; n++) {
            int k = n;
            for (int i = n; i < a.length; i++) {
                if (!less(a[k], a[i])) k = i;
            }
            exch(a,k,n);
        }

    }

    public static void popSort(Comparable[] integer){
        int N = integer.length;
        for (int j = N;j > 0; j--){
            for (int i = j; i < integer.length; i++) {
            if (less(integer[i],integer[i-1])) exch(integer,i,i-1);
        }}
    }

    public static void insertSort(Comparable[] integer){
        int N = integer.length;
        for (int k = 1;k<N;k++){
        for(int i = k;i>0;i--){
            if (less(integer[i-1],integer[i])) break;
            exch(integer, i,i-1);
        }}
    }

    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] c,int a ,int b){
        Comparable t = c[a];
        c[a] = c[b];
        c[b] = t;
    }

    private static void show(Comparable c[]){
        for (Comparable t : c){
            System.out.println(t + "  ");
        }
    }

    public static boolean isSort(Comparable[] c){
        for (int i = 0;i < c.length ;i++){
            if (less(c[i],c[i+1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[20];
        gen(a);
        insertSort(a);
        assert isSort(a);
        show(a);
    }

    private  static void gen(Integer[] integer){
        Random random = new Random();
        for (int i = 0;i<integer.length;i++) {
            integer[i] = random.nextInt(100);
        }
    }

}
