package co.develhope.api04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping
    public static String getHostName(ServletRequest request, ServletResponse response){
           return"Host = " + request.getServerName() + " " + "Port = " + request.getServerPort();
    }

}
