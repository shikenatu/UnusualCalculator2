package com.example.test_1;

public class subActivity {
    int reru,ru;
    String enzan;

    public void setData(int sareru, int suru, String kigou) {
        reru = sareru;
        ru = suru;
        enzan = kigou;
    }
    public String calculate() {
        StringBuilder result = new StringBuilder();
        if ("/".equals(enzan)){
            if (ru != 0) {
                System.out.printf("%7d\n    ---\n", reru / ru);//答え
                System.out.printf("%3d)%3d\n", ru, reru);//式
                if (reru / ru >= 100) {
                    System.out.printf("%5d\n    ---\n", ru * ((reru / ru) / 100));
                    System.out.printf("%6d\n", reru - ru * ((reru / ru) / 10) * 10);
                }
                if (reru / ru >= 10) {
                    System.out.printf("%6d\n    ---\n", ru * ((reru / ru) % 100 / 10));
                    System.out.printf("%7d\n", reru - ru * ((reru / ru) / 10) * 10);
                }
                System.out.printf("%7d\n    ---\n", ru * (reru / ru % 10));
                System.out.printf("%7d\n", reru % ru);
            } else {
                System.out.println("0では割れません");

            }
        }
        else{
            System.out.printf("%6d\n", reru);
            System.out.print(enzan);
            System.out.printf("%5d\n------\n", ru);
            if (enzan.equals("+")) {
                System.out.printf("%6d\n", reru + ru);
            }
            if (enzan.equals("-")) {
                System.out.printf("%6d\n", reru - ru);
            }
            if (enzan.equals("*")) {
                int k = 0;
                if (ru % 10 > 0) {
                    System.out.printf("%6d\n", reru * (ru % 10));
                    k++;
                }
                if (ru % 100 >= 10) {
                    System.out.printf("%5d\n", (reru * (ru % 100 - (ru % 10))) / 10);
                    k += 2;
                }
                if (ru >= 100) {
                    System.out.printf("%4d\n", (reru * (ru - (ru % 100))) / 100);
                    k += 2;
                }

                if (ru == 0) {
                    System.out.printf("%6d\n", 0);
                } else if (k != 1) {
                    System.out.printf("------\n%6d\n", reru * ru);
                }
            }
        }
        return  "うまい";
    }
}




