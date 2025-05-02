package baekjoon;

import java.io.*;
import java.util.*;

public class B1000 {
	
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            int answer = a+b;
           
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(answer+"");
            bw.flush();
            bw.close();
            
        } catch(Exception e){}
	}

}
