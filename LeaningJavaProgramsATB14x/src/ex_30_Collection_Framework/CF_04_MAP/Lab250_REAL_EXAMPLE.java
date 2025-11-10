package ex_30_Collection_Framework.CF_04_MAP;

import java.util.*;

public class Lab250_REAL_EXAMPLE {
    public static void main(String[] args) {
        Map<String, String> envConfig = new HashMap<>();
        envConfig.put("production", "https://prod.api.com");
        envConfig.put("staging", "https://staging.api.com");

        Map<String, String> credentials = new HashMap<>();
        credentials.put("admin", "admin123");
        credentials.put("user", "user123");
    }
}
