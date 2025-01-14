

public class MethodOverloading {
    public static int sum(int ...arr1){ //int arr[]
        int total=0;
        for(int i:arr1){
            total+=i;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5,65}));
        //or
        System.out.println(sum(1,2,3,4,5,65)); 
    }
    
}
