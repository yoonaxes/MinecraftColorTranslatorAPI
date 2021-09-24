package net.yoonaxes.translator;

/**
 * Use a special characters in your text.
 * Choose your special character and get his unicode.
 * @author yoonaxes
 */
public enum SpecialCharacter {

    /** Character:   ·   */
    DOT ("\u00B7"),

    /** Character:   ←   */
    LEFT_ARROW("\u2190"),

    /** Character:   →   */
    RIGHT_ARROW("\u2192"),

    /** Character:   «   */
    DOUBLE_LEFT_ARROW("\u00AB"),

    /** Character:   »   */
    DOUBLE_RIGHT_ARROW("\u00BB");

    private String unicode;

    SpecialCharacter(String unicode) {
        this.unicode = unicode;
    }

    /**
     * Get a character unicode.
     * @return String with character unicode
     */
    public String getUnicode() {
        return unicode;
    }
}
