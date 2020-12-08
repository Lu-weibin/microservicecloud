package demo.controller;

import demo.entity.Dept;
import demo.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author luwb
 * @date 2020/12/07
 */
@RestController
public class DeptControllerConsumer {
    /**
     * 使用feign调用服务
     */
    private final DeptClientService service;

    @Autowired
    public DeptControllerConsumer(DeptClientService service) {
        this.service = service;
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept) {
        return this.service.add(dept);
    }

}
