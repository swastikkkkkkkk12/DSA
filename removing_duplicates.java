public class removing_duplicates {
    public static void main(String[] args) {
        int a[] = {1,1,2,2,3,3};
        
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[i] != a[j]){
                a[+1] = a[j];
                i++;
            }
        }
        System.out.println(i + 1);
    }
}
