package pl.konczak.planer.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TrainingBO
        implements ITrainingBO {

    @Autowired
    private ITrainingRepository trainingRepository;

    public Training add(String name) {
        Training training = new Training(name);

        training = trainingRepository.save(training);

        return training;
    }

}
