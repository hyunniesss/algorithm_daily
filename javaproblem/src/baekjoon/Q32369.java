package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q32369 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = -1, A = -1, B = -1;
        int[] arr = new int[2];
        Arrays.fill(arr, 1);
        try{
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(str.nextToken());
            A = Integer.parseInt(str.nextToken());
            B = Integer.parseInt(str.nextToken());
            for(int i=0;i<N;i++){
                arr[0] += A;
                arr[1] += B;
                if(arr[0] < arr[1]){ // // 역할을 바꾸는거야
                    swap(arr);
                } else if(arr[0] == arr[1]) {
                    arr[1]--;
                }
            }

        } catch(IOException e){

        }

        System.out.println(arr[0]+" " + arr[1]);


    }

    private static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

}
