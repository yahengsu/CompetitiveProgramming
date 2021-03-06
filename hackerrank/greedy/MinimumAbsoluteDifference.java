package hackerrank.greedy;

import java.util.*;
import java.io.*;
import java.math.*;

public class MinimumAbsoluteDifference {
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main (String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        // br = new BufferedReader(new FileReader("in.txt"));
        // out = new PrintWriter(new FileWriter("out.txt"));

        int n = readInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = readInt();
        }

        Arrays.sort(a);

        int min = Integer.MAX_VALUE;

        for(int i  = 0; i < n-1; i++){
            int diff = a[i+1] - a[i];
            if(diff<min)
                min = diff;
        }

        out.write(String.valueOf(min));


        out.close();
    }

    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(in.readLine().trim());
        return st.nextToken();
    }

    static long readLong () throws IOException {
        return Long.parseLong(next());
    }

    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter () throws IOException {
        return next().charAt(0);
    }

    static String readLine () throws IOException {
        return in.readLine().trim();
    }

}
