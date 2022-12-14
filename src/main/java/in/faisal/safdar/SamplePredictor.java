package in.faisal.safdar;

import java.util.List;

public class SamplePredictor {
    public SampleId index;
    public int predictedLabel; //same as the digit
    public int correctLabel;
    public float probForCorrectLabel;
    public float probForPrediction; //highest prob
    public float topTwoProbDiff; //highest prob - next prob
    public float largestProbDiff; //highest prob - lowest prob
    public float entropy; //SumOf(-prob*log(prob)
    public List<Double> classProbs; //full class probability list
}
