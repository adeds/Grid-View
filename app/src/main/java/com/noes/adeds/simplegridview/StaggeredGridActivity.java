package com.noes.adeds.simplegridview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.etsy.android.grid.StaggeredGridView;

public class StaggeredGridActivity extends AppCompatActivity {

    private StaggeredGridView staggeredGridView;
    private String[] items = new String[]{
            "https://3.bp.blogspot.com/-_nqdAdv8dj8/WCxJiM7k2RI/AAAAAAAAJ1o/1MRwFAMeqnkaQVivxoPJMfSz5gYFkuWSACLcB/s800/ilan.jpg",
            "https://4.bp.blogspot.com/-CtXyyfCJNq8/WLq9POWI8XI/AAAAAAAATNw/J3wf5X0ZDHs5lNiYdkWEqXY5vMPeeZ9vACLcB/s1600/02.jpg",
            "https://1.bp.blogspot.com/-ZhnQVwF2_A4/WLq9PJfaQCI/AAAAAAAATNs/Kw87KctlgBMtuHG5uE5ClqLX4qSeUajlQCLcB/s1600/03.jpg",
            "https://1.bp.blogspot.com/-jXzaKrBcdZI/WLq9QSzu8oI/AAAAAAAATN0/O8dVD1z6nIkRwvVAkNVSMG0hiT5fXIKYwCLcB/s1600/04.jpg",
            "https://3.bp.blogspot.com/-gUC2vU-rMRk/WLq9Q_ysNLI/AAAAAAAATN8/KIujdeigntEfd-I3RJNcqy7SqX14m5trACLcB/s1600/05.jpg",
            "https://3.bp.blogspot.com/-t-HEPxr1TV4/WLq9Q7vLcMI/AAAAAAAATOA/xybjjez0fL0n2bqloUN3sJBMv9wZfsN4ACLcB/s1600/07.jpg",
            "https://3.bp.blogspot.com/-Nx1vlUPKmbM/WLq9RwRj6fI/AAAAAAAATOI/1pMN9io0AbsmSwSS9Ng6Gh6m-uY5WTirQCLcB/s1600/09.jpg",
            "https://3.bp.blogspot.com/-8QPU1E9kE_4/WLq9R7IOhsI/AAAAAAAATOM/Cvzfkw4QW4g2QgeLXc3oOZ2nTAgYdX-7QCLcB/s1600/10.jpg",
            "https://3.bp.blogspot.com/-GR4VVZAOZFY/WLq9SCZu68I/AAAAAAAATOQ/mEjyJW-TW3MU3CcxQSImpB_w_LAfWZGlwCLcB/s1600/11.jpg",
            "https://3.bp.blogspot.com/-c7VjzRPisrE/WLq9SoaUDlI/AAAAAAAATOU/ugHq6DPQ0Eod5WU7VxBSet9rjEXj6z3JQCLcB/s1600/12.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered_grid);

        getSupportActionBar().setTitle("HOT : Fairy Tail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        staggeredGridView = (StaggeredGridView)findViewById(R.id.gv_staggered);
        ItemGridAdapter itemGridAdapter = new ItemGridAdapter(StaggeredGridActivity.this, items);
        staggeredGridView.setAdapter(itemGridAdapter);
        staggeredGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DetailImageActivity.toDetailImageActivity(StaggeredGridActivity.this, items[position]);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static void toStaggeredGridActivity(Context context){
        context.startActivity(new Intent(context, StaggeredGridActivity.class));
    }
}
