public class Misc {

    private Misc() {
        throw new UnsupportedOperationException();
    }

    public static int binarySearch(int[] a, int x) {
        int curlength = a.length;
        int start = 0;
        while (curlength > 1) {
            int div = curlength / 2;
            curlength = div;
            if (a[start + div - 1] < x) {
                start += div;
            }
        }
        // System.out.println(a[start]);
        return start;
    }

    public static int searchMin(int[] a) {
        int min = a[0];
        for (int j = 1; j < a.length; j++) {
            if (a[j] < min) {
                min = a[j];
            }
        }
        // System.out.println(min);
        return min;
    }

    public static int searchSecondMin(int[] a) {
        int min = a[0];
        int secondMin = a[1];
        for (int j = 1; j < a.length; j++) {
            /*if (a[j] < min) {
                secondMin = min;
                min = a[j];
            } else if (a[j] < secondMin) {
                secondMin = a[j];
            }*/
            if (a[j] <= secondMin) {
                // secondMin = a[j];
                if (a[j] < min) {
                    secondMin = min;
                    min = a[j];
                } else {
                    secondMin = a[j];
                }
            }
        }
        return secondMin;
    }

    public static int searchSecondMinRecDelegator(int[] a) {
        return searchSecondMinRec(a, 1, a[0], a[1]);
    }

    public static int searchSecondMinRec(int[] a, int j, int min, int secondMin) {
        // int min = a[j-1];
        // int secondMin = a[j];
        if (j < a.length) {
            /*if (a[j] < min) {
                secondMin = min;
                min = a[j];
            } else if (a[j] < secondMin) {
                secondMin = a[j];
            }*/
            if (a[j] <= secondMin) {
                // secondMin = a[j];
                if (a[j] < min) {
                    secondMin = min;
                    min = a[j];
                } else {
                    secondMin = a[j];
                }
            }
            return searchSecondMinRec(a, j + 1, min, secondMin);
        } else {
            return secondMin;
        }
    }

    static boolean sumEqualK(int[] a, int k) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean sumEqualKPreSorted(int[] a, int k, int i, int j) {
        // m+M, =k: end; <k: increase i, ignore m; >k: decrease j, ignore M
        if (i == j) {
            return false;
        }
        if (a[i] + a[j] == k) {
            return true;
        } else if (a[i] + a[j] < k) {
            return sumEqualKPreSorted(a, k, i + 1, j);
        } else if (a[i] + a[j] > k) {
            return sumEqualKPreSorted(a, k, i, j - 1);
        } else {
            return false;
        }
    }

    /*static boolean moreThanHalfW(int[] a) { // Only checks if the first element is repeated more than n/2 times
        int n = a.length;
        // int goal = (int) Math.ceil((double) n / 2);
        int c = 0;
        for (int i = 1; i < n-1; i++) {
            if (a[i] == a[0]) {
                c++;
            } else {
                c--;
            }
        }
        return c > 0;
    }*/

    static int moreThanHalf(int[] a) {
        int el = a[0];
        int c = 1;
        for (int i = 1; i < a.length-1; i++) {
            if (c == 0) {
                el = a[i];
                c++;
            } else if (a[i] == el) {
                c++;
            } else {
                c--;
            }
        }
        return el;
    }
}
