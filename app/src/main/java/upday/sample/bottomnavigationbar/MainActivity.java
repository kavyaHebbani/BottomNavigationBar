package upday.sample.bottomnavigationbar;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mMusicTextView;

    private TextView mSportsTextView;

    private TextView mEntertainmentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMusicTextView = (TextView) findViewById(R.id.text_music);
        mSportsTextView = (TextView) findViewById(R.id.text_sports);
        mEntertainmentTextView = (TextView) findViewById(R.id.text_entertainment);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_music:
                                showMusic();
                                break;
                            case R.id.action_sports:
                                showSports();
                                break;
                            case R.id.action_entertainment:
                                showEntertainment();
                                break;
                        }
                        return false;
                    }
                });
    }

    private void showMusic() {
        mMusicTextView.setVisibility(View.VISIBLE);
        mSportsTextView.setVisibility(View.GONE);
        mEntertainmentTextView.setVisibility(View.GONE);
    }

    private void showSports() {
        mMusicTextView.setVisibility(View.GONE);
        mSportsTextView.setVisibility(View.VISIBLE);
        mEntertainmentTextView.setVisibility(View.GONE);
    }

    private void showEntertainment() {
        mMusicTextView.setVisibility(View.GONE);
        mSportsTextView.setVisibility(View.GONE);
        mEntertainmentTextView.setVisibility(View.VISIBLE);
    }
}
