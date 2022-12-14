package in.faisal.safdar;

import org.apache.commons.lang3.tuple.Pair;
import org.ejml.simple.SimpleMatrix;
import java.util.ArrayList;
import java.util.List;

public class SimpleMatrixEx {
    //v0.41 does not have elementMax, only elementMaxAbs
    private final SimpleMatrix matrix;

    SimpleMatrixEx(SimpleMatrix m) {
        matrix = m;
    }

    public double elementMax() {
        double max = matrix.get(0, 0);
        for (int i = 0; i < matrix.numRows(); i++) {
            for (int j = 0; j < matrix.numCols(); j++) {
                double d = matrix.get(i, j);
                if (max < d) {
                    max = d;
                }
            }
        }
        return max;
    }

    public List<Double> elementList() {
        List<Double> elist = new ArrayList<>(matrix.numRows()*matrix.numCols());
        for (int i = 0; i < matrix.numRows(); i++) {
            for (int j = 0; j < matrix.numCols(); j++) {
                double d = matrix.get(i, j);
                elist.add(d);
            }
        }
        return elist;
    }

    //return e^(a[i,j])
    public SimpleMatrix exp() {
        SimpleMatrix m = new SimpleMatrix(matrix);
        for (int i = 0; i < m.numRows(); i++) {
            for (int j = 0; j < m.numCols(); j++) {
                double d = m.get(i, j);
                m.set(i, j, Math.exp(d));
            }
        }
        return m;
    }

    //return index of max element
    public Pair<Integer, Integer> indexOfMax() {
        double max = matrix.get(0, 0);
        Pair<Integer, Integer> p = Pair.of(0, 0);
        for (int i = 0; i < matrix.numRows(); i++) {
            for (int j = 0; j < matrix.numCols(); j++) {
                double d = matrix.get(i, j);
                if (max < d) {
                    max = d;
                    p = Pair.of(i, j);
                }
            }
        }
        return p;
    }
}
