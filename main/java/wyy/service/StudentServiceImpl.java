package wyy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.filter.AutoLoad;

import wyy.dao.StudentMapper;
import wyy.model.Student;

  @Service("studentService")
public class StudentServiceImpl implements StudentServiceI {

	private StudentMapper studentMapper;
	
	@Override
	public Student getStudentById(int id) {

		return studentMapper.selectByPrimaryKey(id);
	}
	public StudentMapper getStudentMapper() {
		return studentMapper;
	}
	@Autowired
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentMapper.getAll();
	}
	@Override
	public List<Student> getAll2() {
		// TODO Auto-generated method stub
		return studentMapper.getAll2();
	}
	@Override
	public List<Student> getAll3() {
		// TODO Auto-generated method stub
		return studentMapper.getAll3();
	}
	@Override
	public List<Student> getAll4() {
		// TODO Auto-generated method stub
		return studentMapper.getAll4();
	}

}
