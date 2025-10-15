package com.EducationVision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationVision.model.Course;
import java.util.List;

/**
 * This interface provides data access methods for the Course entity.
 * It extends JpaRepository to get standard CRUD operations for free.
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    /**
     * Custom query to find all courses belonging to a specific category.
     * @param category The category to search for.
     * @return A list of courses in that category.
     */
    List<Course> findByCategory(String category);

}
