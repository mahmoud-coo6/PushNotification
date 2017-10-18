package com.app.pushnotification;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

/**
 * Created by Mahmoud Abdo on 8/13/2017.
 */

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MyServeseJop extends JobService {
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
//        Log.d("JobService",);
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
