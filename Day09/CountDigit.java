//Counting digits in a number
package Day09;

public class CountDigit {
    public static void main(String[] args) {
        int num=305;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("\nTotal digits in number:"+count);
    }
    
}
