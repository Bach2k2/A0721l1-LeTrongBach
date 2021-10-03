package ss1_intoduction_to_java.bai_tap;

import java.util.Scanner;

public class NameOfNumber {
    public static void main(String[] args) {
        int check;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n Nhập 1 số:");
            int number = scanner.nextInt();
            int save = number;
            String lastname;
            String hname, tname, oname;
            int hundreds, tens, ones;
            hundreds = number / 100;
            number %= 100;
            tens = number / 10;
            number %= 10;
            ones = number;
            hname = switch (hundreds) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> "";
            };
            tname = switch (tens) {
                case 2 -> "twenty";
                case 3 -> "thirty";
                case 4 -> "fourty";
                case 5 -> "fifty";
                case 6 -> "sixty";
                case 7 -> "seventy";
                case 8 -> "eighty";
                case 9 -> "ninety";
                default -> "";
            };
            if (tens == 1) {
                oname = switch (ones) {
                    case 0 -> "ten";
                    case 1 -> "eleven";
                    case 2 -> "twelve";
                    case 3 -> "thirteen";
                    case 4 -> "fourteen";
                    case 5 -> "fifteen";
                    case 6 -> "sixteen";
                    case 7 -> "seventeen";
                    case 8 -> "eighteen";
                    case 9 -> "nineteen";
                    default -> "";
                };
            } else {
                oname = switch (ones) {
                    case 0 -> "zero";
                    case 1 -> "one";
                    case 2 -> "two";
                    case 3 -> "three";
                    case 4 -> "four";
                    case 5 -> "five";
                    case 6 -> "six";
                    case 7 -> "seven";
                    case 8 -> "eight";
                    case 9 -> "nine";
                    default -> "";
                };
            }

            lastname = hname + " hundred and " + tname + " " + oname;
            if (hundreds == 0) {
                lastname = tname + " " + oname;
            } else {
                if (tens == 0 && ones == 0) {
                    lastname = hname + " hundred ";
                }
            }
            if (save > 999) lastname = "out of ability";
            System.out.printf("\nTen cua so:%s ", lastname);
            System.out.println("\nBan muon tiep tuc khong, nhan 1 de thoat");
            check = scanner.nextInt();
        } while (check != 1);
    }
}



