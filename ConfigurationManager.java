import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance = null;
    private Map<String, String> configSettings;

    private ConfigurationManager() {
        configSettings = new HashMap<>();
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configSettings.get(key);
    }

    public void printAllConfigurations() {
        System.out.println("Configuration Settings:");
        for (Map.Entry<String, String> entry : configSettings.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}