package ichwan.maven;

import com.google.gson.Gson;
import maven.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();

        Person person = new Person("Ichwan Sholihin");

        String json = gson.toJson(person);

        System.out.println(json);
    }
}
