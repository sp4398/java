public class SumOfElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=0;

        for(int num:arr){
            sum=sum+num;
        }
        System.out.println(sum);
    }
}