package name.lizhe.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import name.lizhe.service.HelloWorld;
import name.lizhe.service.bean.Student;
public class Client {
    public static void main(String[] args) {  
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
        factory.setServiceClass(HelloWorld.class);  

        factory.setAddress("http://localhost:8080/webservice/HelloWorld");  
        HelloWorld greetingService = (HelloWorld)factory.create();  
        System.out.println("invoke webservice...");  
        
        Student stu = new Student();
        stu.setName("name.lizhe");
        stu.setAge(20);
        stu.setNumber("200412094");
        
        System.out.println("message context is:"+greetingService.speak(stu));     
    }  
}
