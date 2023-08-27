package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Framework;
@Repository
public interface FrameworkRepo extends CrudRepository<Framework,Integer> {

}
