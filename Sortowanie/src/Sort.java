public class Sort {

    public static int[] bubbleSort(int[] collection, boolean ascending)
    {
        int temp;
        int length = collection.length;

        if (ascending) {
            while (length > 1) {
                for (int i = 0; i < length - 1; i++) {
                    if (collection[i] > collection[i + 1]) {
                        temp = collection[i];
                        collection[i] = collection[i + 1];
                        collection[i + 1] = temp;
                    }
                }
                length--;
            }
        }else {
            while (length > 1) {
                for (int i = 0; i < length - 1; i++) {
                    if (collection[i] < collection[i + 1]) {
                        temp = collection[i];
                        collection[i] = collection[i + 1];
                        collection[i + 1] = temp;
                    }
                }
                length--;
            }
        }

        return collection;
    }
}
