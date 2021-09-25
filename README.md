<div align=center>

# MinecraftColorTranslatorAPI
An open source Bukkit and Bungee util for easy creating your own color translators and using them in your projects. This tool is based on inferfaces so it is very simple and convenient for developers.

</div>

<hr/>

## Initial Setup:

##### Maven:
```xml
<dependency>
  <groupId>net.yoonaxes</groupId>
  <artifactId>minecraftcolortranslatorapi</artifactId>
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
  implementation 'net.yoonaxes:minecraftcolortranslatorapi:1.0'
}
```

##### Download:
**·** [Download ColorTranslatorAPI-1.0.jar](https://github.com/yoonaxes/MinecraftColorTranslatorAPI/releases/download/downloads/ColorTranslatorAPI-1.0.jar)

**·** [Download other release](https://github.com/yoonaxes/MinecraftColorTranslatorAPI/releases/)

## Example usage

Example usage of **ExtraColorTranslator**:

```java
import net.yoonaxes.translator.ColorTranslator;

import java.util.List;

public class ExampleUtil {

    // You can use DefaultColorTranslator, ExtraColorTranslator or make own translator.
    private static final ColorTranslator translator = new ExtraColorTranslator();
    
    public ExampleUtil() {
        String message = ExampleUtil.translateString("&6It's &esimple!");
    }
    
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

Example of creation **own translator**:

```java
import net.yoonaxes.translator.ColorTranslator;

import java.util.List;

public class ExampleOwnTranslator implements ColorTranslator {

    @Override
    public String translateString(String string) {
        // Own translate method
        // You can use replaces etc.
        return ColorTranslator.super.translateString(string); // This use default color translation.
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