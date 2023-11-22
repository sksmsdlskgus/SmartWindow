package smwindow.smart.Service;

import com.sun.tools.javac.Main;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smwindow.smart.Entity.MainEntity;
import smwindow.smart.Repository.MainRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class MainService {
    public final MainRepository mainRepository;

    public List<MainEntity> findstatus() {
        return mainRepository.findAll();
    }
}
