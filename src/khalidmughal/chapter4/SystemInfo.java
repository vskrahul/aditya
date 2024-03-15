package khalidmughal.chapter4;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemInfo {

    public static final int ONE = 1;
    public static final int TWO = 2;

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        printAllProperties(properties);
        //printSome(properties);

    }

    static void printAllProperties(Properties properties) {
        Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
        for(Map.Entry<Object, Object> entry : entrySet) {
            System.out.println("[" + entry.getKey() + " -> " + entry.getValue() + "]");
        }
    }

    static void printSome(Properties properties) {
        System.out.println(properties.getProperty("java.vm.name"));
        System.out.println(properties.getProperty("user.country"));
        System.out.println(properties.getProperty("java.runtime.version"));
        System.out.println(properties.getProperty("java.class.version"));
        System.out.println(properties.getProperty("java.home"));
        System.out.println(properties.getProperty("os.arch"));
        System.out.println(properties.getProperty("os.name"));
        System.out.println(properties.getProperty("user.home"));
        System.out.println(properties.getProperty("user.dir"));
        System.out.println(properties.getProperty("user.name"));
        System.out.println(properties.getProperty("user.language"));
    }
}
