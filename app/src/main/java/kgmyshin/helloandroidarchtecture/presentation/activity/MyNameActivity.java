package kgmyshin.helloandroidarchtecture.presentation.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import kgmyshin.helloandroidarchtecture.HelloArchApp;
import kgmyshin.helloandroidarchtecture.R;
import kgmyshin.helloandroidarchtecture.presentation.presenter.MyNamePresenter;

public class MyNameActivity extends AppCompatActivity {

    private TextView nameView;

    @Inject
    MyNamePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameView = (TextView) findViewById(R.id.name);

        ((HelloArchApp) getApplication()).getAppComponent().inject(this);
        presenter.setActivity(this);
        presenter.onCreate();
    }

    public void setNameView(String name) {
        nameView.setText(name);
    }

}
