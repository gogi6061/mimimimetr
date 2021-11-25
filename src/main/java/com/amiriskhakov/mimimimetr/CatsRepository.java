package com.amiriskhakov.mimimimetr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CatsRepository extends JpaRepository<Cat, Integer> {

    Optional<Cat> findByName(String name);





}
