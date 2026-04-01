public class sorting_array {
    public static void main(String [] args){
        int a[] = {11, 45, 76, 34, 56, 89, 90};

        boolean isSorted = true;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);
    }
    
}
