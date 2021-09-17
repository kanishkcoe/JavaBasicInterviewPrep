public class MedianInEqualSizeArray {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 3, 4, 50, 65, 86, 97};
        int [] b = {1, 2, 3, 13, 44, 45, 55, 96, 107};

        float median = medianOfArray(a, b);

        System.out.println(median);
    }

    private static float medianOfArray(int [] a, int [] b) {
        boolean evenCase = false;
        if((a.length + b.length) % 2 == 0) {
            evenCase = true;
        }

        int medianIndex = (a.length + b.length) / 2;

        int aIndex = 0;
        int bIndex = 0;
        int mainIndex = 0;

        int [] medianArray = new int[a.length + b.length];

        while(aIndex < a.length && bIndex < b.length) {
            if(a[aIndex] < b[bIndex]) {
                medianArray[mainIndex] = a[aIndex];
                mainIndex++;
                aIndex++;
            } else {
                medianArray[mainIndex] = b[bIndex];
                mainIndex++;
                bIndex++;
            }
        }

        while(aIndex < a.length) {
            medianArray[mainIndex] = a[aIndex];
            mainIndex++;
            aIndex++;
        }

        while(bIndex < b.length) {
            medianArray[mainIndex] = b[bIndex];
            mainIndex++;
            bIndex++;
        }

        if(evenCase) {
            return ((float) medianArray[medianIndex - 1] + (float) medianArray[medianIndex]) / 2;
        }
        return medianArray[medianIndex];
    }
}
