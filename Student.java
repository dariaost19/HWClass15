package Homework12;

public class Student {
    //6)Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F
 char Getgrade(int score){
     if(score>30){
         return 'A';
     }else if(score>80){
         return 'B';
     }else if(score>70){
         return 'C';
     }else if (score>50){
         return 'D';
     }else{
         return 'F';
     }
 }

}
