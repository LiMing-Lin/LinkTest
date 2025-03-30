import org.junit.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int array[] = new int[6];
        for(int i=0;i<6;i++){
            array[i]= scanner.nextInt();
        }
        //冒泡排序
        for(int i=0;i<6;i++){

            for(int j = i;j<5;j++){
                if(array[j]>array[j+1]){
                    int temporary = array[i];
                    array[i] = array[j];
                    array[j]= temporary;
                }

            }

        }
        for(int i =0;i<6;i++){
            System.out.println(array[i]+"   ");
        }

    }
}
