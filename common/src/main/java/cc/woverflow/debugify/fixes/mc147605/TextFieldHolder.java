package cc.woverflow.debugify.fixes.mc147605;

import net.minecraft.client.gui.widget.TextFieldWidget;
import org.jetbrains.annotations.Nullable;

public interface TextFieldHolder {
    @Nullable
    TextFieldWidget getFocusedTextField();

    void setFocusedTextField(@Nullable TextFieldWidget widget);
}
