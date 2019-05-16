package bytedance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) {
        InputReader s=new InputReader(System.in);
        int n=s.nextInt();
        int[] buildings=new int[n];
        for (int i=0;i<n;i++){
            buildings[i]=s.nextInt();
        }
        int result=0;
        for(int i=n-1;i>=0;i--){
            int remain=(result+buildings[i])%2;
            result=remain==1?(result+buildings[i])/2+1:(result+buildings[i])/2;
        }
        System.out.println(result);
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
