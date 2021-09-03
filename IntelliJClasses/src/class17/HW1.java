package class17;

 class HW1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */

     int method1(int[] num1) {
         int sum = 0;
         for (int n : num1)
             sum = sum + n;
         return sum;


     }
 }


