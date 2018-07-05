package cn.rui0.service.impl;

import cn.rui0.mapper.StudentMapper;
import cn.rui0.model.Student;
import cn.rui0.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ruilin on 2018/7/5.
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;

    public Student getStudent(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
