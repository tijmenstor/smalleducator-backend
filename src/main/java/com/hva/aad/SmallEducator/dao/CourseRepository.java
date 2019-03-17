package com.hva.aad.SmallEducator.dao;

import com.hva.aad.SmallEducator.models.CourseModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends CrudRepository<CourseModel, Integer> {
    Boolean existsByCourseCode(String courseCode);
    Boolean existsById(int id);
    Optional<List<CourseModel>> findAllByTeacherId(int teacher_id);
}
