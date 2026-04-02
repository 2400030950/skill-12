package com.klef.skillexp12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.skillexp12.model.Student;
import com.klef.skillexp12.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    public Student addStudent(Student student){
        return repo.save(student);
    }

    public Student updateStudent(Long id, Student student){
        Student s = repo.findById(id).orElseThrow();

        s.setName(student.getName());
        s.setEmail(student.getEmail());
        s.setCourse(student.getCourse());

        return repo.save(s);
    }

    public void deleteStudent(Long id){
        repo.deleteById(id);
    }
}