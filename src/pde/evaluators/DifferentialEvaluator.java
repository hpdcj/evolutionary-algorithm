package pde.evaluators;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Łukasz Górski <lgorski@mat.umk.pl>
 */
public interface DifferentialEvaluator {

    public boolean continueOptimisation(int iterNo, double[][] vectors);

    default public int evaluateVectors(double[] first, double[] second) {
        final double cost1 = first[0];
        final double cost2 = second[0];

        if (Math.abs(cost1 - cost2) < 1e-6) {
            return 0;
        } else if (cost1 < cost2) {
            return -1;
        } else {
            return 1;
        }
    }

    public double f(double[] args);
}
