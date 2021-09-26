<div align=center>

<hr />

# MinecraftColorTranslatorAPI
An open source Bukkit and Bungee util for easy creating your own color translators and using them in your projects. This tool is based on inferfaces so it is very simple and convenient for developers.

<hr />

</div>

## Initial Setup
Initial setup to start using ColorTranslatorAPI.

##### Maven:
```xml
<repository>
    <id>yoonaxes-maven</id>
    <name>yoonaxes repository</name>
    <url>https://maven.yoonaxes.pl/</url>
</repository>

<dependency>
  <groupId>net.yoonaxes.minecraft</groupId>
  <artifactId>colortranslatorapi</artifactId>
  <version>1.0</version>
</dependency>
```

##### Gradle:
```groovy
repositories {
    ...
    maven {
        name = 'yoonaxes-maven'
        url = 'https://maven.yoonaxes.pl/'
    }
}

dependencies {
    implementation 'net.yoonaxes.minecraft:colortranslatorapi:1.0'
}
```

##### Download:
**·** [Download ColorTranslatorAPI-1.0.jar](https://github.com/yoonaxes/MinecraftColorTranslatorAPI/releases/download/1.0/ColorTranslatorAPI-1.0.jar)

**·** [Download other release](https://github.com/yoonaxes/MinecraftColorTranslatorAPI/releases/)

## Example usage

Example usage of ColorTranslatorAPI

##### Example usage of **ExtraColorTranslator**:

```java
import net.yoonaxes.translator.ColorTranslator;
import java.util.List;

public class ExampleUtil {

    // You can use DefaultColorTranslator, ExtraColorTranslator or make own translator.
    private static final ColorTranslator translator = new ExtraColorTranslator();
    
    // It's example of message using ExtraColorTranslator with Bukkit colors.
    private static final String EXAMPLE_MESSAGE = ExampleUtil.translateString("&6It's &esimple!");
    
    public static String translateString(String string) {
        return translator.translateString(string);
    }

    public static List<String> translateList(List<String> stringList) {
        return translator.translateList(stringList);
    }

    public static String[] translateArray(String... strings) {
        return translator.translateArray(strings);
    }
}
```

##### Example of creation **own translator**:

```java
import net.yoonaxes.translator.ColorTranslator;
import java.util.List;

public class ExampleOwnTranslator implements ColorTranslator {

    @Override
    public String translateString(String string) {
        // Own translate method
        // You can use replaces etc.
        return ColorTranslator.super.translateString(string); // This method use default color translation.
    }

    @Override

    public List<String> translateList(List<String> stringList) {
        // This uses translateString to translate all strings in list.
        return ColorTranslator.super.translateList(stringList);
    }

    @Override
    public String[] translateArray(String... strings) {
        // This uses translateString to translate all strings in array.
        return ColorTranslator.super.translateArray(strings);
    }
}
```

<hr />