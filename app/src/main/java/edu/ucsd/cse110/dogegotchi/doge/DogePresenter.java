package edu.ucsd.cse110.dogegotchi.doge;

import android.view.View;

public class DogePresenter implements IDogeObserver {
    Doge doge;
    View foodMenu;

    public DogePresenter(Doge doge, View foodMenu) {
        this.doge = doge;
        this.foodMenu = foodMenu;
    }

    @Override
    public void onStateChange(Doge.State newState) {
        if (newState == Doge.State.SAD) { foodMenu.setVisibility(View.VISIBLE); }
    }

    public void onFoodSelected() {
        if (doge.state != Doge.State.SLEEPING) { doge.setState(Doge.State.EATING); }
        foodMenu.setVisibility(View.INVISIBLE);
    }
}
