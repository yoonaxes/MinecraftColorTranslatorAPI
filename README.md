<div align=center>

<hr />

# MinecraftColorTranslatorAPI
An open source Bukkit and Bungee util for easy creating your own color translators and using them in your projects. This tool is based on inferfaces so it is very simple and convenient for developers.

<hr />

</div>

## Initial Setup:
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
**·** [Download ColorTranslatorAPI-1.0.jar](https://github.com/yoonaxes/MinecraftColorTranslatorAPI/releases/download/downloads/ColorTranslatorAPI-1.0.jar)

**·** [Download other release](https://github.com/yoonaxes/MinecraftColorTranslatorAPI/releases/)

[comment]: <> (<br />)

[comment]: <> (## Example usage)

[comment]: <> (Example usage of **ExtraColorTranslator**:)

[comment]: <> (```java)

[comment]: <> (import net.yoonaxes.translator.ColorTranslator;)

[comment]: <> (import java.util.List;)

[comment]: <> (public class ExampleUtil {)

[comment]: <> (    // You can use DefaultColorTranslator, ExtraColorTranslator or make own translator.)

[comment]: <> (    private static final ColorTranslator translator = new ExtraColorTranslator&#40;&#41;;)
    
[comment]: <> (    // It's example of message using ExtraColorTranslator with Bukkit colors.)

[comment]: <> (    private static final String EXAMPLE_MESSAGE = ExampleUtil.translateString&#40;"&6It's &esimple!"&#41;;)
    
[comment]: <> (    public static String translateString&#40;String string&#41; {)

[comment]: <> (        return translator.translateString&#40;string&#41;;)

[comment]: <> (    })

[comment]: <> (    public static List<String> translateList&#40;List<String> stringList&#41; {)

[comment]: <> (        return translator.translateList&#40;stringList&#41;;)

[comment]: <> (    })

[comment]: <> (    public static String[] translateArray&#40;String... strings&#41; {)

[comment]: <> (        return translator.translateArray&#40;strings&#41;;)

[comment]: <> (    })

[comment]: <> (})

[comment]: <> (```)

[comment]: <> (<br />)

[comment]: <> (Example of creation **own translator**:)

[comment]: <> (```java)

[comment]: <> (import net.yoonaxes.translator.ColorTranslator;)

[comment]: <> (import java.util.List;)

[comment]: <> (public class ExampleOwnTranslator implements ColorTranslator {)

[comment]: <> (    @Override)

[comment]: <> (    public String translateString&#40;String string&#41; {)

[comment]: <> (        // Own translate method)

[comment]: <> (        // You can use replaces etc.)

[comment]: <> (        return ColorTranslator.super.translateString&#40;string&#41;; // This use default color translation.)

[comment]: <> (    })

[comment]: <> (    @Override)

[comment]: <> (    public List<String> translateList&#40;List<String> stringList&#41; {)

[comment]: <> (        // This uses translateString to translate all strings in list.)

[comment]: <> (        return ColorTranslator.super.translateList&#40;stringList&#41;;)

[comment]: <> (    })

[comment]: <> (    @Override)

[comment]: <> (    public String[] translateArray&#40;String... strings&#41; {)

[comment]: <> (        // This uses translateString to translate all strings in array.)

[comment]: <> (        return ColorTranslator.super.translateArray&#40;strings&#41;;)

[comment]: <> (    })

[comment]: <> (})

[comment]: <> (```)