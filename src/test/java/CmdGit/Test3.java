package CmdGit;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Test3 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   int x=10;
	   System.out.println(x);
	   String y="kalam";
	   System.out.println(y);
	   System.out.println(y.length());
	   RemoteWebDriver driver=new ChromeDriver();
	   driver.get("http://www.yahoo.com");
		}

	}


}
