public class IJavaPattern {
    public static void main(String[] args) { 

        printI();
        System.out.println();

        printL();
        System.out.println();
        printO();
        System.out.println();
        printV();
        System.out.println();
        printE();
        System.out.println();

        printJ();
        System.out.println();
        printA();
        System.out.println();
        printV();
        System.out.println();
        printA();

        System.out.println();
        heart();
    }
        // Pattern for "I"
    static void printI() {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                System.out.println("* * * * *"); // Top and bottom rows
            } else {
                System.out.println("    *    "); // Middle column only
            }
        }
        System.out.println();
    }
    // Pattern for "J"
    static void printJ() {
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.println("* * * * * ");
            } else if (i < 6) {
                System.out.println("      *   ");
            } else {
                System.out.println("*     *   ");
            }
        }
    }

    // Pattern for "A"
    static void printA() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((j == 0 || j == 4) && i != 0 || (i == 0 || i == 2) && (j > 0 && j < 4)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Pattern for "V"
    static void printV() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (j == i || j == 8 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printE() {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 2 || i == 4) {
                System.out.println("* * * * *");
            } else {
                System.out.println("*");
            }
        }
    }

    static void printO() {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                System.out.print("  * * * ");
            } else {
                System.out.print(" *     *");
            }
            System.out.println();
        }
    }

    static void printL() {
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.println("*");
            } else {
                System.out.print("* * * * *");
            }
        }
        System.out.println();
    }
    static void heart(){
        for(int i=0;i<6;i++){
            for (int j =0; j <7; j++) {
                if((i==0 && j%3!=0) || (i==1 && j%3==0)||(i-j==2)||(i+j==8)){
                    System.out.print(" * ");
                }
                else
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
