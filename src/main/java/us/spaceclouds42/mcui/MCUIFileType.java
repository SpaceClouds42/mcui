package us.spaceclouds42.mcui;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class MCUIFileType extends LanguageFileType {

    public static final MCUIFileType INSTANCE = new MCUIFileType();

    private MCUIFileType() {
        super(MCUILanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "MCUI file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "MCUI markup language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mcui";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MCUIIcons.ICON;
    }
}
