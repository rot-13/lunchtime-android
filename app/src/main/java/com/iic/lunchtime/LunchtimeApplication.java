package com.iic.lunchtime;

import android.app.Application;
import android.content.Intent;
import com.iic.lunchtime.services.LunchFetcherService;

/**
 * Created by ifeins on 2/24/15.
 */
public class LunchtimeApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    startService(new Intent(this, LunchFetcherService.class));
  }
}