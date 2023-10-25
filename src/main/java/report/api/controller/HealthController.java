package report.api.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import report.api.services.BaseService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController()
@RequestMapping("/health/")
public class HealthController extends BaseController {

    public HealthController(Environment environment) {
        super(environment);
    }

    @GetMapping("check")
    public String check() {

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String date = df.format(new Date());
        System.out.println("check Start : " + date);
        return  "status OK : " + date;
    }

    @GetMapping("endpointUrl")
    public String endpointUrl() {
        String url = super.env.getProperty("URL_REPORT_API");
        System.out.println("check endpoint url : " + url);
        return  "status OK : " + url;
    }

}
