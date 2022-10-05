package com.wkr.design.builder;


/**
 * @author wkr
 * @Description: 建造者模式
 * @date 2022/9/5 17:16
 */
public class Employee {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class EmpBuilder {
        private Employee employee = new Employee();
        public Employee build() {
            if (employee.name == null) {
                employee.name = "system";
            }
            if (employee.age == 0) {
                employee.age = 18;
            }
            return employee;
        }
        public EmpBuilder setName(String name) {
            employee.name = name;
            return this;
        }
        public EmpBuilder setAge(int age) {
            employee.age = age;
            return this;
        }
    }
}
