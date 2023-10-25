package report.api.services;

import org.springframework.core.env.Environment;

import report.api.ReportConfig;
import report.api.models.AppConfigModel;

public class BaseService {
	protected AppConfigModel config;
	protected Environment env;
	
	public BaseService(Environment environment) {		
		env = environment;
		config = new AppConfigModel();
		initial();		
	}
	
	private void initial() {
		String url = this.env.getProperty("URL_REPORT_API");
		config.setUrlApi((url == null)? ReportConfig.getServiceApi():url);
	}
	
}
