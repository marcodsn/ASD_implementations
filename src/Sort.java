public class Sort {

    private Sort() {
        throw new UnsupportedOperationException();
    }

    public static int[] selectionSort(int[] a) {
        int[] temp = a.clone();
        int[] b = new int[temp.length];
        int curlength = temp.length;
        for (int j=0; j<temp.length; j++) {
            int curmin = temp[0];
            for (int i=1; i<curlength; i++) {
                if (curmin < temp[i]) {
                    temp[i-1] = temp[i];
                } else {
                    temp[i-1] = curmin;
                    curmin = temp[i];
                }
            }
            b[j] = curmin;
            curlength = curlength - 1;
        }
        // System.out.println(Arrays.toString(b));
        return b;
    }

    static void Merge(int[] a, int p, int q, int r) {
        int k = q - p + 1;
        int[] b = new int[k];
        int i = p;
        int j = r + 1;
        for (int idx = 0; idx < k; idx++) {
            if (i < r + 1 && j < q + 1) {
                if (a[i] <= a[j]) {
                    b[idx] = a[i];
                    i++;
                } else {
                    b[idx] = a[j];
                    j++;
                }
            } else if (i == r + 1 && j < q + 1) {
                b[idx] = a[j];
                j++;
            } else if (i < r + 1 && j == q + 1) {
                b[idx] = a[i];
                i++;
            }
        }
        for (int idx = 0; idx < k; idx++) {
            a[p + idx] = b[idx];
        }
    }

    static void MergeSort(int[] a, int p, int q) {
        if (p < q) {
            int r = (p + q) / 2;
            MergeSort(a, p, r);
            MergeSort(a, r + 1, q);
            Merge(a, p, q, r);
        }
    }
}
