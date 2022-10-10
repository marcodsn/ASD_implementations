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
}
