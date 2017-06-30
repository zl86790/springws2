package name.lizhe.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.beans.factory.annotation.Autowired;

import name.lizhe.bo.BusinessBean;
import name.lizhe.service.bean.Student;

@WebService
@SOAPBinding(style = Style.RPC)
public class HelloWorldImpl implements HelloWorld {
	
	@Autowired
	private BusinessBean bb;
	
	public String speak(@WebParam(name="stu") Student stu) {
		System.out.println("speak called");
		
		bb.whoami();
		
		return "Hello " + stu.getName() +"/"+ stu.getAge() +"/"+ stu.getNumber();
	}

	public BusinessBean getBb() {
		return bb;
	}

	public void setBb(BusinessBean bb) {
		this.bb = bb;
	}
	
	
}