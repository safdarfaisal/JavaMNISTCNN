package in.faisal.safdar;

public interface MNISTModel {
    void init(MNISTDataset ds);
    void setDataset(MNISTDataset ds);
    void train(int stepCount, boolean print);
    SamplePredictor test();
    EvalResultMap eval(int count, EvalResultMap evalOutput, boolean print);
    MNISTModel deepCopy();
}
