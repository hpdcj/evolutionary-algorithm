/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pde.dumper;

/**
 *
 * @author Łukasz
 */
public interface VectorDumper {
    void dumpVectors (double[][] vectors, int step);
    void finalDataDump (double[][] vectors);
}
