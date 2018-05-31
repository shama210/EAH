package com.sankrankgroup.eah.repositories;

import com.sankrankgroup.eah.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}
