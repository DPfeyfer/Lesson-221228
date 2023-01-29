public class Main {

    public static void main(String[] args) {Task_31();


        //task 1
        System.out.println("Task1");
        var clientOs = 8;
        switch (clientOs) {
            case 0:
                System.out.println("Download app for Android");
                break;
            case 1:
                System.out.println("Download app for IOS");
                break;
            default:
                System.out.println("Choose between 0 or 1");
        }


        //task 2
        System.out.println("Task2");
        var userOs = 3;
        var yearDevice = 2016;
        if(userOs == 0 && yearDevice <= 2015){
            System.out.println("Download light version of the app for Android");}
        else if (userOs == 1 && yearDevice <= 2015){
            System.out.println("Download light version of the app for IOS");}
        else if (userOs == 0 && yearDevice > 2015){
            System.out.println("Download app for Android");}
        else if (userOs == 1 && yearDevice > 2015){
            System.out.println("Download app for IOS");}
        else {
            System.out.println("Choose between 0 or 1");}


        //task 3
       System.out.println("Task3");
       int year = 2000;
       if (year % 4 == 0) {
           if (year % 100 == 0) {
               if (year % 400 == 0){
                   System.out.println(year + " leap year");}
               else {
                   System.out.println(year + " not leap year");
               }}
           else{
                   System.out.println(year + " leap year");}
               }

       else{
           System.out.println(year + " not leap year");}



       //task 4
        System.out.println("Task4");
       int deliveryDistance = 101;
       int numberDay = 1;
       if (deliveryDistance <= 20){
           System.out.println("We need " + numberDay + " delivery days");
       }
       else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("We need " + (numberDay + 1) + " delivery days");
       }
       else if (deliveryDistance > 60 && deliveryDistance <= 100){
           System.out.println("We need " + (numberDay + 2) + " delivery days");
       }
       else{
           System.out.println("we can not delivery");
       }


       //task 5
        System.out.println("Task5");
       int month = 13;
       switch (month){
           case 12:
           case 1:
           case 2:
               System.out.println("This is month of winter");
               break;
           case 3:
           case 4:
           case 5:
               System.out.println("This is month of spring");
               break;
           case 6:
           case 7:
           case 8:
               System.out.println("This is month of summer");
               break;
           case 9:
           case 10:
           case 11:
               System.out.println("This is day of autumn");
               break;

           default:
               System.out.println("not correct");
       }
    }
    public static void Task_31() {
        System.out.println("Task 3.1");
        int year = 2020;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " leap year");
        } else {
            System.out.println(year + " not leap year");
        }
        System.out.println();
    }
}
