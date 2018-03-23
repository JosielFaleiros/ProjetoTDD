
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JosielFaleiros
 */
class Calculadora {

    double calcMediana(double[] vetor) {
        if (vetor == null) {
            throw new NullPointerException();
        }
        if (vetor.length == 0) {
            throw new IllegalArgumentException();
        }
        Arrays.sort(vetor);
        if (vetor.length%2 != 0) {
            return vetor[vetor.length / 2];
        }
        return (vetor[(vetor.length / 2) - 1] + vetor[vetor.length / 2]) / 2;
    }
}
