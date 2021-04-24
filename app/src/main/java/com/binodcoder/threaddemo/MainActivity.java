package com.binodcoder.threaddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start, stop;
    private static final String TAG = "MainActivity";
    private Handler mainHandler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.btn_start);
        stop = (Button) findViewById(R.id.btn_stop);
    }

    public void startThread(View view) {

        for (int i = 0; i < 10; i++) {
            Log.d(TAG, "WithOut Thread:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



//       ExampleThread thread=new ExampleThread(10);
//       thread.start();



//        ExampleRunnable runnable = new ExampleRunnable(10);
//        new Thread(runnable).start();

    }

    public void stopThread(View view) {

    }

    //extending thread class
    class ExampleThread extends Thread {
        int seconds;

        ExampleThread(int seconds) {
            this.seconds = seconds;
        }

        public void run() {
            for (int i = 0; i < seconds; i++) {
                Log.d(TAG, "ExampleThread: startThread:" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //implementing runnable interface
    class ExampleRunnable implements Runnable {
        int seconds;

        ExampleRunnable(int seconds) {
            this.seconds = seconds;
        }

        public void run() {
            for (int i = 0; i < 10; i++) {
                Log.d(TAG, "ExampleRunnable:startThread:" + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
