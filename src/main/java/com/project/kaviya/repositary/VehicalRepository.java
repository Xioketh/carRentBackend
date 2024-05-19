package com.project.kaviya.repositary;


import com.project.kaviya.model.Vehical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicalRepository extends JpaRepository<Vehical, Long> {

    @Query(value = "select * from vehical where status = ?1 ", nativeQuery = true)
    List<Vehical> getActiveVehical(int status);


}
