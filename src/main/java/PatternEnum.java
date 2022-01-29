public enum PatternEnum {
    MOBILE_PHONE("(\\+7|8)-\\d{3}-\\d{3}-\\d{2}-\\d{2}"),
    EMAIL("\\w{3,15}@\\w+.(ru|com)");
    private final String pattern;

    PatternEnum(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
