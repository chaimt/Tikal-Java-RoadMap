import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfigurationLayout;
import org.apache.commons.configuration.SystemConfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Haim.Turkel on 2/15/2016.
 */
public class FileSearch {

    //there is a dir with multiple files that begin with about~updates~
    //format is below
    //we need to ge the highet BUILD_NUMBER value

//    file format:
//    Coordinates   : [updates:index:company:1425811924774]
//    [BUILD_NUMBER]  : [1425811924774]
//    [ENTRIES_UPDATED]  : [981]



    private static String getPropertyValue(File destPropertyResource, String propertyName) throws IOException, ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration();
        config.setDelimiterParsingDisabled(true);
        PropertiesConfigurationLayout layout = new PropertiesConfigurationLayout(config);
        InputStreamReader input = new InputStreamReader(new FileInputStream(destPropertyResource));
        layout.load(input);
        input.close();

        return config.getString(propertyName);
    }


    private static String getVersion(File fileResource)  {
        //extract BUILD_NUMBER from file
        try {
            String buildNumber = getPropertyValue(fileResource, "[BUILD_NUMBER]");
            if (buildNumber != null && buildNumber.length() > 2) {
                return buildNumber.substring(1, buildNumber.length() - 1);
            }
        }
        catch(Exception e){
        }
        return "";
    }

    public static String java7Search(String dirToSearch) throws IOException, ConfigurationException {
        Long highest = 0L;
        File dir = new File(dirToSearch);
        if (dir.listFiles()!=null) {
            for (File file : dir.listFiles()) {
                if (file.getName().startsWith("about~updates~")) {
                    long current = Long.parseLong(getVersion(file));
                    if (current > highest) {
                        highest = current;
                    }
                }
            }
        }
        return highest.toString();
    }


    public static String java8Search(String dirToSearch) throws IOException, ConfigurationException {
        Long aLong = Arrays.stream((new File(dirToSearch)).listFiles())
                        .filter(file -> file.getName().startsWith("about~updates~"))
                        .map(file -> Long.valueOf(getVersion(file)))
                        .max((o1, o2) -> o1 > o2 ? 01 : 02)
                        .orElseGet(() -> 0L);
        return aLong.toString();
    }


    public static void main(String[] args) throws IOException, ConfigurationException {
        String s = java7Search("C:\\dev\\workspace\\trunk\\devmain\\DEV5_COMP\\var\\versions");
        System.out.print(s);
        String ss = java8Search("C:\\dev\\workspace\\trunk\\devmain\\DEV5_COMP\\var\\versions");
        System.out.print(ss);


        s = java7Search("C:\\dev\\workspace\\trunk\\devmain\\DEV5_COMP\\var\\empty1");
        System.out.print(s);
        ss = java8Search("C:\\dev\\workspace\\trunk\\devmain\\DEV5_COMP\\var\\empty1");
        System.out.print(ss);
    }
}
