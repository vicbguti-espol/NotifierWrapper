/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import notifiers.Email;
import notifiers.SMS;
import notifiers.decorators.SignalDecorator;
import notifiers.decorators.TelegramDecorator;
import notifiers.decorators.WhatsAppDecorator;
import notifiers.decorators.WireDecorator;

/**
 *
 * @author vicbguti
 */
public class Client {
    private void sentPaymentNotification(){
        new Email().sendNotification();
        new TelegramDecorator(
                new WireDecorator(
                        new SignalDecorator(
                                new WhatsAppDecorator(
                                        (new SMS()))))).sendNotification();
    }
}
