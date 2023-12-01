/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifiers.decorators;

import notifiers.Notifier;

/**
 *
 * @author vicbguti
 */
public class SignalDecorator extends BaseDecorator {

    public SignalDecorator(Notifier wrapeeNotifier) {
        super(wrapeeNotifier);
    }
    @Override
    public void sendNotification(){
       sendSignalNotification(); 
       super.sendNotification();
    }

    private void sendSignalNotification() {
        // Send WhatsApp Notification
    }
}
