package demo.dao;

import demo.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @author luwb
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
