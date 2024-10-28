public class ArrayExample1 {
    public static void main(String[] args) {
        int [] arr= new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;

        //array re-initialize of array
        arr[2]=50;
        System.out.println(arr[0]);//printing with index

        //printing the array using for loop
        for(int i=0;i<=arr.length-1;i++){

            System.out.println(i + " :-> " + arr[i]);
        }
        //printing the array by using enhanced for loop

        for(int printarr: arr){
            System.out.println(printarr);
        }
    }
}
