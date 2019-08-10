import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

public static void main(String[] args) throws IOException {

/*create in instance of file class by passing location of

* property file

*/

File file=new File(".\\TestData\\AppData.properties");

/*Create an instance of FileInputStream class and pass file

* class instance to its constructor*/

FileInputStream fis=new FileInputStream(file.getAbsolutePath());

/*create an instance of Properties class*/

Properties prop=new Properties();

/*load the property file*/

prop.load(fis);

/*read data from property file*/

System.out.println(prop.get("username"));

System.out.println(prop.get("password"));

System.out.println(prop.get("loginPageTitle"));

}

}