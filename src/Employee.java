import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable {
    public static void main(String[] args) throws InvalidObjectException {
        Methods methods = new Methods();

        Employee emp1 =  new Employee("Alex",0,1500); // Serializable object
        methods.serialize(emp1);

//        Employee employee1 = methods.deserialize(); //deserializable object
//        System.out.println(employee1.toString());
//
    }

    private String name;
    private Integer id;
    private transient Integer salary;

    public Employee(String name, Integer id, Integer salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public Employee(){}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getSalary(){
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
