package net.yoonaxes.translator.impl;

import net.yoonaxes.translator.ColorTranslator;
import net.yoonaxes.translator.SpecialCharacter;

/**
 * Extra color translator to bukkit translate alternate codes.
 * Its additional advantage is the changeable characters specially.
 * @author yoonaxes
 */
public class ExtraColorTranslator implements ColorTranslator {

    /**
     * Method for translate a single String.
     * @param string String to translate.
     * @return Translated String.
     */
    @Override
    public String translateString(String string) {
        return ColorTranslator.super.translateString(
                string
                        .replace("{*}", SpecialCharacter.DOT.getUnicode())
                        .replace("{<-}", SpecialCharacter.LEFT_ARROW.getUnicode())
                        .replace("{->}", SpecialCharacter.RIGHT_ARROW.getUnicode())
                        .replace("{<}", SpecialCharacter.DOUBLE_LEFT_ARROW.getUnicode())
                        .replace("{>}", SpecialCharacter.DOUBLE_RIGHT_ARROW.getUnicode())
        );
    }
}
