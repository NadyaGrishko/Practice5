package com.google.devrel.training.conference;

import com.google.api.server.spi.Constant;

/**
 * Contains the client IDs and scopes for allowed clients consuming the conference API.
 */
public class Constants {
    public static final String WEB_CLIENT_ID = "101623515158-dn0bsvsq2qj449ie9v81650b0m3l4nto.apps.googleusercontent.com";
    public static final String ANDROID_CLIENT_ID = "ySzF7u-jWUcHVDNbLG46EGck";
    public static final String IOS_CLIENT_ID = "AIzaSyAF7hcNAHVPFrr8NPGxEcHwOanOD_v3Zr4";
    public static final String ANDROID_AUDIENCE = WEB_CLIENT_ID;
    public static final String EMAIL_SCOPE = Constant.API_EMAIL_SCOPE;
    public static final String API_EXPLORER_CLIENT_ID = Constant.API_EXPLORER_CLIENT_ID;

    public static final String MEMCACHE_ANNOUNCEMENTS_KEY = "RECENT_ANNOUNCEMENTS";
}