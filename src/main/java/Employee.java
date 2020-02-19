import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Employee implements Serializable {
    //@XmlElement(name = "name")
    private String name;
    //@XmlElement(name = "empno")
    private int empNo;
    //@XmlElement(name = "salary")
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [EmpNo= " + empNo + ", Name= " + name + ", Salary= " + salary + "]";
    }
}
