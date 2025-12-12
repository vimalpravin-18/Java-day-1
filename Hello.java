import java.util.Scanner;

public class Hello {
    public static void main ( String[] args) {

        // VARIABLE DECLARATION

        int Num = 10;
        double val = 10.90;
        char letter = 'A';
        boolean IsStudent = true;
        String Name = "Vimal";

        System.out.println(Num);
        System.out.println(val);
        System.out.println(letter);
        System.out.println(IsStudent);
        System.out.println(Name);


        // INPUT FROM USER


        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Name :");
        String Name = sc.nextLine();

        System.out.println("Enter Your Age :");
        int age = sc.nextInt();

        System.out.println("Your Name is "+ Name + " and Your Age is " + age);


        // OPERATORS

        int a = 5 , b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(a % b);


        // CONDITIONALS


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your mark :");
        int marks = sc.nextInt();

        if (marks >= 85) {
            System.out.println(" Your Mark is: " + marks + " And your Grade is 'A' ");
        }

        else if(marks <= 85) {
            System.out.println("Your Mark is: " + marks + " And your Grade is 'B'  ");
        }

        else {
            System.out.println("Your Mark is: " + marks + " And your Grade is 'C'  ");
        }

        
        // LOOP CONDITIONS


        for ( int i=0; i<10; i++) {
            System.out.println("number starts from:" + i);
        }


        int j = 1;
        while(j <= 5) {
            System.out.println("while loop j :"+ j);
            j++;
        }
        
        // ARRAYS // One dimensional


        int[] number = new int[5];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        for (int i=0; i < number.length; i++) {
            System.out.println("Number [" + i + "] = " + number[i]);  
        }

        // just another way to print one dimenional

        String[] fruits = {"Apple", "Banana", "Orange"};
        for ( String fruit : fruits) {
            System.out.println(fruit);
        }


        // TWO DIMENSIONAL ARRAY


        int[][] matrix = {
            {1,2,3},
            {5,6,7},
            {4,8,2}
        };

        for(int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }


      
        // METHODS 

        public static int add(int a, int b) {
            return a + b;
        }

        public static void greet(String name) {
            System.out.println("Hello" + name);
        }

        public static void main(String[] args) {
            int result = add(4, 5);
            System.out.println(result);

            greet("Vimal");
        }


    }
}