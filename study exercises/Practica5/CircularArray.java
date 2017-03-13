public class CircularArray {

    public static void main(String[] args) {
     
        int n = 3;
        int k = 1;
        int q = 3;
        int[] a = new int[] { 1, 2, 3 };
        int[] b = new int[n];
        int[] val = new int[] { 0, 1, 2 };


        if (k > n) {
            k = k % n;
        }
        if (k == 0) {
            for (int i = 0; i < q; i++) {
                System.out.println(b[val[i]]);
            }
        }

        int j = 0;
        int a1 = 0;
        for (int i = n - k; i <= n - 1; i++) {
            b[j] = a[i];
            j++;
        }
        for (int b1 = j + 1; b1 <= n - 1; j++) {
            b[b1] = a[a1];
        }
        for (int i = 0; i < q; i++) {
            System.out.println(b[val[i]]);
        }
    }


}

