package kgmyshin.helloandroidarchtecture.presentation.presenter;

import javax.inject.Inject;

import kgmyshin.helloandroidarchtecture.domain.usecase.GetMyNameUseCase;
import kgmyshin.helloandroidarchtecture.presentation.activity.MyNameActivity;

/**
 * Created by kgmyshin on 15/06/14.
 */
public class MyNamePresenter {

    private GetMyNameUseCase useCase;
    private MyNameActivity activity;

    @Inject
    public MyNamePresenter(GetMyNameUseCase useCase) {
        this.useCase = useCase;
    }

    public void setActivity(MyNameActivity activity) {
        this.activity = activity;
    }

    public void onCreate() {
        activity.setNameView(useCase.getMyName());
    }

}
