package org.dev.company.workspace.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import org.dev.company.workspace.shared.GreetingService;

public class HomePage implements EntryPoint {


//    private TextBox txtScreenName = new TextBox();
//    private Button btnGetTweets = new Button("Get Tweets");
//    private VerticalPanel tweetPanel = new VerticalPanel();
    public void onModuleLoad() {
    //    RootPanel.get().add(GWT.<AppHomePage>create(AppHomePage.class));
//       RootPanel.get().add(GWT.<AppHomePage>create(AppHomePage.class));




//
        final FormPanel form = new FormPanel();

      //  form.setEncoding(FormPanel.ENCODING_MULTIPART);
      //  form.setMethod(FormPanel.METHOD_POST);

        HorizontalPanel panel = new HorizontalPanel();
        form.setWidget(panel);

        // Create a TextBox, giving it a name so that it will be submitted.
        final TextBox tbLastName = new TextBox();
        final TextBox tbFirstName = new TextBox();
        tbLastName.setName("last name");
        tbFirstName.setName("first name");
        panel.add(tbFirstName);
        panel.add(tbLastName);


        panel.add(new Button("entry last name and first name", new ClickHandler() {
            public void onClick(ClickEvent event) {
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

                //   form.submit();
            }
        }));

        RootPanel.get().add(form);





//        RootPanel.get().add(txtScreenName);
//        RootPanel.get().add(btnGetTweets);
//        RootPanel.get().add(tweetPanel);


        /////////////////////////////////////////////////

    }
    }