package org.dev.company.workspace.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.junit.client.impl.JUnitHost;
import com.google.gwt.uibinder.client.*;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.util.PreventSpuriousRebuilds;
import org.dev.company.workspace.shared.GreetingService;

public class AppHomePage extends Composite {

//
@UiField
    Button testBtn;

  //  @UiHandler("gwtContainer")
    @UiHandler("testBtn")
    void onLabelClick(ClickEvent event) {
        GreetingService.App.getInstance().greet(new AsyncCallback<String>() {
            @Override
            public void onFailure(Throwable throwable) {
                Window.alert("fail " + throwable.getMessage() );
            }

            @Override
            public void onSuccess(String s) {
                Window.alert(s);
            }
        });
    }
//////////////////////
   // @UiHandler("gwtContainer")
   ////////////////////////////////
    public AppHomePage() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }


    interface AppHomePageUiBinder extends UiBinder<HTMLPanel, AppHomePage> {
    }

    private static AppHomePageUiBinder ourUiBinder = GWT.create(AppHomePageUiBinder.class);
}