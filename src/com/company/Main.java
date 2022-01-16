package com.company;

import java.util.Scanner;
//+, but use 1 class for 1 task.
public class Main {

    public static void main(String[] args) {
        //please, use text formatting - Ctrl + alt + L.
        Scanner scanner= new Scanner(System.in);
//Задачи по if-else:
//Задача 1 Пользователь вводит 3 числа. Найти максимальное и вывести его. Решить 2 способами:
// 1-через вложенный if, т.е if(condition){if(condition)…}…, 2 – используя логические операции
        System.out.println("Enter 3 numbers:");
        double first= scanner.nextDouble();
        double second= scanner.nextDouble();
        double third= scanner.nextDouble();
        //First method
        
        //What if I enter 3 equal numbers? 
        //+
        if(first>second && first>third){
            System.out.println("Max number is: "+first);
        }
        else if(second>first && second>third){
            System.out.println("Max number is: "+second);
        }
        else if(third>first && third>second){
            System.out.println("Max number is: "+third);
        }
        //Second method
        
        //Cool, +
        double maxFirstSecond=Math.max(first,second);
        double maxNumber=Math.max(maxFirstSecond,third);
        System.out.println("Max number is: "+maxNumber);
        //Third method
        
        //+
        if(first>second){
            if(first>third){
                System.out.println("Max number is: "+first);
            }
        }
        if(second>first){
            if(second>third){
                System.out.println("Max number is: "+second);
            }
        }
        if(third>first){
            if(third>second){
                System.out.println("Max number is: "+third);
            }
        }

//Задача 2 Пользователь вводит 2 числа. Проверить кратное ли первое 2 –у (second)
        System.out.println("Enter 2 numbers:");
        double num1= scanner.nextDouble();
        double num2= scanner.nextDouble();
        
        //This logic is not clear for me. Why (2-num2)?
        if (num1%(2-num2)==0) {
            System.out.println("Entered first number is multiply!");
        } else {
            System.out.println("Entered first number is not multiply!");
        }

//Задача 3 Пользователь вводит число. Отображаем название дня недели, иначе, что такого дня нет.
        //+
        System.out.println("Enter number day of the week:");
        int number= scanner.nextInt();
        String dayWeek1;
        if (number==1){
            dayWeek1="Monday";
        }
        else if(number==2) {
            dayWeek1 = "Tuesday";
        }
        else if(number==3) {
            dayWeek1 = "Wednesday";
        }
        else if(number==4) {
            dayWeek1 = "Thursday";
        }
        else if(number==5) {
            dayWeek1 = "Friday";
        }
        else if(number==6) {
            dayWeek1 = "Saturday";
        }
        else if(number==7) {
            dayWeek1 = "Sunday";
        }
        else{
            dayWeek1="This day not found";
        }
        System.out.println(dayWeek1);

//Задачи на switch – case:
//Задача 4 Пользователь вводит число. Отображаем название дня недели, иначе, что такого дня нет (т.е переписать 2.3 с другой конструкцией)
        //+
        System.out.println("Enter number day of the week:");
        int num= scanner.nextInt();
        String dayWeek;
        switch (num) {
            case 1:
                dayWeek="Monday";
                break;
            case 2:
                dayWeek="Tuesday";
                break;
            case 3:
                dayWeek="Wednesday";
                break;
            case 4:
                dayWeek="Thursday";
                break;
            case 5:
                dayWeek="Friday";
                break;
            case 6:
                dayWeek="Saturday";
                break;
            case 7:
                dayWeek="Sunday";
                break;
            default:
                dayWeek="This day not found";
                break;
        }
        System.out.println(dayWeek);

//Задача 5 Пользователь вводит месяц в виде числа от 1 до 12 Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).
        //+
        System.out.println("Enter number month:");
        int numb= scanner.nextInt();
        String timeOfTheYear;
        switch (numb){
            case 1: case 2:case 12:
                timeOfTheYear="Winter";
                break;
            case 3:case 4:case 5:
                timeOfTheYear="Spring";
                break;
            case 6:case 7:case 8:
                timeOfTheYear="Summer";
                break;
            case 9:case 10:case 11:
                timeOfTheYear="Autumn";
                break;
            default:
                timeOfTheYear="This month not found";
                break;
        }
        System.out.println(timeOfTheYear);

//Реализуем калькулятор:
        //First version
        //+
        System.out.println("Enter first number:");
        double numberFirst=scanner.nextDouble();
        System.out.println("Enter second number:");
        double numberSecond=scanner.nextDouble();
        if (numberSecond != 0) {
            System.out.println("Enter operation " +
                    "'1' -Sum; " +
                    "'2' -Difference; " +
                    "'3' -Division; " +
                    "'4' -Multiplication;");
            //Why do wee need to use char? We can use int either: enter just 1,2,.. without ''
            //int operat = scanner.nextInt();// приводит к ошибке если вводим символ
            //If we do not have number we will get into default section
            char operat = scanner.next().charAt(0);//исспользовала char для ситуации: если пользователь введет символ (число), которого у нас нет)
            double result1;
            switch (operat) {
                case '1':
                    result1 = numberFirst + numberSecond;
                    System.out.println("Result:" + result1);
                    break;
                case '2':
                    result1 = numberFirst - numberSecond;
                    System.out.println("Result:" + result1);
                    break;
                case '3':
                    result1 = numberFirst / numberSecond;
                    System.out.println("Result:" + result1);
                    break;
                case '4':
                    result1 = numberFirst * numberSecond;
                    System.out.println("Result:" + result1);
                    break;
                default:
                    System.out.println("Entered wrong operation!");
                    break;
            }
        }
        else {
            System.out.println("Division by 0 is forbidden");
        }

        //Second version
        //+
        System.out.println("Enter first number:");
        double numFirst=scanner.nextDouble();
        System.out.println("Enter second number:");
        double numSecond=scanner.nextDouble();
        if (numSecond != 0) {
            System.out.println("Enter operation " +
                    "'+' -Sum; " +
                    "'-' -Difference; " +
                    "'/' -Division; " +
                    "'*' -Multiplication;");
            //We can use String either. Just write default section (else) for any other cases. char ok too.
            char c = scanner.next().charAt(0);// ввод одного символа
            if (c == '+') {
                double result = numFirst + numSecond;
                System.out.println("Result::" + result);
            } else if (c == '-') {
                double result = numFirst - numSecond;
                System.out.print("Result:" + result);
            } else if (c == '/') {
                double result = numFirst / numSecond;
                System.out.print("Result:" + result);
            } else if (c == '*') {
                double result = numFirst * numSecond;
                System.out.print("Result:" + result);
            }
            else{
                System.out.println("Entered wrong operation!");
            }
        }
        else {
            System.out.println("Division by 0 is forbidden");
        }
    }
}
