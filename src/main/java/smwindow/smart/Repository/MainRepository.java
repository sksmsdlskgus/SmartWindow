package smwindow.smart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import smwindow.smart.Entity.MainEntity;

public interface MainRepository extends JpaRepository<MainEntity, Float> {

}
