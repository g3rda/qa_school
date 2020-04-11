package HW2;

public class SumOfOdd {
    public static void main(String[] args) {
        int sum=0;
        int [] array = {0,5,2,4,7,1,3,19};
        for(int p:array){
            if(p%2==1) sum+=p;
        }
        System.out.println(sum);
    }
}
