package com.clitubemgnt.demo.repository;

import com.clitubemgnt.demo.model.Tube;
import org.springframework.data.repository.CrudRepository;

public interface TubeRepo extends CrudRepository<Tube, Long> {
}
