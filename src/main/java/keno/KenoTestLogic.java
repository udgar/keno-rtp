package keno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class KenoTestLogic {


    public KenoResponse play(KenoRequest request) {

        KenoResponse response = new KenoResponse();

        var selectedRandomNumber = KenoSelectedNumber.getRandomSelectedPlayLine();
        response.setBalls(selectedRandomNumber);

        var notIncluded = new ArrayList<Integer>();
        var included = new ArrayList<Integer>();
        for (var random : selectedRandomNumber) {
            if (request.getListOfSelectedNumber().contains(random))
                included.add(random);
            else
                notIncluded.add(random);
        }
        response.setIncluded(included);
        response.setNotIncluded(notIncluded);

        var wonAmount = PlayTableGeneration.generatePlayTable(request.getListOfSelectedNumber().size(), included.size());

        double winAmount = (double) wonAmount * request.getTotalBet();

        response.setWinAmount(winAmount);

        return response;
    }
}
