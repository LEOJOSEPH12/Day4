package com.example.Demo.repository;




import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.stereotype.Repository;




import com.example.Demo.model.StudentEntity;







public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

	




}

