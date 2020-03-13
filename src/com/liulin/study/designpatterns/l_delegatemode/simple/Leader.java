package com.liulin.study.designpatterns.l_delegatemode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by DbL on 2020/3/13
 */
public class Leader implements IEmployee {

    private Map<String ,IEmployee> employeeMap = new HashMap<String ,IEmployee>();

    public Leader() {
        employeeMap.put("爬虫",new EmployeeA());
        employeeMap.put("海报图",new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if(!employeeMap.containsKey(task)){
            System.out.println("这个任务"+task+"超出我的能力范围");
            return;
        }
        employeeMap.get(task).doing(task);
    }
}
