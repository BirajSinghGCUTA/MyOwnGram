package com.example.myowngram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ArEBjCTX96Extot9Gja3heTw63Jf1BMvnvEsf4ZU")
                .clientKey("doxLBn5Mgv2ucCR6lLFTaI3hIUgXYPY6WC6tvcK2")
                .server("https://parseapi.back4app.com").build());
    }
}
