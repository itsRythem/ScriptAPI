package team.ascension.scripting;

import team.ascension.scripting.bindings.IScriptMath;

public class ScriptAPI {

    public static final ScriptAPI INSTANCE = new ScriptAPI(1);

    private final ScriptController templateController = new ScriptController(this);

    public final int version;
    public ScriptAPI(final int version) {
        this.version = version;

        this.templateController.register(IScriptMath.class);
    }

    public ScriptController getController() {
        return new ScriptController(this);
    }

    public ScriptController getTemplateController() {
        return this.templateController;
    }

}