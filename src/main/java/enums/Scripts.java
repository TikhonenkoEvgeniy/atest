package enums;

public enum Scripts {
    CLEAR_STORAGE ("window.sessionStorage.clear()");

    private final String script;

    Scripts(String script) {
        this.script = script;
    }

    public String getScript() {
        return this.script;
    }
}
