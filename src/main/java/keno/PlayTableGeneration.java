package keno;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayTableGeneration {

    private static final KenoWinsSequenceModel wins2 = new KenoWinsSequenceModel(2, List.of(0.0, 0.0, 13.0));
    private static final KenoWinsSequenceModel wins3 = new KenoWinsSequenceModel(3, List.of(0.0, 0.0, 4.0, 15.0));
    private static final KenoWinsSequenceModel wins4 = new KenoWinsSequenceModel(4, List.of(0.0, 0.0, 2.0, 7.0, 20.0));
    private static final KenoWinsSequenceModel wins5 = new KenoWinsSequenceModel(5, List.of(0.0, 0.0, 2.0, 2.0, 3.0, 23.0));
    private static final KenoWinsSequenceModel wins6 = new KenoWinsSequenceModel(6, List.of(0.0, 0.0, 1.0, 2.0, 6.0, 10.0, 30.0));
    private static final KenoWinsSequenceModel wins7 = new KenoWinsSequenceModel(7, List.of(0.0, 0.0, 1.0, 1.5, 2.5, 7.5, 15.0, 40.0));
    private static final KenoWinsSequenceModel wins8 = new KenoWinsSequenceModel(8, List.of(0.0, 0.0, 0.0, 1.5, 3.0, 10.0, 15.0, 20.0, 50.0));
    private static final KenoWinsSequenceModel wins9 = new KenoWinsSequenceModel(9, List.of(0.0, 0.0, 0.0, 1.25, 1.75, 5.5, 10.0, 30.0, 40.0, 70.0));
    private static final KenoWinsSequenceModel wins10 = new KenoWinsSequenceModel(10, List.of(0.0, 0.0, 0.0, 1.0, 1.5, 2.0, 12.0, 30.0, 50.0, 60.0, 100.0));

    private static final List<KenoWinsSequenceModel> list = List.of(wins2, wins3, wins4, wins5, wins6, wins7, wins8, wins9, wins10);

    public static Double generatePlayTable(Integer totalPick, Integer totalCatch) {
        List<Double> integerList = list.stream().filter(kenoWinsSequenceModel -> kenoWinsSequenceModel.getPick() == totalPick).map(KenoWinsSequenceModel::getWins).toList().get(0);
        return integerList.get(totalCatch);
    }
}





