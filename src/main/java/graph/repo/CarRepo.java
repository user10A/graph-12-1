package graph.repo;

import graph.dto.response.CarResponse;
import graph.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {
    @Query("select new graph.dto.response.CarResponse(" +
            "c.name," +
            "c.email," +
            "c.model," +
            "c.color," +
            "c.price)from Car c where c.id =:id")
    CarResponse findCarById(Long id);

    @Query("select c from Car c where c.id =:id")
    Car getCarById(Long id);
    @Query("select new graph.dto.response.CarResponse(" +
            "c.name," +
            "c.email," +
            "c.model," +
            "c.color," +
            "c.price)from Car c")
    List<CarResponse> getAll();
}
