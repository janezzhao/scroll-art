public class App {
    static char[][] dog = new char[13][17];
    static char[][] cat = new char[9][41];

    public static void initialize (char[][] a) {
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                a[i][j] = ' ';
            }
        }
    }

    public static void drawDog (char[][] dog) {
        //head
        for(int i=3; i<=6; i++) {
            dog[1][i] = '_';
        }
        for(int i=8; i<=12; i++) {
            dog[0][i] = '_';
        }
        for(int i=3; i<=9; i++) {
            dog[4][i] = '_';
        }
        dog[1][7] = dog[2][2] = '/';
        dog[3][1] = dog[3][10] = dog[3][14] = dog[5][10] = dog[6][10] = '|';
        dog[1][13] = dog[4][2] = dog[5][7] = '\\';
        dog[4][10] = '(';
        dog[2][14] = dog[4][14] = ')';
        dog[3][11] = dog[3][12] = dog[4][11] = dog[4][12] = '#';
        for(int i=11; i<=13; i++) {
            dog[5][i] = '-';
        }
        dog[5][8] = dog[5][9] = '_';
        //details
        dog[2][8] = '0';
        dog[3][0] = 'o';
        dog[0][7] = ',';
        //body
        dog[7][6] = dog[8][6] = dog[8][10] = dog[8][12] = '|';
        dog[6][7] = dog[9][12] = '/';
        dog[7][11] = dog[9][7] = dog[9][10] = '\\';
        dog[10][11] = '-';
        dog[8][11] = '#';
        //feet
        dog[10][7] = dog[10][8] = dog[10][10] = dog[11][11] = '|';
        dog[10][6] = '_';
        dog[11][4]  = dog[12][11] = '/';
        dog[12][4] = '\\';
        for(int i=5; i<=8; i++) {
            dog[11][i] = '-';
        }
        for(int i=5; i<=10; i++) {
            dog[12][i] = '-';
        }
        //tail
        for(int i=13; i<=15; i++) {
            dog[9][i] = '-';
        }
        dog[10][14] = dog[10][15] = '-';
        dog[10][13] = '\\';
        dog[10][16] = ')';
    }

    public static void printArt (char[][] a) throws InterruptedException {
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
            Thread.sleep(80);
        }
        System.out.println("JZ");
    }

    public static void drawCat (char[][] cat) {
        //rainbow trail
        for(int i=1; i<=7; i++) {
            cat[i][0] = cat[i][5] = cat[i][6] = cat[i][7] = cat[i][8] = '_';
            cat[i][1] = cat[i][2] = cat[i][3] = cat[i][4] = '-';
        }
        for(int i=1; i<=3; i++) {
            cat[i][9] = cat[i][10] = cat[i][11] = cat[i][12] = '-';
        }
        //tail
        cat[4][9] = cat[5][10] = cat[4][12] = '\\';
        cat[5][11] = cat[5][12] = '_';
        //rainbow trail
        cat[5][9] = '-';
        for(int i=6; i<=7; i++) {
            cat[i][9] = cat[i][10] = cat[i][11] = cat[i][12] = '-';
        }
        //pop tart
        cat[1][13] = '/';
        cat[7][13] = '\\';
        for(int i=2; i<=6; i++) {
            cat[i][13] = '|';
        }
        for(int i=14; i<=34; i++) {
            cat[0][i] = cat[7][i] = '_';
        }
        for(int i=35; i<=38; i++) {
            cat[7][i] = '_';
        }
        cat[1][35] = '\\';
        //frosting
        cat[1][15] = '/';
        cat[1][33] = '\\';
        for(int i=2; i<=6; i++) {
            cat[i][15] = '|';
        }
        cat[2][33] = cat[3][33] = '|';
        for(int i=16; i<=30; i++) {
            cat[1][i] = cat[6][i] = '_';
        }
        cat[1][31] = cat[1][32] = '_';
        //sprinkles 
        cat[2][17] = cat[2][23] = cat[2][30] = cat[3][20] = cat[4][28] = cat[5][21] = cat[5][26] = 'o';
        cat[3][26] = cat[4][18] = cat[4][23] = cat[5][30] = '*';
        //head
        cat[7][31] = cat[5][40] = '\\';
        cat[6][30] = cat[6][40] = '|';
        cat[5][30] = cat[7][39] = '/';
        for(int i=33; i<=36; i++) {
            cat[4][i] = '_';
        }
        cat[2][35] = cat[3][35] = cat[4][35] = '|'; //pop tart
        //ears
        cat[3][30] = cat[4][30] = cat[4][31] = cat[3][40] = cat[4][40] = '|';
        cat[3][32] = cat[4][33] = '\\';
        cat[3][39] = cat[4][38] = '/';
        //face
        cat[6][32] = cat[6][38] = '0';
        cat[6][35] = '^';
        //paws
        cat[8][10] = cat[8][15] = cat[8][18] = cat[8][29] = cat[8][32] = cat[8][35] = cat[8][38] = '|';
        cat[8][11] = cat[8][12] = cat[8][16] = cat[8][17] = cat[8][30] = cat[8][31] = cat[8][36] = cat[8][37] = '_';
        cat[8][13] = '/';
    }
    public static void main(String[] args) throws Exception {
        initialize(dog);
        drawDog(dog); //snoopy

        initialize(cat);
        drawCat(cat); //nyan cat

        while(true) {
            printArt(dog);
            printArt(cat);
        }
    }
}
