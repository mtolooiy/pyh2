package com.nrdc.pyh2.modules.users.repository;

import com.nrdc.pyh2.modules.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long>{

    // select * from users where email="..."

//    Users findAllByEmail(String email);

//    @Query(nativeQuery = true , value = "select * from users ") // Native QUerry
    @Query("select u from Users u where u.email = :email") // JPQL
    Users userEmail(@Param("email") String email);
}
