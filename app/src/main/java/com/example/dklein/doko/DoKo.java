package com.example.dklein.doko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class DoKo extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_ko);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        createButtonListeners();


    }

    /*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        //super.onCreateView("Players", getApplicationContext(), ); // richtig? was für ein string? was sind das dritte: attribute?
        //super.onCreateView(inflater, container, savedInstanceState); // wie superkonstruktor aufrufen? wird methode nicht aufgerufen?..->deshalb keine clicklistener..
        // für jede einzelne View, weil unterschiedliche zurückgeben?
        createButtonListeners(inflater, container);
        View Players = inflater.inflate(R.layout.Players, container, false);
        return Players;
    }
    */

    private void createButtonListeners(/*LayoutInflater inflater, ViewGroup container*/){
        Button button = (Button) findViewById(R.id.four_players);

        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //geht hier nicht rein?
                Toast.makeText(getApplicationContext(), "4 geklickt", Toast.LENGTH_SHORT).show();
                //Log.i("", "4 geklickt");
                //setContentView(R.layout.Players);
                //nächste Activity starten:
                Intent myIntent = new Intent(DoKo.this, Players.class);
                //myIntent.putExtra();
                DoKo.this.startActivity(myIntent);
            }
        });

        /*

        View Players = inflater.inflate(R.layout.Players, container, false);
        Button button2 = (Button) Players.findViewById(R.id.players_ok);
        if (button2 == null) {
            Toast.makeText(getApplicationContext(), "null!!", Toast.LENGTH_SHORT);
        }

        assert button2 != null;
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setContentView(R.layout.overview);
            }
        });

        View overview = inflater.inflate(R.layout.overview, container, false);
        Button button3 = (Button) overview.findViewById(R.id.deike);

        assert button3 != null;
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //was passiert hier?
            }
        });

        Button button4 = (Button) overview.findViewById(R.id.sarah);

        assert button4 != null;
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //was passiert hier?
            }
        });

        Button button5 = (Button) overview.findViewById(R.id.writePoints);

        assert button5 != null;
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setContentView(R.layout.reservation);
            }
        });

        View reservation = inflater.inflate(R.layout.reservation, container, false);
        Button button6 = (Button) reservation.findViewById(R.id.yes_reservation);

        assert button6 != null;
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setContentView(R.layout.reservation_choice);
            }
        });
        */


    }

    /*
    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }
    */


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.do_ko, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
