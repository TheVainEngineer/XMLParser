import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLParser {
    public static void main(String[] args) throws JAXBException {
        Employee emp = new Employee();
        emp.setEmpNo(12);
        emp.setName("Abishek");
        emp.setSalary(10000);
        JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        marshaller.marshal(emp, new File("emp.xml"));
        Employee employee = (Employee) unmarshaller.unmarshal(new File("emp.xml"));
        System.out.println(employee.toString());
    }
}
