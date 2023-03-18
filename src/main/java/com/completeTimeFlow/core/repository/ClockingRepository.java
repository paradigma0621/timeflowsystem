package com.completeTimeFlow.core.repository;

import com.completeTimeFlow.core.server.domain.Clocking;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClockingRepository extends JpaRepository<Clocking, Long> {

    @Query("select obj from Clocking obj")
    public List<Clocking> getEveryBody();

}
