package com.patter.repos;

import com.patter.entities.Space;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpaceRepository extends CrudRepository<Space, Long> {

    Space findById(Long id);

//    List<Space> findByUserKey(Integer user_key);

//    List<Space> findByGeneralIs();
}
