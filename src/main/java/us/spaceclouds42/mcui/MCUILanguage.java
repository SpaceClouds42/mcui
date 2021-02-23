package us.spaceclouds42.mcui;

import com.intellij.lang.Language;

public class MCUILanguage extends Language {

    public static final MCUILanguage INSTANCE = new MCUILanguage();

    private MCUILanguage() {
        super(Language.findLanguageByID("XML"), "MCUI");
    }

}