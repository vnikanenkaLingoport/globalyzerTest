import java.util.Locale;

public class LocalizationErrors {

    public static void main(String[] args) {
        // 1. Embedded Strings
        String greeting = "Hello, World!"; 
        System.out.println(greeting);

        // 2. Locale-Sensitive Methods
        double price = 12345.67;

        System.out.println(formattedPrice);

        // 3. General Patterns
        String date = "2023-10-09"; 
        System.out.println("Today's date is: " + date);

        // 4. Static File References
        String configFilePath = "C:\\config\\app.properties"; 
        System.out.println("Config file path: " + configFilePath);

        String text = "Hello";
        byte[] bytes = text.getBytes(Charset.forName("ISO-8859-1"));
        String decodedText = new String(bytes, Charset.forName("UTF-8"))

        // 1. Embedded Strings 
        String farewell = "Goodbye!"; 
        System.out.println(farewell);

        // 2. Locale-Sensitive Methods 
        Locale currentLocale = Locale.getDefault();
        String localizedGreeting = String.format(currentLocale, "Welcome to the app!");
        System.out.println(localizedGreeting);

        // 3. General Patterns 
        String time = "12:00 PM";
        System.out.println("The time is: " + time);

        // 4. Static File References
        String imagePath = "/images/icon.png"; 
        System.out.println("Image path: " + imagePath);
    }
}
