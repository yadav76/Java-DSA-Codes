// "println" is used to print the content in new line
// to print content in same line we use print() method instead of println()

// While Loop

// public class Loops {
//     public static void main(String[] args){
//         int i = 0;
//         while(i<10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// Do While loop

// public class Loops {
//     public static void main(String[] args){
//         int j = 0;
//         do{
//             System.out.println(j);
//             j++;
//         }while(j<10);
//     }
// }


// For Loop

// public class Loops {
//     public static void main(String[] args){
//         for(int i=0;i<10;i++){
//             System.out.println("Hello");
//         }
//     }
// }


// For Loop without any condition,Intialization,increment/Decrement

// public class Loops {
//     public static void main(String[] args){
//         int i=0;
//         for(;;){
//             System.out.println("Hello");
//             i++;
//             if(i<10){
//                 break;
//             }
//         }
//     }
// }


// Jumping keywords in Loops

// break; keyword

// public class Loops{
//     public static void main(String[] args){
//         for(int i=0;i<10;i++){
//             if(i==5){
//                 break;
//             }
//             System.out.println("Hello");
//         }
//     }
// }


// continue; keyword

// public class Loops{
//     public static void main(String[] args){
//         for(int i=0;i<10;i++){
//             if(i==5){
//                 continue;
//             }
//             System.out.println("Hello"+i);
//         }
//     }
// }



// Nesting of for loop

// public class Loops{
//     public static void main(String[] args){
//         for(int i=0;i<10;i++){
//             for(int j=0;j<5;j++){
//                 System.out.println("Hello"+i);
//             }
//         }
//     }
// }


// code to print below pattern
//*
//* *
//* * *
//* * * *
//* * * * *

public class Loops{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");  // here I am not using println() because it prints all * in new line
            }
            System.out.println(); // these change the line after completing nested loop
        }
    }
}