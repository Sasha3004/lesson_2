import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        String st = "";
        Scanner a = new Scanner(System.in);
        System.out.println("Введите дату");
        int day = a.nextInt();
        int month = a.nextInt();
        int year = a.nextInt();

        if (month == 12 && day == 31) {
            day = 1;
            month = 1;
            year = ++year;
            System.out.println(isData(day, month, year));
        }
        if (year % 4 == 0 && !(year % 100 == 0) | year % 400 == 0) {
            if (day == 29 && month == 2) {
                day = 1;
                month = 3;
                System.out.println(isData(day, month, year));
            }
        }
            if (year % 4 == 0 && !(year % 100 == 0) | year % 400 == 0) {
                if (day == 29 && month == 2) {
                    day = 1;
                    month = 3;
                    System.out.println(isData(day, month, year));
                }
            }
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                    if (day == 31) {
                        month = ++month;
                        day = 1;
                        System.out.println(isData(day, month, year));
                    }
                }


                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day == 30) {
                        month = ++month;
                        day = 1;
                        System.out.println(isData(day, month, year));
                    }
                }
                else {
                    day = ++day;
                    System.out.println(isData(day, month, year));
                }

            }

            private static String isData ( int day, int month, int year){
                return "" + day + "." + month + "." + year;
            }



    }