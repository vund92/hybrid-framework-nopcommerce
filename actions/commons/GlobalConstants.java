package commons;

import java.io.File;

public class GlobalConstants {
	public static final String PORTAL_DEV_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_DEV_URL = "https://admin-demo.nopcommerce.com";

	public static final String PORTAL_TESTING_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_TESTING_URL = "https://admin-demo.nopcommerce.com";

	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String OS_NAME = System.getProperty("os.name");
	public static final String UPLOAD_FILE = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
	public static final String DOWNLOAD_FILE = PROJECT_PATH + File.separator + "downloadFiles";
	public static final String BROWSER_LOG = PROJECT_PATH + File.separator + "browserLogs";
	public static final String DRAG_DROP_HTML5 = PROJECT_PATH + File.separator + "dragDropHTML5";
	public static final String AUTO_IT_SCRIPT = PROJECT_PATH + File.separator + "autoIT";
	public static final String REPORTING_SCREENSHOT = PROJECT_PATH + File.separator + "reportNGScreenShots"
			+ File.separator;
	public static final String EXTENT_REPORT_PATH = PROJECT_PATH + File.separator + "extentReportV2" + File.separator;

	public static final String DB_DEV_URL = "32.18.252.185:9860";
	public static final String DB_DEV_USER = "automationfc";
	public static final String DB_DEV_PASS = "P@ssworld1!";

	public static final String DB_TEST_URL = "32.18.195.23:9860";
	public static final String DB_TEST_USER = "automationfc";
	public static final String DB_TEST_PASS = "P@ssworld1!";

	public static final long SHORT_TIMEOUT = 5;
	public static final long LONG_TIMEOUT = 30;
	public static final long RETRY_TEST_FAIL = 3;

	public static final String JAVA_VERSION = System.getProperty("java.version");

	public static final String BROWSER_USERNAME = "automationfc1";
	public static final String BROWSER_AUTOMATE_KEY = "HzcRC4Q1fzuQhRJYSkhz";
	public static final String BROWSER_STACK_URL = "https://" + BROWSER_USERNAME + ":" + BROWSER_AUTOMATE_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static final String SAUCE_USERNAME = "automationfc";
	public static final String SAUCE_AUTOMATE_KEY = "f8117ac5-9793-4f8d-89ca-6a3c1d7216a5";
	public static final String SAUCE_URL = "https://" + SAUCE_USERNAME + ":" + SAUCE_AUTOMATE_KEY
			+ "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

	public static final String CROSS_USERNAME = "damdm@vntesters.com".replaceAll("@", "%40");
	public static final String CROSS_ACCESS_KEY = "uad436a40401a0c2";
	public static final String CROSS_URL = "http://" + CROSS_USERNAME + ":" + CROSS_ACCESS_KEY
			+ "@hub.crossbrowsertesting.com:80/wd/hub";
	
	public static final String LAMBDA_USERNAME = "automationfc.com";
	public static final String LAMBDA_ACCESS_KEY = "LSMxg11SndU7qjktdaOmTOtwcGnrKkN1G3eWptwWYVAZp8Ewia";
	public static final String LAMBDA_URL = "https://" + LAMBDA_USERNAME  + ":" + LAMBDA_ACCESS_KEY + "@hub.lambdatest.com/wd/hub";

}
