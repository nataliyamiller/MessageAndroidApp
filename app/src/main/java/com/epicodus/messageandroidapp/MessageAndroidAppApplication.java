package com.epicodus.messageandroidapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by nataliyamiller on 11/23/15.
 */
public class MessageAndroidAppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "Pjf7DQSD3ZDrlZwMl31EwOpQLJhsxK9e5JwYdBDg", "bENuVJwoDJEJrufWhdLf66ERDSHVXXUgFlGmswCU");

    }

}
