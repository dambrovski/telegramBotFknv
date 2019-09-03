package br.com.fkn.telegramBotFknv;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Autor: Airton Silva Data: 29/08/2019
 *
 */

public final class TelegramBot {

	private static String endpoint = "https://api.telegram.org/";
	private static String token;
	private static String Url = "http://fknvendas.fknmobile.com.br:8991/ws-fkn-vendas/index.jsf";
	private static String message = "Serviço do FKNVENDAS está com possíveis problemas, favor verificar!";
	private static int idUsuario = 113116753;
	private static int idUsuario2 = 853479393;
	private static int idUsuario3 = 677256128;
	private static int codigo = 0;
	private Boolean laco = true;

	public TelegramBot(String token) {
		this.token = token;
	}

	public static HttpResponse sendMessage(Integer chatId, String text) throws UnirestException {
		return Unirest.post(endpoint + "bot" + token + "/sendMessage").field("chat_id", chatId).field("text", text)
				.asJson();
	}

	public void enviar() throws UnirestException, InterruptedException, IOException {

		while (laco) {
			new Thread();
			Thread.sleep(300000);

			try {
				codigo = verificarServico.getResponseCODE();
				if (codigo != 200) {
					laco = true;
				}
			} catch (Exception e) {

				sendMessage(idUsuario, message);
				sendMessage(idUsuario2, message);
				sendMessage(idUsuario3, message);
			}
		}
	}

	public static class verificarServico {

		public static int getResponseCODE() throws IOException {
			URL u = new URL(Url);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			huc.setRequestMethod("GET");
			huc.connect();
			codigo = huc.getResponseCode();

			return codigo;

		}
	}
}