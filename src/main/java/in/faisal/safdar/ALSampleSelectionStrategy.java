package in.faisal.safdar;

import java.util.List;

public interface ALSampleSelectionStrategy {
    String name();
    List<SampleId> selectSamplesForLabeling(ALSampleFeederDataset samples,
                                            MNISTModel model, List<MNISTModel> auxModels);
}
