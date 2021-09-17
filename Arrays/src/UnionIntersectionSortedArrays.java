import java.util.ArrayList;

public class UnionIntersectionSortedArrays {

    public static void main(String[] args) {
        int [] array1 = {1, 5, 5, 10, 10, 15};
        int [] array2 = {2, 3, 4, 5, 10, 10};

        printArray(array1);
        printArray(array2);

        ArrayList<Integer> union = getUnion(array1, array2);
        ArrayList<Integer> intersection = getIntersection(array1, array2);

        System.out.println("union : " + union);
        System.out.println("intersection : " + intersection);
    }

    private static ArrayList<Integer> getIntersection(int[] array1, int[] array2) {
        ArrayList<Integer> intersection = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;

        while (index1 < array1.length && index2 < array2.length) {
            if(array1[index1] < array2[index2]) {
                index1++;
            } else if (array1[index1] > array2[index2]) {
                index2++;
            } else {
                if(intersection.size() > 0 && intersection.get(intersection.size() -1) != array1[index1]) {
                    intersection.add(array1[index1]);
                } else if (intersection.size() == 0) {
                    intersection.add(array1[index1]);
                }
                index1++;
                index2++;
            }
        }
        return intersection;
    }

    private static ArrayList<Integer> getUnion(int[] array1, int[] array2) {
        ArrayList<Integer> union = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;
        if(array1[index1] < array2[index2]) {
            union.add(array1[index1]);
            index1++;
        } else {
            union.add(array2[index2]);
            index2++;
        }

        while (index1 < array1.length && index2 < array2.length) {
            if(array1[index1] < array2[index2]) {
                if(union.get(union.size() - 1) != array1[index1]) {
                    union.add(array1[index1]);
                }
                index1++;
            } else if (array1[index1] > array2[index2]) {
                if(union.get(union.size() - 1) != array2[index2]) {
                    union.add(array2[index2]);
                }
                index2++;
            } else {
                if(union.get(union.size() - 1) != array1[index1]) {
                    union.add(array1[index1]);
                }
                index1++;
                index2++;
            }
        }

        while(index1 < array1.length) {
            if(union.get(union.size() - 1) != array1[index1]) {
                union.add(array1[index1]);
            }
            index1++;
        }

        while(index2 < array2.length) {
            if(union.get(union.size() - 1) != array2[index2]) {
                union.add(array2[index2]);
            }
            index2++;
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
