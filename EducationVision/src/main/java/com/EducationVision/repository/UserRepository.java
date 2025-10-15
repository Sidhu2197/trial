package com.EducationVision.repository;

import com.EducationVision.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * This interface is responsible for data access related to the User entity.
 * By extending JpaRepository, Spring Data JPA automatically provides methods
 * to perform CRUD (Create, Read, Update, Delete) operations on the User table.
 * No implementation code is needed from the developer for these basic operations.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * Custom query method to find a user by their email address.
     * Spring Data JPA automatically implements this method based on its name.
     * This is crucial for checking if a user already exists during registration
     * and for finding a user during the login process.
     *
     * @param email The email address to search for in the database.
     * @return An Optional containing the User if found, or an empty Optional otherwise.
     */
    Optional<User> findByEmail(String email);

}