package com.example.bjj10.practice;

import android.app.Activity;

import javax.inject.Singleton;
import javax.sql.DataSource;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainComponent.class)
abstract class AppModule {

    @Singleton
    @Binds
    abstract DataSource bindDataSource(DataSource dataSource);

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivity(MainComponent.Builder builder);
}
