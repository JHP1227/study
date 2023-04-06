package com.study0406.member;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hr_person")
public class hr_person {

    @Id
    private String i_empno;
    private String i_field;
    private String n_hname;
    private String n_jumin_no;
    private String f_sex;

    public String getI_empno() {
        return i_empno;
    }

    public void setI_empno(String i_empno) {
        this.i_empno = i_empno;
    }

    public String getI_field() {
        return i_field;
    }

    public void setI_field(String i_field) {
        this.i_field = i_field;
    }

    public String getN_hname() {
        return n_hname;
    }

    public void setN_hname(String n_hname) {
        this.n_hname = n_hname;
    }

    public String getN_jumin_no() {
        return n_jumin_no;
    }

    public void setN_jumin_no(String n_jumin_no) {
        this.n_jumin_no = n_jumin_no;
    }

    public String getF_sex() {
        return f_sex;
    }

    public void setF_sex(String f_sex) {
        this.f_sex = f_sex;
    }

    @Override
    public String toString() {
        return "hr_person [i_empno=" + i_empno + ", i_field=" + i_field + ", n_hname=" + n_hname + ", n_jumin_no="
                + n_jumin_no + ", f_sex=" + f_sex + "]";
    }

}
