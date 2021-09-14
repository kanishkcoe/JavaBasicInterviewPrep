import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class UnionIntersectionAnyArray {

    public static void main(String[] args) {
        int [] array1 = {15, 10, 5, 10, 5};
        int [] array2 = {15, 3, 2, 10, 4};

        printArray(array1);
        printArray(array2);

        LinkedList<Integer> union = getUnion(array1, array2);
        LinkedList<Integer> intersection = getIntersection(array1, array2);

        System.out.println("union : " + union.toString());
        System.out.println("intersection : " + intersection.toString());
    }

    private static LinkedList<Integer> getIntersection(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        LinkedList<Integer> intersection = new LinkedList<>();


        for (int element : array1) {
            set.add(element);
        }

        for(int element : array2) {
            if(set.contains(element)) {
                intersection.add(element);
                set.remove(element);
            }
        }

        return intersection;
    }

    private static LinkedList<Integer> getUnion(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        LinkedList<Integer> union = new LinkedList<>();

        for( int element : array1 ) {
            set.add(element);
        }

        for( int element : array2 ) {
            set.add(element);
        }

        for (int element : set) {
            union.add(element);
        }

        return union;
    }

    private static void printArray(int[] array1) {
        System.out.println("+++++++++++++++++++++++++++++++++");
        for( int element : array1) {
            System.out.print(element + ", ");
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++");
    }


}
