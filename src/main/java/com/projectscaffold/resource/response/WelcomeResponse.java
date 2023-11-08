package com.projectscaffold.resource.response;

public class WelcomeResponse {
    private String welcomeMessage;

    public WelcomeResponse(String name) {
        welcomeMessage = "Welcome " + name;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }
}
