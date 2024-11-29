package bai3_File;

import java.io.Serializable;

public class Student implements Serializable {
    String fullname;
    String address;

    public Student() {
    }

    public Student(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFileLineFormat(){
        return "\n"+ fullname+", " + address;
    }

    public static  String getFileHeaderFormat() {
        return "fullname, address" ;
    }
}
