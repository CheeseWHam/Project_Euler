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

        while (factor1 < limit || factor2 < limit) {
            if (factor1 < factor2) {
                sum += factor1;
                factor1 += 3;
            } else if (factor2 < factor1) {
                sum += factor2;
                factor2 += 5;
            } else {
                sum += factor1;
                factor1 += 3;
                factor2 += 5;
            }
        }
        System.out.println(sum);
    }
}
