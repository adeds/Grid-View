package com.noes.adeds.simplegridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private String[] images = new String[]{
            "https://3.bp.blogspot.com/-XlsQroL_mpo/WLqh0n9iUlI/AAAAAAAAoT0/ECV8qNiIMlc5Txt-mAjaBcvBxhjjT5jCgCLcB/s1600/001Creadit.jpg",
            "http://1.bp.blogspot.com/-eZUYn-HTE78/UqA_gLWZYoI/AAAAAAAAWdA/-R7RsIZShN0/s1600/Law+Of+Ueki.jpg",
            "http://3.bp.blogspot.com/-OXWlem-BW8U/UwB_0_R1TsI/AAAAAAAAGIs/n0y94Z7bApY/s1600/00.jpg",
            "https://2.bp.blogspot.com/-hfOg7OENYoc/WKDPDsTamqI/AAAAAAAASHU/cUzO3P3RSE0yXa0aFc9rNWd9d8kY8xVlgCLcB/s1600/01.jpg",
            "https://2.bp.blogspot.com/-Nf81FRV0tjU/WF-gR4wxsjI/AAAAAAAAPPc/QSAsr3z9YGUw32Jds65clkLjEWB-sSrWQCLcB/s1600/img000001.jpg",
            "http://2.bp.blogspot.com/-vgcEosaKWGM/VA6Y3M_wsSI/AAAAAAAAFH8/08PzBDZ4D94/s1600/1.jpg",
            "https://lh5.googleusercontent.com/-NkcpcVAa5aI/T2BFWUH_d6I/AAAAAAAAIJU/ca4nDsZkZyc/s1200/01.jpg",
            "http://www.mangacanblog.com/mangas/nanatsu%20no%20taizai/001%20-%20chapter%201/03.jpg",
            "http://www.mangacanblog.com/mangas/mother%20keeper/001/01.jpg",
            "http://www.mangacanblog.com/mangas/masamune%20kun%20no%20revenge/001/03.jpg"
    };
    private GridView gvItem;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Daftar Manga");
        gvItem = (GridView)findViewById(R.id.gv_item);
        ItemGridAdapter itemGridAdapter = new ItemGridAdapter(MainActivity.this, images);
        gvItem.setAdapter(itemGridAdapter);
        gvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView parent, View view,
                                    int position, long id) {
                DetailImageActivity.toDetailImageActivity(MainActivity.this,

                        images[position]);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_staggered) {
            StaggeredGridActivity.toStaggeredGridActivity(MainActivity.this);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}