package com.patter.repos;

import com.patter.entities.BlacklistedToken;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlacklistedTokenRepository extends CrudRepository<BlacklistedToken, Long> {

    BlacklistedToken findById(Long id);

    List<BlacklistedToken> findByTokenString(String token);

}
