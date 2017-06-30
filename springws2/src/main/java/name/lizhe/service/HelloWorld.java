package name.lizhe.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import name.lizhe.service.bean.Student;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	String speak(Student stu);
}