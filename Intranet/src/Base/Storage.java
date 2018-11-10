package Base;

import Activities.Order;
import Course.Course;
import Course.Transcript;
import Users.*;

import java.util.Vector;

public class Storage {
    public static Vector<Admin> admins = new Vector<>();
    public static Vector<Student> students = new Vector<>();
    public static Vector<Teacher> teachers = new Vector<>();
    public static Vector<Manager> managers = new Vector<>();
    public static Vector<Executor> executors = new Vector<>();
    public static Vector<Course> courses = new Vector<>();
    public static Vector<Transcript> transcripts = new Vector<>();
    public static Vector<Order> orders = new Vector<>();
}