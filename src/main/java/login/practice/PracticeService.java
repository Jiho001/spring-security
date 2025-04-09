package login.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PracticeService {
    private final PracticeRepository practiceRepository;

    public void savePractice(){
        Practice practice = new Practice();
        practice.setName("postgres");
        practiceRepository.save(practice);
    }
}
