package dev.awd.creational.builder.exercise;

public class ConfigurationManager {
    private final int graphicsQuality;
    private final boolean enableSound;
    private final String controlScheme;
    private final String displayMode;
    private final boolean enableNotifications;

    private ConfigurationManager(GameConfigurationBuilder builder) {
        this.graphicsQuality = builder.graphicsQuality;
        this.enableSound = builder.enableSound;
        this.controlScheme = builder.controlScheme;
        this.displayMode = builder.displayMode;
        this.enableNotifications = builder.enableNotifications;
    }

    public int getGraphicsQuality() {
        return graphicsQuality;
    }

    public boolean isEnableSound() {
        return enableSound;
    }

    public String getControlScheme() {
        return controlScheme;
    }

    public String getDisplayMode() {
        return displayMode;
    }

    public boolean isEnableNotifications() {
        return enableNotifications;
    }

    public static class GameConfigurationBuilder implements ConfigurationBuilder {
        private int graphicsQuality;
        private boolean enableSound;
        private String controlScheme;
        private String displayMode;
        private boolean enableNotifications;

        @Override
        public GameConfigurationBuilder setGraphicsQuality(int graphicsQuality) {
            this.graphicsQuality = 1;
            return this;
        }

        @Override
        public GameConfigurationBuilder setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }

        @Override
        public GameConfigurationBuilder enableSound() {
            this.enableSound = true;
            return this;
        }

        @Override
        public GameConfigurationBuilder enableNotification() {
            this.enableNotifications = true;
            return this;
        }

        @Override
        public GameConfigurationBuilder setControlScheme(String colorScheme) {
            this.controlScheme = colorScheme;
            return this;
        }

        public ConfigurationManager build() {
            return new ConfigurationManager(this);
        }
    }
}
