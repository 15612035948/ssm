package wyy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import wyy.model.Student;
import wyy.service.StudentServiceI;

@Controller
@RequestMapping("/studentController")
public class StudentController {

	 private StudentServiceI studentService;
	 
	public StudentServiceI getStudentService() {
		return studentService;
	}
	@Autowired
	public void setStudentService(StudentServiceI studentService) {
		this.studentService = studentService;
	}
	@RequestMapping("/{id}/showStudent")
	public String showStudent(@PathVariable int id,HttpServletRequest request) {
		 Student s=studentService.getStudentById(id);
		 
		 System.out.println(s.getName());
		 request.setAttribute("student",s);
		return "showStudent";
	}
}
