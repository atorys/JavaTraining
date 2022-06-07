package exam;

import java.util.Scanner;

public class N2 {
    static Scanner in = new Scanner(System.in);
    static char first = in.next().charAt(0);
    static char second = in.next().charAt(0);
    static char third = in.next().charAt(0);


    public static void main(String[] args) {

        switch (second) {
            case '=' : {
                switch (first) {
                    case '=': {
                        System.out.println("abc");
                        System.out.println("acb");
                    }
                    case '>': {
                        System.out.println("bac");
                        System.out.println("bca");
                        break;
                    }
                    case '<': {
                        System.out.println("acb");
                        System.out.println("cab");
                        break;
                    }
                }
                if (first == third && first != second)
                    return;
            }
            case '>': {
                switch (first) {
                    case '=':
                        System.out.println("cab");
                    case '>':
                        System.out.println("cba"); break;
                    case '<':
                        System.out.println("cab"); break;
                }
                break;
            }
            case '<': {
                switch (first) {
                    case '=':
                        System.out.println("abc");
                    case '>':
                        System.out.println("bac"); break;
                    case '<':
                        System.out.println("abc"); break;
                }
                break;
            }
        }
    }
}
