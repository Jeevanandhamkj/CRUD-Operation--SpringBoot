package com.example.CrudExample.Controller;

import com.example.CrudExample.Entily.Prasanna;
import com.example.CrudExample.Service.PrasannaSService;
import com.example.CrudExample.Service.UserAlreadyExistsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pra")
public class PrasannaControl {

    Logger logger=  LoggerFactory.getLogger(PrasannaControl.class);
    @Autowired
     private PrasannaSService ps;
    @PostMapping("/add")
    public Prasanna ad(@Validated @RequestBody Prasanna pr) {
        try {
            return ps.addValue(pr);


        } catch (UserAlreadyExistsException e) {
            logger.error("user already created");
            System.out.println("UserWith Email already exists");
            return null;
        }

    }
    @PostMapping("/addingAll")
    public List<Prasanna>adding(@RequestBody List<Prasanna> prs){
        return ps.addAllvalue(prs);
    }
    @GetMapping("/viewAll")
    public List<Prasanna>viewAll(){
        return ps.viewAll();
    }
    @GetMapping("/view/{id}")
    public Prasanna ViewByid(@PathVariable ("id") int id){
        return ps.viewById(id);
    }
    @GetMapping("/vi/{name}")
    public Prasanna ViewByName(@PathVariable ("name") String name){
        return ps.viewByName(name);
    }
@PutMapping("/update")
    public Prasanna Updating(@RequestBody Prasanna prs){
        Prasanna p=ps.update(prs);
        p.setSalary(prs.getSalary());
        p.setName(prs.getName());
        return p;
}
@DeleteMapping("/delete/{id}")
    public int del(@PathVariable("id") int id){
        return ps.deleteByid(id);
}

@GetMapping("/use")
    public List<Prasanna> dd(){
        return ps.ase();
}

@PatchMapping("/pat/{id}")
    public Prasanna patchng(@PathVariable int id,@RequestBody Map<String,Object> k){
        return ps.pat(id,k);
}

}
