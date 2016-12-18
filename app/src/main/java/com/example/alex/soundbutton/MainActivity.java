package com.example.alex.soundbutton;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    MediaPlayer mp, mp2, mp3, mp4, mp5, mp6, mp7, mp8, mp9;
    MediaPlayer mpa, mp2a, mp3a, mp4a, mp5a, mp6a, mp7a, mp8a, mp9a;
    protected int k = 0;
    private boolean pushe=true;
    ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9;
    private SeekBar volumeSeekbar = null;
    private AudioManager audioManager = null;
    private TextView volume;
    private int currentVolume1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        AudioManager audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        currentVolume1 = audio.getStreamVolume(AudioManager.STREAM_MUSIC);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        initControls();

        volume=(TextView) findViewById(R.id.volume) ;
        volume.setText("Volume : "+currentVolume1);

        ib1=(ImageButton) findViewById(R.id.imageButton1);
        ib1.setSoundEffectsEnabled(false);
        ib2=(ImageButton) findViewById(R.id.imageButton2);
        ib2.setSoundEffectsEnabled(false);
        ib3=(ImageButton) findViewById(R.id.imageButton3);
        ib3.setSoundEffectsEnabled(false);
        ib4=(ImageButton) findViewById(R.id.imageButton4);
        ib4.setSoundEffectsEnabled(false);
        ib5=(ImageButton) findViewById(R.id.imageButton5);
        ib5.setSoundEffectsEnabled(false);
        ib6=(ImageButton) findViewById(R.id.imageButton6);
        ib6.setSoundEffectsEnabled(false);
        ib7=(ImageButton) findViewById(R.id.imageButton7);
        ib7.setSoundEffectsEnabled(false);
        ib8=(ImageButton) findViewById(R.id.imageButton8);
        ib8.setSoundEffectsEnabled(false);
        ib9=(ImageButton) findViewById(R.id.imageButton9);
        ib9.setSoundEffectsEnabled(false);

        mp = MediaPlayer.create(this, R.raw.ga);
        mpa = MediaPlayer.create(this, R.raw.ga);
        mp2 = MediaPlayer.create(this, R.raw.di);
        mp2a = MediaPlayer.create(this, R.raw.di);
        mp3 = MediaPlayer.create(this, R.raw.ke);
        mp3a = MediaPlayer.create(this, R.raw.ke);
        mp4 = MediaPlayer.create(this, R.raw.pa);
        mp4a = MediaPlayer.create(this, R.raw.pa);
        mp5 = MediaPlayer.create(this, R.raw.vou);
        mp5a = MediaPlayer.create(this, R.raw.vou);
        mp6 = MediaPlayer.create(this, R.raw.zwyf);
        mp6a = MediaPlayer.create(this, R.raw.zwyf);
        mp7 = MediaPlayer.create(this, R.raw.zw);
        mp7a = MediaPlayer.create(this, R.raw.zw);
        mp8 = MediaPlayer.create(this, R.raw.nh);
        mp8a = MediaPlayer.create(this, R.raw.nh);
        mp9 = MediaPlayer.create(this, R.raw.gadie);
        mp9a = MediaPlayer.create(this, R.raw.gadie);



    }

    public void ga(View view) {
        k=0;
        boolean check=true;

        if (pushe==false) {
            return;
        }

        pushe=false;
        final Handler pushen = new Handler();
        pushen.postDelayed(new Runnable() {
            @Override
            public void run() {
              pushe=true;
            }
        },1500);


        if (mp.isPlaying()) {
            check=false;
            ib1.setBackgroundResource(R.drawable.ga);
            mp.seekTo(0);
            mp.pause();
            if(!mpa.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 500);
            }
            else
            {
                mpa.seekTo(0);
                mpa.pause();
            }

        }
        else if(mp2.isPlaying()){
            ib2.setBackgroundResource(R.drawable.di);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp2.seekTo(0);
                    mp2.pause();
                }
            }, 1000);

            if(!mp2a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp2a.isPlaying())
                        {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
            }
        }
        else if(mp3.isPlaying()){
            ib3.setBackgroundResource(R.drawable.ke);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp3.seekTo(0);
                    mp3.pause();
                }
            }, 1000);

            if(!mp3a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp3a.isPlaying())
                        {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp4.isPlaying()){
            ib4.setBackgroundResource(R.drawable.pa);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp4.seekTo(0);
                    mp4.pause();
                }
            }, 1000);

            if(!mp4a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp4a.isPlaying())
                        {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp5.isPlaying()){
            ib5.setBackgroundResource(R.drawable.vou);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp5.seekTo(0);
                    mp5.pause();
                }
            }, 1000);

            if(!mp5a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp5a.isPlaying())
                        {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp6.isPlaying()){
            ib6.setBackgroundResource(R.drawable.zwyfesi);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp6.seekTo(0);
                    mp6.pause();
                }
            }, 1000);

            if(!mp6a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp6a.isPlaying())
                        {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp7.isPlaying()){
            ib7.setBackgroundResource(R.drawable.zw);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp7.seekTo(0);
                    mp7.pause();
                }
            }, 1000);

            if(!mp7a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp7a.isPlaying())
                        {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp8.isPlaying()){
            ib8.setBackgroundResource(R.drawable.nh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp8.seekTo(0);
                    mp8.pause();
                }
            }, 1000);

            if(!mp8a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp8a.isPlaying())
                        {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp9.isPlaying()){
            ib9.setBackgroundResource(R.drawable.gadiesh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp9.seekTo(0);
                    mp9.pause();
                }
            }, 1000);

            if(!mp9a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp9a.isPlaying())
                        {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
            }

        }


        if(check) {
            ib1.setBackgroundResource(R.drawable.gapress);
            mp.start();
            mp.setLooping(true);
            final Handler mpal1 = new Handler();
            mpal1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mpa.start();
                    mpa.setLooping(true);
                }
            }, 5000);
        }

    } //TODO okay

    /////////////////////////////////////////////////////////////////////////////////////////////////


    public void di(View view) {

        k=0;
        boolean check=true;

        if (pushe==false) {
            return;
        }

        pushe=false;
        final Handler pushen = new Handler();
        pushen.postDelayed(new Runnable() {
            @Override
            public void run() {
                pushe=true;
            }
        },1500);


        if (mp2.isPlaying()) {
            check=false;
            ib2.setBackgroundResource(R.drawable.di);
            mp2.seekTo(0);
            mp2.pause();
            if(!mp2a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 500);
            }
            else
            {
                mp2a.seekTo(0);
                mp2a.pause();
            }

        }
        else if(mp.isPlaying()){
            ib1.setBackgroundResource(R.drawable.ga);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp.seekTo(0);
                    mp.pause();
                }
            }, 1000);

            if(!mpa.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mpa.isPlaying())
                        {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
            }
        }
        else if(mp3.isPlaying()){
            ib3.setBackgroundResource(R.drawable.ke);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp3.seekTo(0);
                    mp3.pause();
                }
            }, 1000);

            if(!mp3a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp3a.isPlaying())
                        {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp4.isPlaying()){
            ib4.setBackgroundResource(R.drawable.pa);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp4.seekTo(0);
                    mp4.pause();
                }
            }, 1000);

            if(!mp4a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp4a.isPlaying())
                        {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp5.isPlaying()){
            ib5.setBackgroundResource(R.drawable.vou);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp5.seekTo(0);
                    mp5.pause();
                }
            }, 1000);

            if(!mp5a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp5a.isPlaying())
                        {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp6.isPlaying()){
            ib6.setBackgroundResource(R.drawable.zwyfesi);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp6.seekTo(0);
                    mp6.pause();
                }
            }, 1000);

            if(!mp6a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp6a.isPlaying())
                        {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp7.isPlaying()){
            ib7.setBackgroundResource(R.drawable.zw);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp7.seekTo(0);
                    mp7.pause();
                }
            }, 1000);

            if(!mp7a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp7a.isPlaying())
                        {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp8.isPlaying()){
            ib8.setBackgroundResource(R.drawable.nh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp8.seekTo(0);
                    mp8.pause();
                }
            }, 1000);

            if(!mp8a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp8a.isPlaying())
                        {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp9.isPlaying()){
            ib9.setBackgroundResource(R.drawable.gadiesh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp9.seekTo(0);
                    mp9.pause();
                }
            }, 1000);

            if(!mp9a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp9a.isPlaying())
                        {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
            }

        }


        if(check){
            ib2.setBackgroundResource(R.drawable.dipress);
            mp2.start();
            mp2.setLooping(true);
            final Handler mpal1 = new Handler();
            mpal1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp2a.start();
                    mp2a.setLooping(true);
                }
            }, 5000);
        }

    } //TODO okay

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public void ke(View view) {

        k=0;
        boolean check=true;
        if (pushe==false) {
            return;
        }

        pushe=false;
        final Handler pushen = new Handler();
        pushen.postDelayed(new Runnable() {
            @Override
            public void run() {
                pushe=true;
            }
        },1500);


        if (mp3.isPlaying()) {
            check=false;
            ib3.setBackgroundResource(R.drawable.ke);
            mp3.seekTo(0);
            mp3.pause();
            if(!mp3a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 500);
            }
            else
            {
                mp3a.seekTo(0);
                mp3a.pause();
            }

        }
        else if(mp2.isPlaying()){
            ib2.setBackgroundResource(R.drawable.di);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp2.seekTo(0);
                    mp2.pause();
                }
            }, 1000);

            if(!mp2a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp2a.isPlaying())
                        {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
            }
        }
        else if(mp.isPlaying()){
            ib1.setBackgroundResource(R.drawable.ga);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp.seekTo(0);
                    mp.pause();
                }
            }, 1000);

            if(!mpa.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mpa.isPlaying())
                        {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp4.isPlaying()){
            ib4.setBackgroundResource(R.drawable.pa);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp4.seekTo(0);
                    mp4.pause();
                }
            }, 1000);

            if(!mp4a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp4a.isPlaying())
                        {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp5.isPlaying()){
            ib5.setBackgroundResource(R.drawable.vou);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp5.seekTo(0);
                    mp5.pause();
                }
            }, 1000);

            if(!mp5a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp5a.isPlaying())
                        {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp6.isPlaying()){
            ib6.setBackgroundResource(R.drawable.zwyfesi);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp6.seekTo(0);
                    mp6.pause();
                }
            }, 1000);

            if(!mp6a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp6a.isPlaying())
                        {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp7.isPlaying()){
            ib7.setBackgroundResource(R.drawable.zw);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp7.seekTo(0);
                    mp7.pause();
                }
            }, 1000);

            if(!mp7a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp7a.isPlaying())
                        {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp8.isPlaying()){
            ib8.setBackgroundResource(R.drawable.nh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp8.seekTo(0);
                    mp8.pause();
                }
            }, 1000);

            if(!mp8a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp8a.isPlaying())
                        {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp9.isPlaying()){
            ib9.setBackgroundResource(R.drawable.gadiesh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp9.seekTo(0);
                    mp9.pause();
                }
            }, 1000);

            if(!mp9a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp9a.isPlaying())
                        {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
            }

        }


        if(check) {
            ib3.setBackgroundResource(R.drawable.kepress);
            mp3.start();
            mp3.setLooping(true);
            final Handler mpal1 = new Handler();
            mpal1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp3a.start();
                    mp3a.setLooping(true);
                }
            }, 5000);
        }

    } //TODO okay

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public void pa(View view) {
        boolean check=true;
        k=0;

        if (pushe==false) {
            return;
        }

        pushe=false;
        final Handler pushen = new Handler();
        pushen.postDelayed(new Runnable() {
            @Override
            public void run() {
                pushe=true;
            }
        },1500);


        if (mp4.isPlaying()) {
            check=false;
            ib4.setBackgroundResource(R.drawable.pa);
            mp4.seekTo(0);
            mp4.pause();
            if(!mp4a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 500);
            }
            else
            {
                mp4a.seekTo(0);
                mp4a.pause();
            }

        }
        else if(mp2.isPlaying()){
            ib2.setBackgroundResource(R.drawable.di);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp2.seekTo(0);
                    mp2.pause();
                }
            }, 1000);

            if(!mp2a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp2a.isPlaying())
                        {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
            }
        }
        else if(mp3.isPlaying()){
            ib3.setBackgroundResource(R.drawable.ke);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp3.seekTo(0);
                    mp3.pause();
                }
            }, 1000);

            if(!mp3a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp3a.isPlaying())
                        {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp.isPlaying()){
            ib1.setBackgroundResource(R.drawable.ga);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp.seekTo(0);
                    mp.pause();
                }
            }, 1000);

            if(!mpa.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mpa.isPlaying())
                        {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp5.isPlaying()){
            ib5.setBackgroundResource(R.drawable.vou);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp5.seekTo(0);
                    mp5.pause();
                }
            }, 1000);

            if(!mp5a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp5a.isPlaying())
                        {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp6.isPlaying()){
            ib6.setBackgroundResource(R.drawable.zwyfesi);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp6.seekTo(0);
                    mp6.pause();
                }
            }, 1000);

            if(!mp6a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp6a.isPlaying())
                        {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp7.isPlaying()){
            ib7.setBackgroundResource(R.drawable.zw);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp7.seekTo(0);
                    mp7.pause();
                }
            }, 1000);

            if(!mp7a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp7a.isPlaying())
                        {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp8.isPlaying()){
            ib8.setBackgroundResource(R.drawable.nh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp8.seekTo(0);
                    mp8.pause();
                }
            }, 1000);

            if(!mp8a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp8a.isPlaying())
                        {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp9.isPlaying()){
            ib9.setBackgroundResource(R.drawable.gadiesh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp9.seekTo(0);
                    mp9.pause();
                }
            }, 1000);

            if(!mp9a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp9a.isPlaying())
                        {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
            }

        }


        if(check) {
            ib4.setBackgroundResource(R.drawable.papress);
            mp4.start();
            mp4.setLooping(true);
            final Handler mpal1 = new Handler();
            mpal1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp4a.start();
                    mp4a.setLooping(true);
                }
            }, 5000);
        }
    } //TODO okay

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public void vou(View view) {
        boolean check=true;
        k=0;

        if (pushe==false) {
            return;
        }

        pushe=false;
        final Handler pushen = new Handler();
        pushen.postDelayed(new Runnable() {
            @Override
            public void run() {
                pushe=true;
            }
        },1500);


        if (mp5.isPlaying()) {
            check=false;
            ib5.setBackgroundResource(R.drawable.vou);
            mp5.seekTo(0);
            mp5.pause();
            if(!mp5a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 500);
            }
            else
            {
                mp5a.seekTo(0);
                mp5a.pause();
            }

        }
        else if(mp2.isPlaying()){
            ib2.setBackgroundResource(R.drawable.di);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp2.seekTo(0);
                    mp2.pause();
                }
            }, 1000);

            if(!mp2a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp2a.isPlaying())
                        {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
            }
        }
        else if(mp3.isPlaying()){
            ib3.setBackgroundResource(R.drawable.ke);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp3.seekTo(0);
                    mp3.pause();
                }
            }, 1000);

            if(!mp3a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp3a.isPlaying())
                        {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp4.isPlaying()){
            ib4.setBackgroundResource(R.drawable.pa);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp4.seekTo(0);
                    mp4.pause();
                }
            }, 1000);

            if(!mp4a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp4a.isPlaying())
                        {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp.isPlaying()){
            ib1.setBackgroundResource(R.drawable.ga);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp.seekTo(0);
                    mp.pause();
                }
            }, 1000);

            if(!mpa.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mpa.isPlaying())
                        {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp6.isPlaying()){
            ib6.setBackgroundResource(R.drawable.zwyfesi);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp6.seekTo(0);
                    mp6.pause();
                }
            }, 1000);

            if(!mp6a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp6a.isPlaying())
                        {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp7.isPlaying()){
            ib7.setBackgroundResource(R.drawable.zw);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp7.seekTo(0);
                    mp7.pause();
                }
            }, 1000);

            if(!mp7a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp7a.isPlaying())
                        {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp8.isPlaying()){
            ib8.setBackgroundResource(R.drawable.nh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp8.seekTo(0);
                    mp8.pause();
                }
            }, 1000);

            if(!mp8a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp8a.isPlaying())
                        {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp9.isPlaying()){
            ib9.setBackgroundResource(R.drawable.gadiesh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp9.seekTo(0);
                    mp9.pause();
                }
            }, 1000);

            if(!mp9a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp9a.isPlaying())
                        {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
            }

        }


        if(check) {
            ib5.setBackgroundResource(R.drawable.voupress);
            mp5.start();
            mp5.setLooping(true);
            final Handler mpal1 = new Handler();
            mpal1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp5a.start();
                    mp5a.setLooping(true);
                }
            }, 5000);
        }

    } //TODO okay

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public void zwyf(View view) {
        boolean check=true;
        k=0;

        if (pushe==false) {
            return;
        }

        pushe=false;
        final Handler pushen = new Handler();
        pushen.postDelayed(new Runnable() {
            @Override
            public void run() {
                pushe=true;
            }
        },1500);


        if (mp6.isPlaying()) {
            check=false;
            ib6.setBackgroundResource(R.drawable.zwyfesi);
            mp6.seekTo(0);
            mp6.pause();
            if(!mp6a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 500);
            }
            else
            {
                mp6a.seekTo(0);
                mp6a.pause();
            }

        }
        else if(mp2.isPlaying()){
            ib2.setBackgroundResource(R.drawable.di);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp2.seekTo(0);
                    mp2.pause();
                }
            }, 1000);

            if(!mp2a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp2a.isPlaying())
                        {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
            }
        }
        else if(mp3.isPlaying()){
            ib3.setBackgroundResource(R.drawable.ke);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp3.seekTo(0);
                    mp3.pause();
                }
            }, 1000);

            if(!mp3a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp3a.isPlaying())
                        {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp4.isPlaying()){
            ib4.setBackgroundResource(R.drawable.pa);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp4.seekTo(0);
                    mp4.pause();
                }
            }, 1000);

            if(!mp4a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp4a.isPlaying())
                        {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp5.isPlaying()){
            ib5.setBackgroundResource(R.drawable.vou);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp5.seekTo(0);
                    mp5.pause();
                }
            }, 1000);

            if(!mp5a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp5a.isPlaying())
                        {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp.isPlaying()){
            ib1.setBackgroundResource(R.drawable.ga);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp.seekTo(0);
                    mp.pause();
                }
            }, 1000);

            if(!mpa.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mpa.isPlaying())
                        {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp7.isPlaying()){
            ib7.setBackgroundResource(R.drawable.zw);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp7.seekTo(0);
                    mp7.pause();
                }
            }, 1000);

            if(!mp7a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp7a.isPlaying())
                        {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp8.isPlaying()){
            ib8.setBackgroundResource(R.drawable.nh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp8.seekTo(0);
                    mp8.pause();
                }
            }, 1000);

            if(!mp8a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp8a.isPlaying())
                        {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp9.isPlaying()){
            ib9.setBackgroundResource(R.drawable.gadiesh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp9.seekTo(0);
                    mp9.pause();
                }
            }, 1000);

            if(!mp9a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp9a.isPlaying())
                        {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
            }

        }


        if(check) {
            ib6.setBackgroundResource(R.drawable.zwyfesipress);
            mp6.start();
            mp6.setLooping(true);
            final Handler mpal1 = new Handler();
            mpal1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp6a.start();
                    mp6a.setLooping(true);
                }
            }, 5000);
        }

    } //TODO okay

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public void zw(View view) {
        boolean check=true;
        k=0;

        if (pushe==false) {
            return;
        }

        pushe=false;
        final Handler pushen = new Handler();
        pushen.postDelayed(new Runnable() {
            @Override
            public void run() {
                pushe=true;
            }
        },1500);


        if (mp7.isPlaying()) {
            check=false;
            ib7.setBackgroundResource(R.drawable.zw);
            mp7.seekTo(0);
            mp7.pause();
            if(!mp7a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 500);
            }
            else
            {
                mp7a.seekTo(0);
                mp7a.pause();
            }

        }
        else if(mp2.isPlaying()){
            ib2.setBackgroundResource(R.drawable.di);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp2.seekTo(0);
                    mp2.pause();
                }
            }, 1000);

            if(!mp2a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp2a.isPlaying())
                        {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
            }
        }
        else if(mp3.isPlaying()){
            ib3.setBackgroundResource(R.drawable.ke);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp3.seekTo(0);
                    mp3.pause();
                }
            }, 1000);

            if(!mp3a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp3a.isPlaying())
                        {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp4.isPlaying()){
            ib4.setBackgroundResource(R.drawable.pa);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp4.seekTo(0);
                    mp4.pause();
                }
            }, 1000);

            if(!mp4a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp4a.isPlaying())
                        {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp5.isPlaying()){
            ib5.setBackgroundResource(R.drawable.vou);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp5.seekTo(0);
                    mp5.pause();
                }
            }, 1000);

            if(!mp5a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp5a.isPlaying())
                        {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp6.isPlaying()){
            ib6.setBackgroundResource(R.drawable.zwyfesi);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp6.seekTo(0);
                    mp6.pause();
                }
            }, 1000);

            if(!mp6a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp6a.isPlaying())
                        {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp.isPlaying()){
            ib1.setBackgroundResource(R.drawable.ga);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp.seekTo(0);
                    mp.pause();
                }
            }, 1000);

            if(!mpa.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mpa.isPlaying())
                        {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp8.isPlaying()){
            ib8.setBackgroundResource(R.drawable.nh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp8.seekTo(0);
                    mp8.pause();
                }
            }, 1000);

            if(!mp8a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp8a.isPlaying())
                        {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp9.isPlaying()){
            ib9.setBackgroundResource(R.drawable.gadiesh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp9.seekTo(0);
                    mp9.pause();
                }
            }, 1000);

            if(!mp9a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp9a.isPlaying())
                        {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
            }

        }


        if(check) {
            ib7.setBackgroundResource(R.drawable.zwpress);
            mp7.start();
            mp7.setLooping(true);
            final Handler mpal1 = new Handler();
            mpal1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp7a.start();
                    mp7a.setLooping(true);
                }
            }, 5000);
        }

    } //TODO okay

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public void nh(View view) {
        boolean check=true;
        k=0;

        if (pushe==false) {
            return;
        }

        pushe=false;
        final Handler pushen = new Handler();
        pushen.postDelayed(new Runnable() {
            @Override
            public void run() {
                pushe=true;
            }
        },1500);


        if (mp8.isPlaying()) {
            check=false;
            ib8.setBackgroundResource(R.drawable.nh);
            mp8.seekTo(0);
            mp8.pause();
            if(!mp8a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 500);
            }
            else
            {
                mp8a.seekTo(0);
                mp8a.pause();
            }

        }
        else if(mp2.isPlaying()){
            ib2.setBackgroundResource(R.drawable.di);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp2.seekTo(0);
                    mp2.pause();
                }
            }, 1000);

            if(!mp2a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp2a.isPlaying())
                        {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
            }
        }
        else if(mp3.isPlaying()){
            ib3.setBackgroundResource(R.drawable.ke);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp3.seekTo(0);
                    mp3.pause();
                }
            }, 1000);

            if(!mp3a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp3a.isPlaying())
                        {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp4.isPlaying()){
            ib4.setBackgroundResource(R.drawable.pa);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp4.seekTo(0);
                    mp4.pause();
                }
            }, 1000);

            if(!mp4a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp4a.isPlaying())
                        {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp5.isPlaying()){
            ib5.setBackgroundResource(R.drawable.vou);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp5.seekTo(0);
                    mp5.pause();
                }
            }, 1000);

            if(!mp5a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp5a.isPlaying())
                        {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp6.isPlaying()){
            ib6.setBackgroundResource(R.drawable.zwyfesi);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp6.seekTo(0);
                    mp6.pause();
                }
            }, 1000);

            if(!mp6a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp6a.isPlaying())
                        {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp7.isPlaying()){
            ib7.setBackgroundResource(R.drawable.zw);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp7.seekTo(0);
                    mp7.pause();
                }
            }, 1000);

            if(!mp7a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp7a.isPlaying())
                        {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp.isPlaying()){
            ib1.setBackgroundResource(R.drawable.ga);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp.seekTo(0);
                    mp.pause();
                }
            }, 1000);

            if(!mpa.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mpa.isPlaying())
                        {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp9.isPlaying()){
            ib9.setBackgroundResource(R.drawable.gadiesh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp9.seekTo(0);
                    mp9.pause();
                }
            }, 1000);

            if(!mp9a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp9a.isPlaying())
                        {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
            }

        }


        if(check) {
            ib8.setBackgroundResource(R.drawable.nhpress);
            mp8.start();
            mp8.setLooping(true);
            final Handler mpal1 = new Handler();
            mpal1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp8a.start();
                    mp8a.setLooping(true);
                }
            }, 5000);
        }

    } //TODO okay

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public void gadi(View view) {
        boolean check=true;
        k=0;

        if (pushe==false) {
            return;
        }

        pushe=false;
        final Handler pushen = new Handler();
        pushen.postDelayed(new Runnable() {
            @Override
            public void run() {
                pushe=true;
            }
        },1500);


        if (mp9.isPlaying()) {
            check=false;
            ib9.setBackgroundResource(R.drawable.gadiesh);
            mp9.seekTo(0);
            mp9.pause();
            if(!mp9a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 500);
            }
            else
            {
                mp9a.seekTo(0);
                mp9a.pause();
            }

        }
        else if(mp2.isPlaying()){
            ib2.setBackgroundResource(R.drawable.di);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp2.seekTo(0);
                    mp2.pause();
                }
            }, 1000);

            if(!mp2a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp2a.isPlaying())
                        {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
            }
        }
        else if(mp3.isPlaying()){
            ib3.setBackgroundResource(R.drawable.ke);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp3.seekTo(0);
                    mp3.pause();
                }
            }, 1000);

            if(!mp3a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp3a.isPlaying())
                        {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp4.isPlaying()){
            ib4.setBackgroundResource(R.drawable.pa);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp4.seekTo(0);
                    mp4.pause();
                }
            }, 1000);

            if(!mp4a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp4a.isPlaying())
                        {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp5.isPlaying()){
            ib5.setBackgroundResource(R.drawable.vou);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp5.seekTo(0);
                    mp5.pause();
                }
            }, 1000);

            if(!mp5a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp5a.isPlaying())
                        {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp6.isPlaying()){
            ib6.setBackgroundResource(R.drawable.zwyfesi);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp6.seekTo(0);
                    mp6.pause();
                }
            }, 1000);

            if(!mp6a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 500);
            }else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp6a.isPlaying())
                        {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp7.isPlaying()){
            ib7.setBackgroundResource(R.drawable.zw);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp7.seekTo(0);
                    mp7.pause();
                }
            }, 1000);

            if(!mp7a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp7a.isPlaying())
                        {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp8.isPlaying()){
            ib8.setBackgroundResource(R.drawable.nh);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp8.seekTo(0);
                    mp8.pause();
                }
            }, 1000);

            if(!mp8a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mp8a.isPlaying())
                        {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
            }

        }
        else if(mp.isPlaying()){
            ib1.setBackgroundResource(R.drawable.ga);
            final Handler mpklol = new Handler();
            mpklol.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp.seekTo(0);
                    mp.pause();
                }
            }, 1000);

            if(!mpa.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 500);
            }
            else{
                final Handler mpklola = new Handler();
                mpklola.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mpa.isPlaying())
                        {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
            }

        }


        if(check) {
            ib9.setBackgroundResource(R.drawable.gadieshpress);
            mp9.start();
            mp9.setLooping(true);
            final Handler mpal1 = new Handler();
            mpal1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp9a.start();
                    mp9a.setLooping(true);
                }
            }, 5000);
        }

    } //TODO okay

    /////////////////////////////////////////////////////////////////////////////////////////////////

    private void initControls()
    {

        try
        {
            volumeSeekbar = (SeekBar)findViewById(R.id.seekBar);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            volumeSeekbar.setMax(audioManager
                    .getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            volumeSeekbar.setProgress(audioManager
                    .getStreamVolume(AudioManager.STREAM_MUSIC));


            volumeSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
            {
                @Override
                public void onStopTrackingTouch(SeekBar arg0)
                {
                }

                @Override
                public void onStartTrackingTouch(SeekBar arg0)
                {
                }

                @Override
                public void onProgressChanged(SeekBar arg0, int progress, boolean arg2)
                {
                    k=0;
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,
                            progress, 0);
                    volume.setText("Volume : "+progress);
                }
            });
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Override
    protected void onPause() {
        k=0;

        if (mp.isPlaying()) {
            ib1.setBackgroundResource(R.drawable.ga);

            mp.seekTo(0);
            mp.pause();


            if(!mpa.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mpa.isPlaying()) {
                            mpa.seekTo(0);
                            mpa.pause();
                        }
                    }
                }, 500);
            }
            else
            {
                mpa.seekTo(0);
                mpa.pause();

            }

        }
        else if(mp2.isPlaying()){
            ib2.setBackgroundResource(R.drawable.di);

            mp2.seekTo(0);
            mp2.pause();

            if(!mp2a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp2a.isPlaying()) {
                            mp2a.seekTo(0);
                            mp2a.pause();
                        }
                    }
                }, 500);
            }
            else{

                mp2a.seekTo(0);
                mp2a.pause();

            }
        }
        else if(mp3.isPlaying()){
            ib3.setBackgroundResource(R.drawable.ke);

            mp3.seekTo(0);
            mp3.pause();

            if(!mp3a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp3a.isPlaying()) {
                            mp3a.seekTo(0);
                            mp3a.pause();
                        }
                    }
                }, 500);
            }
            else{

                mp3a.seekTo(0);
                mp3a.pause();

            }

        }
        else if(mp4.isPlaying()){
            ib4.setBackgroundResource(R.drawable.pa);
            mp4.seekTo(0);
            mp4.pause();

            if(!mp4a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp4a.isPlaying()) {
                            mp4a.seekTo(0);
                            mp4a.pause();
                        }
                    }
                }, 500);
            }else{

                mp4a.seekTo(0);
                mp4a.pause();

            }

        }
        else if(mp5.isPlaying()){
            ib5.setBackgroundResource(R.drawable.vou);
            mp5.seekTo(0);
            mp5.pause();


            if(!mp5a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp5a.isPlaying()) {
                            mp5a.seekTo(0);
                            mp5a.pause();
                        }
                    }
                }, 500);
            }else{

                mp5a.seekTo(0);
                mp5a.pause();

            }

        }
        else if(mp6.isPlaying()){
            ib6.setBackgroundResource(R.drawable.zwyfesi);
            mp6.seekTo(0);
            mp6.pause();


            if(!mp6a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp6a.isPlaying()) {
                            mp6a.seekTo(0);
                            mp6a.pause();
                        }
                    }
                }, 500);
            }else{

                mp6a.seekTo(0);
                mp6a.pause();

            }

        }
        else if(mp7.isPlaying()){
            ib7.setBackgroundResource(R.drawable.zw);
            mp7.seekTo(0);
            mp7.pause();


            if(!mp7a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp7a.isPlaying()) {
                            mp7a.seekTo(0);
                            mp7a.pause();
                        }
                    }
                }, 500);
            }
            else{

                mp7a.seekTo(0);
                mp7a.pause();

            }

        }
        else if(mp8.isPlaying()){
            ib8.setBackgroundResource(R.drawable.nh);
            mp8.seekTo(0);
            mp8.pause();


            if(!mp8a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp8a.isPlaying()) {
                            mp8a.seekTo(0);
                            mp8a.pause();
                        }
                    }
                }, 500);
            }
            else{

                mp8a.seekTo(0);
                mp8a.pause();

            }

        }
        else if(mp9.isPlaying()){
            ib9.setBackgroundResource(R.drawable.gadiesh);
            mp9.seekTo(0);
            mp9.pause();


            if(!mp9a.isPlaying()) {
                final Handler mp0lol = new Handler();
                mp0lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 5000);
                final Handler mp1lol = new Handler();
                mp1lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4500);
                final Handler mp2lol = new Handler();
                mp2lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 4000);
                final Handler mp3lol = new Handler();
                mp3lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3500);
                final Handler mp4lol = new Handler();
                mp4lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 3000);
                final Handler mp5lol = new Handler();
                mp5lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2500);
                final Handler mp6lol = new Handler();
                mp6lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 2000);
                final Handler mp7lol = new Handler();
                mp7lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1500);
                final Handler mp8lol = new Handler();
                mp8lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 1000);
                final Handler mp9lol = new Handler();
                mp9lol.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mp9a.isPlaying()) {
                            mp9a.seekTo(0);
                            mp9a.pause();
                        }
                    }
                }, 500);
            }
            else{

                mp9a.seekTo(0);
                mp9a.pause();

            }

        }

        super.onPause();

    } //TODO okay

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        k=k+1;
        if(k==2){
            finish();}

        else{
            Toast.makeText(MainActivity.this, "Press one more time to Exit", Toast.LENGTH_SHORT).show();
        }
    }

}
