package com.example.ujb;


import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView =findViewById(R.id.image_view);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.welcome_alpha);
        imageView.setAnimation(animation);
    }

    public class  CheckVersionInfoTask extends AsyncTask<Void,Void, String>{
        private Context context;
        private ProgressBar progressBar;


        private CheckVersionInfoTask(Context context){
            this.context =context;
            progressBar = new ProgressBar(this.context);


        }

        @Override
        protected String doInBackground(Void... voids) {
            return null;
        }
    }
}
