package com.clitubemgnt.demo.repository;

import com.clitubemgnt.demo.model.Bin;
import org.springframework.data.repository.CrudRepository;

public interface BinRepo extends CrudRepository<Bin, Long> {
}
