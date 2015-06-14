package kgmyshin.helloandroidarchtecture.presentation;

import kgmyshin.helloandroidarchtecture.presentation.activity.MyNameActivity;

/**
 * Created by kgmyshin on 15/06/14.
 */
public interface PresentationComponent {
    void inject(MyNameActivity activity);
}
