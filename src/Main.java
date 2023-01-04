public class Main {
    public static void main(String[] args) {

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
        var userOs = 1;
        var yearDevice = 2016;
        if(userOs == 0 && yearDevice <= 2015){
            System.out.println("Download light version of the app for Android");}
        else if (userOs == 1 && yearDevice <= 2015){
            System.out.println("Download light version of the app for IOS");}
        else if (userOs == 0 && yearDevice > 2015){
            System.out.println("Download app for Android");}
        else if (userOs == 1 && yearDevice > 2015){
            System.out.println("Download app for IOS");}
        else


        //task 3
        System.out.println("Task3");


        //task 4
        System.out.println("Task4");


        //task 5
        System.out.println("Task5");


    }
}