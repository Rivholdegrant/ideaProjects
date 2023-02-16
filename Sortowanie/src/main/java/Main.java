public class Main {
    public static void main(String[] args) {

        int[] random = {1,15,23,358,75,15,12,11,5,6,7,9,1,5,4,6,23,5,8,9,4,3,4,8,8,5,2,4,8,6};

        System.out.println("Random: ");
        printTab(random);
        System.out.println("Sorted: ");
        printTab(Sort.bubbleSort(random, true));
        System.out.println("Reverse: ");
        printTab(Sort.bubbleSort(random, false));

    }

    static void printTab(int[] tab)
    {
        for (int n : tab)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
}