package net.yoonaxes.translator;

import net.md_5.bungee.api.ChatColor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Translate your text and use Bukkit translate alternate codes to use colors.
 * @author yoonaxes
 */
public interface ColorTranslator {

    /**
     * Method for translate a single String.
     * @param string String to translate.
     * @return Translated String.
     */
    default String translateString(String string) {
        if(string == null)
            return "";

        return ChatColor.translateAlternateColorCodes('&', string);
    }

    /**
     * Method for translate String List.
     * @param stringList List<String> to translate.
     * @return Translated List<String>.
     */
    default List<String> translateList(List<String> stringList) {
        return stringList.stream()
                .map(this::translateString)
                .collect(Collectors.toList());
    }

    /**
     * Method for translate String Array.
     * @param strings String[] to translate.
     * @return Translated String[].
     */
    default String[] translateArray(String... strings) {
        return Arrays.stream(strings)
                .map(this::translateString)
                .toArray(String[]::new);
    }
}
