package com.lakhan.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.stereotype.Component;





@Document(indexName = "student-index" )
@Component
public class Student {

	    @Id
	    private String id;
	    @Field(type = FieldType.Text, name = "name")
	    private String name;
	    @Field(type = FieldType.Auto, name = "semesters")
	    private List<Semester> semesters;

	    public Student() {
	    }

	    public Student(String id, String name, List<Semester> semesters) {
	        this.id = id;
	        this.name = name;
	        this.semesters = semesters;
	    }

	    public Student(String id, String name)
	    {
	        this.id = id;
	        this.name = name;
	    }


	   

		public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public List<Semester> getSemesters() {
	        return semesters;
	    }

	    public void setSemesters(List<Semester> semesters) {
	        this.semesters = semesters;
	    }


	    @Override
	    public String toString() {
	        return "Student{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", semesters=" + semesters +
	                '}';
	    }
	    
	    
	    
	    
}
