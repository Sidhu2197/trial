package com.EducationVision;

import com.EducationVision.model.Course;
import com.EducationVision.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

/**
 * This component runs on application startup to populate the database
 * with initial sample data if the database is empty.
 */
@Component
public class DataInitializer {

    @Autowired
    private CourseRepository courseRepository;

    @PostConstruct
    public void initData() {
        // Only add data if the course table is currently empty
        if (courseRepository.count() == 0) {
            System.out.println("No courses found in DB, creating sample data...");

            // School Courses
            Course c1 = new Course();
            c1.setTitle("Alphabets & Numbers");
            c1.setDescription("A fun introduction for UKG students with animal teachers.");
            c1.setCategory("school");
            c1.setVideoId("gHnWkmW6qRI");
            courseRepository.save(c1);

            Course c2 = new Course();
            c2.setTitle("Laws of Motion");
            c2.setDescription("Learn physics like a superhero in this Grade 6 module.");
            c2.setCategory("school");
            c2.setVideoId("y2E74W3w1wQ");
            courseRepository.save(c2);

            // Professional Courses
            Course c3 = new Course();
            c3.setTitle("AI/ML Fundamentals");
            c3.setDescription("An introduction to Artificial Intelligence and Machine Learning.");
            c3.setCategory("professional");
            c3.setVideoId("iP0s2vU8_yI"); // Using a placeholder video for example
            courseRepository.save(c3);

            // Higher Secondary Courses
            Course c4 = new Course();
            c4.setTitle("JEE/NEET Prep");
            c4.setDescription("Prepare for major entrance exams with our specialized curriculum.");
            c4.setCategory("higher_secondary");
            c4.setVideoId("pIuUZiOEo7k"); // Using a placeholder video for example
            courseRepository.save(c4);

            System.out.println("Sample course data has been created.");
        }
    }
}

