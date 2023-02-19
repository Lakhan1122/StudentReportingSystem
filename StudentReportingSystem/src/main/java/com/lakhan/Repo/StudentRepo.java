package com.lakhan.Repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.lakhan.entity.Student;

@Repository
public interface StudentRepo extends  ElasticsearchRepository<Student, String>{

}
