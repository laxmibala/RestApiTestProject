package DataDomains;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private static String name;
    private static String fname;
    private static String lname;
    private static String email;
    private static String id;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Employee.name = name;
    }

    public static String getFname() {
        return fname;
    }

    public static void setFname(String fname) {
        Employee.fname = fname;
    }

    public static String getLname() {
        return lname;
    }

    public static void setLname(String lname) {
        Employee.lname = lname;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Employee.email = email;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Employee.id = id;
    }




}
