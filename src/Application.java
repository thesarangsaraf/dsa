import binarysearch.BinarySearch;

public class Application {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int valueIndex = binarySearch.search(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}, 15);
        System.out.println(valueIndex);
    }
}