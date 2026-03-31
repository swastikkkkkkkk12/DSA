public class second_largest {
    public static void main(String[] args) {
        int a[]={1,2,4,7,7,5};
        int largest = a[0];
        int slargest = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if (a[i]>largest){
                slargest = largest;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>slargest){
                slargest = a[i];
                // This part determines the seocnd largest
            }
        }
        System.out.println("Second largest element in the array is: " + slargest);
    }
}

