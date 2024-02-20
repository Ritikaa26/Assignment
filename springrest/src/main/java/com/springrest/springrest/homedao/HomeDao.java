package com.springrest.springrest.homedao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.home;

import java.util.List;
import java.util.Optional;

@Repository
public interface HomeDao extends JpaRepository<home,Long>{
    List<home> findByShipperId(String shipperId);
    Optional<home> findById(long id);
}
    

