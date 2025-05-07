package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q27918 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = -1; // 경기 수
        int x = 0, y = 0;
        try {
            N = Integer.parseInt(br.readLine());
            for(int i=0;i<N;i++){
                //N개의 줄에 예측(D = x/P = y)
                String prediction = br.readLine();
                if(Math.abs(x-y) == 2){
                    continue;
                }
                switch(prediction){
                    case "D":
                        x++;
                        break;
                    case "P":
                        y++;
                        break;
                    default:
                }
            }
        } catch(IOException e){}
        System.out.println(x+":"+y);


    }

}

