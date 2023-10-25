package report.api.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import report.api.repository.BaseRepository;
import report.api.services.TaxInvoiceService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class BaseController {
	protected Environment env;

	public BaseController(Environment environment) {		
		env = environment;
	}

	@GetMapping("GetToken/{ProgramId}")
	public String GetToken(@PathVariable("ProgramId") String ProgramId) {
		BaseRepository repo = new BaseRepository(env);
		String token = repo.GetToken(ProgramId);
		return  "Token : " + token;
	}

}
