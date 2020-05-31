package com.prescription.prescriptionmanage.swagger.controller;

import com.prescription.prescriptionmanage.prescription.entity.Department;
import com.prescription.prescriptionmanage.prescription.service.impl.DepartMentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
@Api(value = "测试接口", tags = "SwaggerDemoController", description = "测试接口相关")
public class SwaggerDemoController {


    @Autowired
    private DepartMentServiceImpl departMentServiceImpl;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ApiOperation(value = "创建用户", notes = "创建用户")
    public Map<String, Object> saveUser(@ApiParam(required = true, name = "department", value = "用户实体user") @RequestBody @Valid Department department) {
        Map<String, Object> ret = new HashMap<>();
        try {
            if (null == department) {
                ret.put("msg", "参数不能为空");
                return ret;
            }
            departMentServiceImpl.insert(department);
            ret.put("msg", "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * @param id
     * @return
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = "application/json")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", paramType = "query")
    @ApiOperation(value = "获取用户详细信息", notes = "根据id来获取用户详细信息")
    public Map<String, Object> getUser(@RequestParam int id) {
        Map<String, Object> ret = new HashMap<>();
        try {
            Department department = departMentServiceImpl.getById(id);
            if (null == department) {
                ret.put("msg", "用户ID：" + id + "，未找到数据");
            } else {
                ret.put("msg", "获取成功");
                ret.put("data", department);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }


    /**
     * paramType:指定参数放在哪个地方
     * path:（用于restful接口）-->请求参数的获取：@PathVariable
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", paramType = "path")
    @ApiOperation(value = "删除用户", notes = "删除用户")
    public Map<String, Object> deleteUser(@PathVariable int id) {
        Map<String, Object> ret = new HashMap<>();
        departMentServiceImpl.deleteById(id);
        ret.put("msg", "删除失败");
        return ret;
    }

}
