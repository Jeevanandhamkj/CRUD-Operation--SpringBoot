package com.example.CrudExample.Repository;

import com.example.CrudExample.Entily.Prasanna;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Prasannarpo extends JpaRepository<Prasanna,Integer> {


    Prasanna findByName(String name);
    Prasanna findByEmail(String email);

    List<Prasanna> findAllByOrderByNameAsc();

 //   List<Prasanna>findAllBySalaryLessthan(int salary);
}
