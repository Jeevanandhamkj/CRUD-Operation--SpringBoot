package com.example.CrudExample.Service;

import com.example.CrudExample.Entily.Prasanna;
import com.example.CrudExample.Repository.Prasannarpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class PrasannaSService {
   @Autowired
  private   Prasannarpo pp;
   public Prasanna addValue(Prasanna psr){
       Prasanna pr=pp.findByEmail(psr.getEmail());
       if(pr!=null){
           throw new UserAlreadyExistsException("user with same email already exists");
       }
       return pp.save(psr);

   }
   public List<Prasanna>addAllvalue(List<Prasanna> psr){
       return pp.saveAll(psr);
   }
public List < Prasanna> viewAll(){
       return pp.findAll();
}
public Prasanna viewById(int id){
    return pp.findById(id).orElse(null);
}
public Prasanna viewByName(String name){
       return pp.findByName(name);
}
public int deleteByid(int id){
        pp.deleteById(id);
        return  id;

}
public Prasanna update(Prasanna pss){
       Prasanna x=pp.findById(pss.getId()).orElse(null);

       x.setName(pss.getName());
       x.setSalary(pss.getSalary());
       return pp.save(x);
}

public List<Prasanna> ase(){
  return     pp.findAllByOrderByNameAsc();
}

public Prasanna pat(int id, Map<String,Object>k){
    Optional<Prasanna>optionalPrasanna=pp.findById(id);
    if(optionalPrasanna.isPresent()){
        k.forEach((key, Value)->{
                    Field field= ReflectionUtils.findField(Prasanna.class,key);
                    field.setAccessible(true);
                    ReflectionUtils.setField(field,optionalPrasanna.get(),Value);
                }

                );
        return pp.save(optionalPrasanna.get());
    }
    return null;

}

}
