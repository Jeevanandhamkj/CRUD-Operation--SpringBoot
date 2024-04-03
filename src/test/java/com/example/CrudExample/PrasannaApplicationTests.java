//package com.example.Prasanna;
//
//import com.example.Prasanna.Entily.Prasanna;
//import com.example.Prasanna.Repository.Prasannarpo;
//import com.example.Prasanna.Service.PrasannaSService;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.mockito.Mockito.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class PrasannaApplicationTests {
//@InjectMocks
//		PrasannaSService prasannaSService;
//@Mock
//Prasannarpo prasannarpo;
//
//
//@Test
//	public  void  viewAllTest(){
//	Prasanna p1=new Prasanna(1,"pra",2500);
//	Prasanna p2=new Prasanna(2,"raj",3000);
//	List<Prasanna> prasannaList= Arrays.asList(p1,p2);
//	when(prasannarpo.findAll()).thenReturn(prasannaList);
//	List<Prasanna>og=prasannaSService.viewAll();
//	assertThat(og).isEqualTo(prasannaList);
//}
//@Test
//public void viewByIdTest(){
//	int id=5;
//	Prasanna p3=new Prasanna(5,"jevva",5000);
//	//List<Prasanna>prasannaList1=Arrays.asList(p3);
//	when(prasannarpo.findById(id)).thenReturn(Optional.of(p3));
//	Prasanna og1=prasannaSService.viewById(id);
//	assertThat(og1).isEqualTo(p3);
//
//}
//@Test
//public void addValueTest(){
//	Prasanna pp =new Prasanna(12,"ajith",400);
//	when(prasannarpo.save(pp)).thenReturn(pp);
//	Prasanna og4=prasannaSService.addValue(pp);
//	assertThat(og4).isEqualTo(pp);
//}
//@Test
//public void  viewByNameTest(){
//	String name="kj";
//	Prasanna p=new Prasanna(25,"kj",220);
//	when(prasannarpo.findByName(name)).thenReturn(p);
//	Prasanna og5=prasannaSService.viewByName(name);
//	assertThat(og5).isEqualTo(p);
//}
//@Test
//	public void deleteById(){
//	int id=10;
//	Prasanna p8=new Prasanna(10,"hhdgh",20);
//	int del=prasannaSService.deleteByid(id);
//	assertThat(del).isEqualTo(id);
//	verify(prasannarpo,times(1)).deleteById(id);
//}
//@Test
//	public void updatet(){
//	Prasanna pr=new Prasanna(111,"kngjng",22);
//	Prasanna pr1=new Prasanna(111,"jevva",22);
//	when(prasannarpo.findById(1)).thenReturn(Optional.of(pr));
//	when(prasannarpo.save(pr)).thenReturn(pr1);
//	Prasanna o=prasannaSService.update(pr1);
//	verify(prasannarpo).findById(1);
//	verify(prasannarpo).save(pr1);
//	assertThat(o).isEqualTo(pr1);
//
//}
//
//}
