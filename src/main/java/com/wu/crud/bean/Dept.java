package com.wu.crud.bean;

import javax.validation.constraints.Size;

public class Dept {
    private Integer deptId;

    @Size(min = 2, max = 8, message = "部门名称应该在2-8个字之间")
    private String deptName;

    public Dept()
    {
    }

    public Dept(Integer deptId, String deptName)
    {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public String toString()
    {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}