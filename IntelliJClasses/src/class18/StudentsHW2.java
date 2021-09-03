package class18;

import java.sql.SQLOutput;

public class StudentsHW2 {
    /*
    Write a java program of Class Students that takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
     */

    String name;
    double gradeInAlgebra;
    double gradeInMath;
   double gradeInScience;

   StudentsHW2(String nameOfStudent, double algebraGrade, double mathGrade, double scienceGrade){
       name=nameOfStudent;
       gradeInAlgebra=algebraGrade;
       gradeInMath=mathGrade;
       gradeInScience=scienceGrade;
   }

   String average(){
       if((gradeInAlgebra+gradeInMath+gradeInScience)/3>=90){
    return name+"'s average grade is A";}

    else if((gradeInAlgebra+gradeInMath+gradeInScience)/3>=80){
    return name+"'s average grade is B";
           }

    else if ((gradeInAlgebra+gradeInMath+gradeInScience)/3>=70){
        return name+"'s average grade is C";
       }
    else if ((gradeInAlgebra+gradeInMath+gradeInScience)/3>=60){
        return name+"'s average grade is D";
       }
    else{
        return name+"'s average grade is F";
       }

   }

}
