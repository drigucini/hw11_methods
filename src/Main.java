import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
    }
    public static void printSeparator() {
        System.out.println("+++++++++++++++++");
        System.out.println("-----------------");
    }
    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void task0 () {
        System.out.println("Task 0, theory");
        int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i+1) % 3 ==0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonth);
        System.out.println(total);
    }










    public static void printYear(int year, boolean check) {
        if (check) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is a not leap year");
        }
    }
    public static boolean checkYear(int year) {
        boolean isLeap;
        isLeap = false;
        if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            isLeap = true;
            return isLeap;
        } else {
            return isLeap;
        }
     }

    public static void task1 () {
        System.out.println("\nTask 1");
        int year = 2101; // year to be checked
        boolean isLeap = checkYear(year);
        printYear(year, isLeap);
    }










    public static void getMessageIOS (int deviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && deviceYear == currentYear) {
            System.out.println("Download the app for iOS, following the link\n");
        } else if (clientOS == 0 && deviceYear < currentYear) {
            System.out.println("Download the light version of the app for iOS, following the link\n");
        } else if (clientOS == 1 && deviceYear == currentYear) {
            System.out.println("Download the app for Android, following the link\n");
        } else {
            System.out.println("Download the light version of the app for Android, following the link\n");
        }
    }

    public static void task2 () {
        System.out.println("\nTask 2");
        int clientOS = 1; //type of software 1 - android, 0 - iOS
        int deviceYear = 2023; //current device year
        getMessageIOS(deviceYear, clientOS);

    }










    public static void getDeliveryDays(int distance) {
        if (distance > 100) {
            System.out.println("No delivery available\n");
        } else if (distance > 60) {
            System.out.println("Delivery will take 3 days\n");
        } else if (distance > 20) {
            System.out.println("Delivery will take 2 days\n");
        } else {
            System.out.println("Delivery will take 1 day\n");
        }
    }

    public static void task3 () {
        System.out.println("Task 3");
        int deliveryDistance = 905; // distance from the main office [km]
        getDeliveryDays(deliveryDistance);
        }
}