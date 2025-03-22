package com.ram.auto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ram.auto.entity.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long>{

}
