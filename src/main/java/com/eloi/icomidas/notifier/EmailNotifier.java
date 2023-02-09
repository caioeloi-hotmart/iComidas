package com.eloi.icomidas.notifier;

import com.eloi.icomidas.model.Client;
import org.springframework.stereotype.Component;

@Component
public class EmailNotifier implements Notifier {
    @Override
    public void notify(Client client, String message){
        System.out.printf("Notifying %s through e-mail %s: %s\n",
                client.getName(), client.getEmail(), message);
    }
}
