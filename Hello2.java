import java.util.Scanner;

public class Hello2 {
    public static void main (String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your Number :");
    int num = sc.nextInt();

    String result = (num%2==0)?"Even":"Odd";
    System.out.println(result);

    ------------ // AND // ----------

    if(num%2==0) {
        System.out.print("You Entered Number "+ num +" is Even");
    }
    else {
        System.out.print("You Entered Number "+ num +" is Odd");
    }

 -------------------------------------------//


    for(int i=1; i<11; i++) {
        System.out.println(i);
    }

-------------------------------------------//

    int[] arr = new int[5];
    arr[0] = 90;
    arr[1] = 80;
    arr[2] = 170;
    arr[3] = 60;
    
    int max = arr[0];
    for (int i=0; i<arr.length; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    System.out.println(max);
    
// -------------------------------- //

public static int countVowels(String s) {
    int count = 0;
    String vowels = "aeiou";

    for (char c : s.toLowerCase().toCharArray()) {
        if (vowels.contains(c+"")) {
            count++;
        }
    }

    return count;
}

public static void main(String[] args) {
    System.out.println(countVowels("apple"));
}


    }
}