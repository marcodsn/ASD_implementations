import java.util.Arrays;

public class Main {

    static int[] a = {3, 5, 8, 4, 1, 6};
    static int[] b = {1, 0, 8, 4, 2, 5};
    static int[] o = {1, 2, 3, 4, 5, 6, 7, 8};
    static int[] votes = {4, 1, 1, 1, 4, 5, 1};
    static int[] mSort = {4, 3, 6, 2, 7, 6, 33, 1};
    static int[] simHilbert = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(a) + " to " + Arrays.toString(Sort.selectionSort(a)));
        System.out.println("Index: " + Misc.binarySearch(o, 6) );
        System.out.println("Min of " + Arrays.toString(b) + ": " + Misc.searchMin(b));
        System.out.println("Second min: " + Misc.searchSecondMin(b));
        System.out.println("Second min with recursion: " + Misc.searchSecondMinRecDelegator(b));
        System.out.println(Misc.sumEqualKPreSorted(o, 5, 0, o.length-1));
        System.out.println(Misc.sumEqualK(a, 3));
        System.out.println(Misc.majorityFinder(votes));
        // System.out.println(Misc.majorityFinderW(votes));
        Sort.MergeSort(mSort, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
        System.out.println(Misc.kInHilbertHotelVector(simHilbert, 13, 0, 1));
    }
}