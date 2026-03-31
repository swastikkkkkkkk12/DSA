public class largest_element {
    public static void main(String[] args){
        int a[] = {1,2,3,45,56};
        int largest = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }
        System.out.println("Largest element in the array is: " + largest);

    }
    
}
