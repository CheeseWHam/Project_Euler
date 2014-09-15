/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheesewham.problem;

/**
 *
 * @author Alex
 */
public class one {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int factor1;
        int factor2;
        int limit;
        int sum = 0;

        factor1 = 3;
        factor2 = 5;
        limit = 1000;

        int[] multiples = new int[limit];
        int current = 0;

        while (true) {
            if (factor1 < factor2) {
                multiples[current] = factor1;
                factor1 = factor1 + 3;
            } else if (factor2 < factor1) {
                multiples[current] = factor2;
                factor2 = factor2 + 5;
            } else {
                multiples[current] = factor1;
                factor1 = factor1 + 3;
                factor2 = factor2 + 5;
            }
            if (multiples[current] >= limit) {
                break;
            }
            current = current + 1;
        }
        
        for (int loop = 0; loop < current; loop = loop + 1) {
            sum = sum + multiples[loop];
        }
        System.out.println(sum);

    }

}
