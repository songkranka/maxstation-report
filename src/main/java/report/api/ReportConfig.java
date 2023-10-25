package report.api;



public   class ReportConfig {
//	private static String serviceApi ="https://uat-maxstation.pt.co.th/report"; // "http://localhost:58782";  //initial call service api
	private static String serviceApi =  "http://localhost:58782";
	public static String getServiceApi() {
		return serviceApi;
	}

	public static void setServiceApi(String serviceApi) {
		ReportConfig.serviceApi = serviceApi;
	}
}


