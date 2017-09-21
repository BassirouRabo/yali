package yali.hkonnect.net.yalilearns;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class LessonActivity extends AppCompatActivity {
    private String title = null;
    private Integer length = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        title = getIntent().getStringExtra("title");
        length = getIntent().getIntExtra("length", 0);
        if (title == null || length == 0) finish();

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        ViewPager mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        String[] tabs = new String[]{
                getResources().getString(R.string.tab_lesson_1),
                getResources().getString(R.string.tab_lesson_2),
                getResources().getString(R.string.tab_lesson_3),
                getResources().getString(R.string.tab_lesson_4),
                getResources().getString(R.string.tab_lesson_5)
        };

        for (int i = 0; i < length; i++)
            tabLayout.addTab(tabLayout.newTab().setText(tabs[i]));
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new LessonFragment().newInstance(position + 1, title);
        }

        @Override
        public int getCount() {
            return length;
        }
    }
}
