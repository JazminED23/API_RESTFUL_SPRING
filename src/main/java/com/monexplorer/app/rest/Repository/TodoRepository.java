package com.monexplorer.app.rest.Repository;

import com.monexplorer.app.rest.Model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tasksRepository")
public interface TodoRepository extends JpaRepository<Alumno, Integer> {
}
