package enums;

import static config.Constants.ROOT_URL;

public enum UrlPages {
    HOME (ROOT_URL + "/"),
    LOGIN (ROOT_URL + "/login");

    private final String url;

    UrlPages(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
