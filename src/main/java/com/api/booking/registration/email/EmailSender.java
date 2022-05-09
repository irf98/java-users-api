package com.api.booking.registration.email;

public interface EmailSender {

    void send(String to, String email);
}
