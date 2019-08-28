package br.com.fkn.telegramBotFknv;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(String[] args) {
        TelegramBot tb = new TelegramBot("cole aqui a chave gerada pelo BotFather");
        try {
            tb.run();
        } catch (UnirestException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}