package aaa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.xmlrpc.base.Array;

import aaa.Strona;
import aaa.ClientDb;

/**
 * Servlet implementation class Html
 */
public class HtmlCreator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HtmlCreator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// String url=(String) request.getParameter("strona");
		// if(url.equals("dodajSamochody")){
		//
		// }
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String strona = request.getParameter("strona");
		strona = Strona.prasujStrone(strona,
				"glowna;client;wyslanoSms;dodajSamochody;historia;uWizyta;wolneTerminy;serwisant;bramka;sRejestracja;sLogin;rejestracja;napraw;dodprac;tSerwis;cVIN;addwizy");

		if (strona.equals("blad")) {

			response.sendError(HttpServletResponse.SC_NOT_FOUND, "Nie znaleziono elemetu");
		} else if (strona.equals("dodajSamochody")) {
			// out.println(url);
			out.println(Strona.getClientHtml(Strona.dodajSamochody()));
		} else if (strona.equals("client")) {
			out.println(Strona.getClientHtml(Strona.client()));
		} else if (strona.equals("wyslanoSms")) {
			out.println(Strona.getClientHtml(Strona.wyslanoSms()));
		} else if (strona.equals("sRejestracja")) {
			out.println(Strona.getClientHtml(Strona.sRejestracja()));
		} else if (strona.equals("sLogin")) {
			out.println(Strona.getClientHtml(Strona.sLogin()));
		} else if (strona.equals("rejestracja")) {
			out.println(Strona.getClientHtml(Strona.rejestracja()));
		} else if (strona.equals("napraw")) {
			out.println(Strona.getClientHtml(Strona.napraw()));
		} else if (strona.equals("dodprac")) {
			out.println(Strona.getClientHtml(Strona.dodprac()));
		} else if (strona.equals("cVIN")) {
			out.println(Strona.getClientHtml(Strona.cVIN()));
		} else if (strona.equals("addwizy")) {
			out.println(Strona.getClientHtml(Strona.addwizy()));
		} else if (strona.equals("tSerwis")) {
			out.println(Strona.getClientHtml(Strona.tSerwis()));
		} else if (strona.equals("serwisant")) {
			out.println(Strona.getClientHtml(Strona.serwisant()));
		} else if (strona.equals("bramka2")) {
			String tekstsms = request.getParameter("bramka");
			out.println(tekstsms);
			ClientDb db = new ClientDb();
			db.init();
			String numery = "";

			try {
				numery = db.getNumerTelefonu();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (numery.length() > 0) {
				String[] numer = numery.split(";");
				for (String e : numer) {
					new SmsSender(tekstsms, e);
				}
			}
			response.sendRedirect("ASO?strona=serwisant");

		} else if (strona.equals("historia")) {

			out.println(Strona.getClientHtml(Strona.historia()));
		} else if (strona.equals("bramka")) {
			// out.println(Strona.getClientHtml(Strona.bramka()));
			// Wysy³anie sms
			out.println(Strona.getClientHtml(Strona.bramka()));
			// String tekstsms = request.getParameter("bramka");
			// out.println(tekstsms);
			// ClientDb db = new ClientDb();
			// db.init();
			// String numery = "";
			//
			// try {
			// numery = db.getNumerTelefonu();
			// } catch (SQLException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			//
			// if (numery.length() > 0) {
			// String[] numer = numery.split(";");
			// for (String e : numer) {
			// //new SmsSender(tekstsms,e);
			// }
			// }
			//
		} else if (strona.equals("uWizyta")) {

			// //Wysy³anie sms
			// ClientDb db = new ClientDb();
			// db.init();
			// String numery = "";
			//
			// try {
			// numery = db.getNumerTelefonu();
			// } catch (SQLException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			//
			// if (numery.length() > 0) {
			// String[] numer = numery.split(";");
			// for (String e : numer) {
			// new SmsSender("Promocja",e);
			// }
			// }

			// for(int i=0;i<numer.size();i++){
			// new SmsSender("test2,",numer.get(i));
			// }

			// koniec
			out.println(Strona.getClientHtml(Strona.uWizyta()));
		} else if (strona.equals("wolneTerminy")) {

			ClientDb db = new ClientDb();
			db.init();
			String dni[] = db.getWolneTerminy().split(";");

			out.println(Strona.getClientHtml(Strona.wolneTerminy(dni[0], dni[0])));
			// "<link href=\"../assets/styles.min.css\" rel=\"stylesheet\"> "
			// + "<link
			// href=\"//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css\"
			// rel=\"stylesheet\"> "
			// + "<script
			// src=\"//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>"
			// + "<script
			// src=\"//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js\"></script>"
			// + " <style>\n .dp-highlight .ui-state-default {\n background:
			// #FF0000;\n color: #FFF;\n}\n</style>"));
		} else if (strona.equals("glowna")) {

			out.println(Strona.getClientHtml(Strona.glowna()));
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
