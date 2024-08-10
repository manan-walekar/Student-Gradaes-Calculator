import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                System.out.println("# STUDENT GRADE CALCULATOR");
                System.out.println(" ");
                Scanner scan = new Scanner(System.in);

                System.out.println("Enter the marks : ");

                System.out.println("1. Maths (out of 100) : ");
                int Maths = scan.nextInt();

                System.out.println("2. English (out of 100) : ");
                int English = scan.nextInt();

                System.out.println("3. Science (out of 100) : ");
                int Science = scan.nextInt();

                System.out.println("4. Social (out of 100) : ");
                int Social = scan.nextInt();

                System.out.println("5. Hindi (out of 100) : ");
                int Hindi = scan.nextInt();

                int sumofmarks = Science + Social + Hindi + Maths + English;

                System.out.println("The Total Marks is : " + sumofmarks);
                int avergepercentage = sumofmarks / 5;
                System.out.println("Average percentage is : " + avergepercentage + "%");

                /*
                 * GRADES :)
                 * A++ = Above 90%
                 * A = Between 80% - 90%
                 * B = Between 65% - 80%
                 * C = Between 45% - 65%
                 */

                if (avergepercentage >= 90) {
                    System.out.println("Your Grade is : A++");
                    System.out.println("A++ = EXCELENT");

                } else if (avergepercentage >= 80 && avergepercentage < 90) {
                    System.out.println("Your Grade is : A");
                    System.out.println("A = GOOD WORK");

                } else if (avergepercentage >= 65 && avergepercentage < 80) {
                    System.out.println("Your Grade is : B");
                    System.out.println("B = NEED TO WORK HARD");

                } else if (avergepercentage >= 45 && avergepercentage < 65) {
                    System.out.println("Your Grade is : C");
                    System.out.println("C = NOT SATISFIED");

                } else {
                    System.out.println("Your Grade is : F");
                    System.out.println("F = FAIL");
                }

            }
        }

