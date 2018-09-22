package com.wu.crud.bean;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Size;

public class Emp {
    public Emp(Integer empId, String empName, String gender, @Email String email, Integer dId, Dept dept)
    {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
        this.dept = dept;
    }

    public Emp()
    {
    }

    @Override
    public String toString()
    {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dId=" + dId +
                ", dept=" + dept +
                '}';
    }

    private Integer empId;

    @Size(min = 2, max = 8, message = "用户名应该在2-8个字之间")
    private String empName;

    private String gender;

    @Email
    private String email;

    private Integer dId;

    private Dept dept;

    public Dept getDept()
    {
        return dept;
    }

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}
