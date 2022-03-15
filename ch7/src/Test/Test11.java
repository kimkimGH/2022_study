package Test;
package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("salmon_bass_data.csv");
        BufferedReader br = new BufferedReader(fr);
        int num = 318;
        int[] lenght_arr = new int[num];
        int count = 0;
        String line = br.readLine();
        line = br.readLine();

        while (line != null) {
            String[] parse = line.split(",");
            lenght_arr[count] = Integer.parseInt(parse[1]);
            count++;
            line = br.readLine();
        }
//        for (int i = 0; i < num; i++) {
//            System.out.println(lenght_arr[i]);
//        }

        int[] histogram = new int[27];

        for (int i = 0; i < histogram.length; i++) {
            for (int k = 0; k < num; k++) {
                if (lenght_arr[k] == i) {
                    histogram[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(histogram));




    }
}


