package br.com.fkn.telegramBotFknv;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Autor: Airton Silva Data: 29/08/2019
 *
 */
public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		TelegramBot tb = new TelegramBot("980418922:AAEmxIg5ArIqzFM2cLFEQb8lab9oPueByqI");
		try {

			tb.enviar();
		} catch (UnirestException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}