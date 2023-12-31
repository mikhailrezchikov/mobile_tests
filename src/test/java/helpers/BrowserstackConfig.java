package helpers;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${env}.properties"
})
public interface BrowserstackConfig extends Config {

    @Key("user")
    @DefaultValue("mikhailrezchikov_td7S4b")
    String getUser();

    @Key("key")
    @DefaultValue("ohGQgUeXoCesCtPeoi7K")
    String getKey();

    @Key("baseUrl")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String getBaseUrl();

    @Key("app")
    @DefaultValue("bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
    String getApp();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String getDevice();

    @Key("osVersion")
    @DefaultValue("9.0")
    String getOsVersion();

    @Key("project")
    @DefaultValue("First Java Project")
    String getProject();

    @Key("build")
    @DefaultValue("browserstack-build-1")
    String getBuild();

    @Key("name")
    @DefaultValue("first_test")
    String getName();
}