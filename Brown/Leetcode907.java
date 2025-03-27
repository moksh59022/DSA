package Brown;

import java.util.*;

public class Leetcode907 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sumSubarrayMins(arr));
    }
        public static int sumSubarrayMins(int[] arr) {
            int total = 0;
            int mod = (int)(1e9 + 7);
            int n = arr.length;

            int[] pse = pse(arr);
            int[] nse = nse(arr);

            for (int i = 0; i < n; i++) {
                int left = i - pse[i];
                int right = nse[i] - i;

                total = (total + (int)((1L * right * left * arr[i]) % mod)) % mod;
            }
            return total;
        }

        public static int[] nse(int[] arr) {
            int n = arr.length;
            int[] nse = new int[n];
            Stack<Integer> st = new Stack<>();
            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                    st.pop();
                }
                nse[i] = st.isEmpty() ? n : st.peek();
                st.push(i);
            }
            return nse;
        }

        public static int[] pse(int[] arr) {
            int n = arr.length;
            int[] pse = new int[n];
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && arr[i] < arr[st.peek()]) { // Changed here
                    st.pop();
                }
                pse[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }
            return pse;
        }
    }


