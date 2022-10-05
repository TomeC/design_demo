package com.wkr.design.builder;

/**
 * @author wkr
 * @Description:
 * @date 2022/9/5 17:16
 */
public class Test {
    public static void main(String[] args) {
        Employee.EmpBuilder builder = new Employee.EmpBuilder();
        builder
                .setAge(10)
                .setName("tom");
        Employee employee = builder.build();
        System.out.println(employee);

        Employee.EmpBuilder builder1 = new Employee.EmpBuilder();
        System.out.println(builder1.build());
    }
}
