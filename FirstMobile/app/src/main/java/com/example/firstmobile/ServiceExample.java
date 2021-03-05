package com.example.firstmobile;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import java.security.Provider;

public class ServiceExample extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();

        Log.e("Bau","Service đã dc khởi tạo");
    }

    @Override
    public  void onDestroy()
    {
        super.onDestroy();
        Log.e("Bau","Service đã dc hủy");
    }
}
