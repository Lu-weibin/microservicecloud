package demo.service;

import demo.entity.Dept;

import java.util.List;

/**
 * @author luwb
 * @date 2020/12/07
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
