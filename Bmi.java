package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Bmi {

    public static void main(String args []) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("height (cm): ");
        System.out.flush();
        String s = br.readLine();
        double heightCm = Double.valueOf(s).doubleValue();

        System.out.print("weight (kg): ");
        System.out.flush();
        String t = br.readLine();
        double weight = Double.valueOf(t).doubleValue();

        //cm→mに変換
        double heightM = heightCm / 100.0;

        //計算準備
        double a = 2.0;
        double temp = Math.pow(heightM, a);

        //bmi = 体重÷身長の二乗
        double bmi = (  weight / temp );

        System.out.println("BMI = " + bmi);

    }

}