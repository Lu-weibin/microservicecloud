package demo.service.impl;

import demo.dao.DeptDao;
import demo.entity.Dept;
import demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author luwb
 * @date 2020/12/07
 */
@Service
public class DeptServiceImpl implements DeptService {

    private final DeptDao deptDao;

    @Autowired
    public DeptServiceImpl(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

}
