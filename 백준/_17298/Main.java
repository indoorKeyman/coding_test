package _17298;

import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int [] arr = new int[n];
        int [] answer = new int[n];

        String[] str = bf.readLine().split(" ");

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        stack.push(0);

        for (int i = 0; i < n; i++) {

            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){

                answer [stack.pop()] = arr[i];

            }

            stack.push(i);
        }

        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < n; i++) {
            bw.write(answer[i] + " ");
        }

        bw.write("\n");
        bw.flush();


    }
}
