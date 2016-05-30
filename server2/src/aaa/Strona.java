package aaa;

public class Strona {

	public static String prasujStrone(String wejscie, String poprawneStrony) {

		String wyjscie = "blad";
		if (wejscie == null)
			wejscie = "glowna";

		if (poprawneStrony.length() > 0) {

			String[] strony = poprawneStrony.split(";");
			for (String strona : strony) {
				if (wejscie.equals(strona))
					wyjscie = wejscie;
			}
		}

		return wyjscie;
	}

	public static String getClientHtml(String tresc) {
		StringBuffer out = new StringBuffer();
		// sms
		// new SmsSender("Jestem w serwisie","505866720");
		// SmsSender a= new SmsSender();

		// sms.eventHappened(event);
		out.append("<!DOCTYPE HTML>\n");
		out.append("<html lang=\"pl\">\n");
		out.append("<head>\n");
		out.append("<meta charset=\"utf-8\" />\n");
		out.append("<title>Serwis ASO - M4U</title>\n");
		out.append("<meta name=\"description\" content=\"Serwis wspomagaj¹cy pracê serwisu\" />\n");
		out.append("<meta name=\"keywords\" content=\"najlepszy serwis aso, zobacz\" />\n");
		out.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
		out.append(
				"<link  type=\"text/css\"rel=\"stylesheet\" media=\"screen and (min-device-width: 481px)\" href=\"css/style.css\" />\n");
		out.append(
				"<link type=\"text/css\" rel=\"stylesheet\" media=\"only screen and (max-device-width: 480px)\" href=\"css/style-mobile.css\" />\n");
		out.append(
				"<link rel=\"stylesheet\" media=\"screen and (-webkit-device-pixel-ratio:0.75)\" href=\"css/style-mobile.css\" />\n");
		out.append("<link rel=\"stylesheet\" href=\"css/style-mobile.css\" media=\"handheld\" type=\"text/css\" />\n");
		out.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"jq/jquery-ui-1.11.4.custom/jquery-ui.css\">");
		out.append("<link href=\"../assets/styles.min.css\" rel=\"stylesheet\"> ");
		out.append(
				"<link href=\"//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css\" rel=\"stylesheet\"> ");
		out.append("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>");
		out.append("<script src=\"//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js\"></script>");
		out.append(" <style>\n .dp-highlight .ui-state-default {\n background: #FF0000;\n color: #FFF;\n}\n</style>");

		out.append("</head>\n");

		out.append("<body background=\"tlo.jpg\" bgproperties=\"fixed\">\n");
		out.append("<font color = \"#EFEFEF\" size = 5 >\n");
		out.append("<div id=\"container\" top-margin=\"10px\">\n");
		out.append("<div id=\"logo\">\n");
		out.append("<img src=\"logo.png\">\n");
		out.append("</div>\n");
		out.append("<div id=\"con\">\n");
		out.append("<div id=\"nav\">\n");
		out.append("<center>\n");
		out.append("<br>\n");
		// mozliwosc dalszej modyfikacji
		out.append("<a href=\"strona.html\" class=\"button\">Strona g³ówna</a><br><br><br>\n");
		out.append("<a href=\"index.html\" class=\"button\">Ekran logowania</a><br><br><br>\n");
		out.append("<a href=\"javascript:history.back()\" class=\"button\">Powrót</a><br><br><br>\n");
		out.append("</center>\n");
		out.append("</div>\n");
		out.append("<div id=\"news\">\n");
		out.append("<img src=\"reklama.png\">\n");
		out.append("</div>\n");
		out.append("<div id=\"content\">\n");
		out.append(tresc);
		out.append("</div>");
		out.append("<div id=\"footer\">\n");
		out.append("@In¿ynieria Systemów Informacyjnych 2016\n");
		out.append("</div>\n");
		out.append("</div>\n");
		out.append("</font>\n");
		out.append("</body>\n");
		out.append("</html>\n");

		return out.toString();
	}

	public static String glowna() {

		StringBuffer out = new StringBuffer();

		// zmodyfikowac!

		out.append("<center>\n");
		out.append("<h2>Klient</h2>\n");

		out.append("<a class=\"button\" href=\"ASO????\">Wyswietl moje samochody</a><br>\n");

		out.append("<a class=\"button\" href=\"ASO?strona=dodajSamochody\">Dodaj Samochod</a><br>\n");
		out.append(
				"<a type=\"button\" class=\"button\" href=\"ASO?strona=wolneTerminy\">Sprawdz wolne terminy</a><br>\n");
		out.append("<a type=\"button\" class=\"button\" href=\"ASO?strona=historia\">Historia samochodu</a><br>\n");
		out.append("<a type=\"button\" class=\"button\" href=\"ASO?strona=uWizyta\">Umów sie na wizyte</a>\n");
		out.append("</center>\n");
		out.append("</div>\n");
		out.append("</div>\n");

		return out.toString();
	}

	public static String dodajSamochody() {

		StringBuffer out = new StringBuffer();

		out.append("<font color = \"#EFEFEF\">");
		out.append("<h2>WprowadŸ dane samochodu</h2>\n");
		out.append("<center>");
		out.append("numer");
		out.append("VIN<br><input type=\"text\" id=\"VIN\"><br><br>\n");
		out.append("Marka<br><input type=\"text\" id=\"Marka\"><br><br>\n");
		out.append("Model<br><input type=\"text\" id=\"model\"><br><br>\n");
		out.append("Rok Produkcji<br><input type=\"text\" id=\"rok\" value=\"2016-02-05\"><br><br>\n");
		out.append("Paliwo<br><input type=\"text\" id=\"paliwo\"><br><br>\n");
		out.append("Pojemnoœæ<br><input type=\"text\" id=\"pojemnosc\"><br><br>\n");
		out.append("Moc Silnika<br><input type=\"text\" id=\"moc\"><br><br>\n");
		out.append("Kraj pochodzenia<br><input type=\"text\" id=\"kraj\"><br><br>\n");
		out.append("Przebieg<br><input type=\"text\" id=\"przebieg\"><br><br>\n");
		out.append("<button type=\"button\"  class=\"button\" onclick=\"loadDoc()\">Dodaj</button>\n");
		out.append("</font>\n");
		out.append("</center>");
		out.append("<script>\n");
		out.append("function loadDoc() {\n");
		out.append("var VIN = document.getElementById(\"VIN\").value;\n");
		out.append("var Marka = document.getElementById(\"Marka\").value\n");
		out.append("var model = document.getElementById(\"model\").value;\n");
		out.append("var rok = document.getElementById(\"rok\").value;\n");
		out.append("var paliwo = document.getElementById(\"paliwo\").value;\n");
		out.append("var pojemnosc = document.getElementById(\"pojemnosc\").value;\n");
		out.append("var moc = document.getElementById(\"moc\").value;\n");
		out.append("var kraj = document.getElementById(\"kraj\").value;\n");
		out.append("var przebieg = document.getElementById(\"przebieg\").value;\n");

		out.append("var xhttp = new XMLHttpRequest();\n");
		out.append("xhttp.onreadystatechange = function() {\n");
		out.append("if (xhttp.status == 200) {\n");
		// out.append("document.getElementById(\"demo\").innerHTML =
		// xhttp.responseText;\n");
		out.append("}\n");
		out.append("};\n");
		out.append("xhttp.open(\"POST\", \"users/client\", true);\n");
		out.append("xhttp.setRequestHeader(\"Content-type\", \"application/json\");\n");
		out.append(
				" var data = JSON.stringify({\"id\":\"1\",\"VIN\":VIN,\"Marka\":Marka,\"model\":model,\"rok\":rok,\"paliwo\":paliwo,\"pojemnosc\":pojemnosc,\"moc\":moc,\"kraj\":kraj,\"pezebieg\":przebieg}\n");
		out.append(" ); \n");
		out.append("xhttp.send(data);\n");
		out.append("}\n");
		out.append("</script>\n");

		return out.toString();
	}

	public static String historia() {
		StringBuffer out = new StringBuffer();

		out.append("<font color = \"#EFEFEF\">\n");
		out.append("<center>\n");
		out.append("<h3>Podaj model samochodu</h3>\n");
		out.append("<input type=\"text\" id=\"haslo\">\n");
		out.append("<button type=\"button\" onclick=\"loadDoc()\">SprawdŸ</button>\n");
		out.append("<div id =\"content\"> </div>\n");
		out.append("</font>\n");
		out.append("</center>\n");
		out.append("<script>\n");
		out.append("function loadDoc() {\n");
		out.append("var xhttp = new XMLHttpRequest()\n");
		out.append("var marka = document.getElementById(\"haslo\").value;\n");
		out.append("xhttp.onreadystatechange = function() {\n");
		out.append("if (xhttp.status == 200) {\n");
		out.append("document.getElementById(\"content\").innerHTML = xhttp.responseText;\n");
		out.append("}\n");
		out.append("};\n");
		out.append("xhttp.open(\"GET\", \"users/client?id=3&marka=\" + marka, true);\n");
		out.append("xhttp.send();\n");
		out.append("}\n");
		out.append("</script>\n");

		return out.toString();
	}

	public static String serwisant() {
		StringBuffer out = new StringBuffer();
		out.append("<div id=\"logo\">\n");
		out.append("<img src=\"logo.png\">\n");
		out.append("</div>\n");
		out.append("<div id=\"con\">\n");
		out.append("<div id=\"nav\">\n");
		out.append("<center>\n");
		out.append("<br>\n");
		out.append("<a href=\"strona.html\" class=\"button\">Strona g³ówna</a><br><br><br>\n");
		out.append("<a href=\"index.html\" class=\"button\">Ekran logowania</a><br><br><br>\n");
		out.append("<a href=\"Client.html\" class=\"button\">Powrót</a><br><br><br>\n");
		out.append("</center>\n");
		out.append("</div>\n");

		out.append("<div id=\"news\">\n");
		out.append("<img src=\"reklama.png\">\n");
		out.append("</div>\n");

		out.append("<div id=\"content\">\n");
		out.append("<center>\n");
		out.append("<font color = \"#EFEFEF\">\n");
		out.append("<h1>Serwisant</h1>\n");

		out.append("<button type=\"button\" class=\"button\" onclick=\"load_home()\">Stworz nowy serwis</button><br><br>\n");
		out.append("<button type=\"button\" class=\"button\" onclick=\"load_home1()\">Dodaj nowego pracownika</button><br><br>\n");
		out.append("<button type=\"button\" class=\"button\" onclick=\"loadDoc()\">Sprawdz wszystkie naprawy</button><br><br>\n");
		out.append("<button type=\"button\" class=\"button\" onclick=\"load_home2()\">Sprawdz samochod po VIN</button><br><br>\n");
		out.append("<button type=\"button\" class=\"button\" onclick=\"load_home3()\">Dodaj nowa wizyte</button><br><br>\n");
		out.append("<button type=\"button\" class=\"button\" onclick=\"load_home4()\">Naprawa</button><br><br>\n");
		out.append("<div id =\"content\" style=\"width:800px;height:800px;border:0px solid;resize:none;overflow:auto;\"> </div>\n");

		out.append("<center>\n");
		out.append("</font>\n");
		out.append("</div>\n");
		out.append("</div>\n");
		out.append("<div id=\"footer\">\n");
		out.append("@In¿ynieria Systemów Informacyjnych 2016\n");
		out.append("</div>\n");
		out.append("</div>\n");

		out.append("<script>\n");

		out.append("function load_home() {\n");
		out.append("document.getElementById(\"content\").innerHTML='<object type=\"type/html\"data=\"tSerwis.html\"style=\"width:800px;height:800px;border:0px solid;resize:none;overflow:auto;\"></object>';\n");
		out.append("}\n");

		out.append("function load_home1() {\n");
		out.append("document.getElementById(\"content\").innerHTML='<object type=\"type/html\"data=\"dodprac.html\"id=\"dupa\"style=\"width:800px;height:800px;border:0px solid;resize:none;overflow:auto;\"></object>';\n");
		out.append("}\n");

		out.append("function load_home2() {\n");
		out.append("document.getElementById(\"content\").innerHTML='<object type=\"type/html\"data=\"cVIN.html\"id=\"dupa1\"style=\"width:800px;height:800px;border:0px solid;resize:none;overflow:auto;\"></object>';\n");
		out.append("}\n");

		out.append("function load_home3() {\n");
		out.append("document.getElementById(\"content\").innerHTML='<object type=\"type/html\"data=\"addwizy.html\"id=\"dupa2\"style=\"width:800px;height:800px;border:0px solid;resize:none;overflow:auto;\"></object>';\n");

		out.append("}\n");

		out.append("function load_home4() {\n");
		out.append("document.getElementById(\"content\").innerHTML='<object type=\"type/html\"data=\"napraw.html\"id=\"dupa3\"style=\"width:800px;height:800px;border:0px solid;resize:none;overflow:auto;\"></object>';\n");

		out.append("}\n");

		out.append("function loadDoc() {\n");
		out.append("  var xhttp = new XMLHttpRequest();\n");
		out.append("  xhttp.onreadystatechange =\n");

		out.append("	function() {\n");
		out.append("  if (xhttp.status == 200) {\n");
		out.append("  	document.getElementById(\"content\").innerHTML = xhttp.responseText;\n");
		out.append(" }\n");
		out.append(" };\n");

		out.append("	xhttp.open(\"GET\",\"Servisant?id=2\",true);xhttp.send();\n");

		out.append("}\n");

		out.append("function loadDoc2() {\n");
		out.append("	  var xhttp = new XMLHttpRequest();\n");
		out.append("	  xhttp.onreadystatechange =\n");

		out.append("function() {\n");
		out.append("    if (xhttp.status == 200) {\n");
		out.append("    	document.getElementById(\"content\").innerHTML = xhttp.responseText;\n");
		out.append("    }\n");
		out.append("  };\n");

		out.append("xhttp.open(\"GET\",\"users/client?id=2\",true);xhttp.send();\n");

		out.append("}\n");

		out.append("function newbuton() {\n");
		out.append("	var btn = document.createElement(\"BUTTON\");\n");
		out.append("	document.body.appendChild(btn);\n");
		out.append("	}1\n");

		out.append("	function clearDoc() {\n");
		out.append("		document.getElementById(\"demo\").innerHTML = \"<h2>Nothing</h2>\";\n");
		out.append("	}\n");

		out.append("	function myFunction(arr) {\n");
		out.append("		var out=\"\";var i;out=arr.imie;document.getElementById(\"demo\").innerHTML=out;\n");
		out.append("	}\n");

		out.append("	function btntest_onclick() {\n");
		out.append("		window.location.href = \"rejestracja.html\";\n");
		out.append("	}\n");
		out.append("	function client() {\n");
		out.append("		window.location.href = \"Client.html\";\n");
		out.append("	}\n");
		out.append("	</script>\n");

		return out.toString();

	}

	public static String uWizyta() {
		StringBuffer out = new StringBuffer();

		out.append("<font color = \"#EFEFEF\">\n");
		out.append("<h2>Umów siê na wizytê</h2>\n");
		out.append("<p>Podaj date<br> <input type=\"text\" id=\"datepicker\" autofocus=\"0\"></p>\n");
		out.append("Nazwa serwisu<br>\n");
		out.append("<input type=\"text\" id=\"nazwa\"><br><br>\n");
		out.append("Model samochodu<br>\n");
		out.append("<input type=\"text\" id=\"model\"><br><br>\n");
		out.append("<button class=\"button\" type=\"button\" onclick=\"loadDoc()\">Umów wizytê</button>\n");
		out.append("</font>\n");
		out.append("<script src=\"jq/jquery-ui-1.11.4.custom/external/jquery/jquery.js\"></script>\n");
		out.append("<script src=\"jq/jquery-ui-1.11.4.custom/jquery-ui.js\"></script>\n");
		out.append("<script>\n");
		out.append("$(function() {\n");
		out.append("$( \"#datepicker\" ).datepicker();\n");
		out.append("});\n");
		out.append("function loadDoc() {\n");
		out.append("var Data = document.getElementById(\"data\").value;\n");
		out.append("var nazwa = document.getElementById(\"nazwa\").value\n");
		out.append("var model = document.getElementById(\"model\").value;\n");
		out.append("var xhttp = new XMLHttpRequest();\n");
		out.append(" xhttp.onreadystatechange = function() {\n");
		out.append("if (xhttp.status == 200) {\n");
		// out.append("document.getElementById(\"demo\").innerHTML =
		// xhttp.responseText;\n");
		out.append("}\n");
		out.append("};\n");
		out.append("xhttp.open(\"POST\", \"users/client\", true);\n");
		out.append("xhttp.setRequestHeader(\"Content-type\", \"application/json\");\n");
		out.append("var data = JSON.stringify({\"id\":\"2\",\"data\":Data,\"nazwa\":nazwa,\"model\":model});\n");
		out.append("xhttp.send(data);\n");
		out.append("}\n");
		out.append("</script>\n");

		return out.toString();
	}

	public static String wolneTerminy(String dzien, String dzien2) {
		StringBuffer out = new StringBuffer();

		out.append("<div id=\"datepicker\" style=\"margin-left: 400px;\"></div>\n");
		out.append("<script>\n");
		out.append("$(function() {\n");
		out.append("$(\"#datepicker\").datepicker({\n");
		out.append("beforeShowDay: function(date) {\n");
		out.append("var date1 = new Date()\n");
		out.append("date1.setDate('" + dzien + "')\n");
		out.append("var date2 = new Date()\n");
		out.append("date2.setDate('" + dzien2 + "')\n");
		out.append("return [true, date1 && ((date.getTime() == date1.getTime()) || (date.getDate() == date2.getDate() || date.getDate() == date1.getDate())) ? \"dp-highlight\" : \"\"];\n");
		out.append("}\n");
		out.append("});\n");
		out.append("});\n");
		out.append("</script>\n");

		return out.toString();
	}

	public static String dodprac() {
		StringBuffer out = new StringBuffer();
		out.append("<font color = \"#EFEFEF\" size = 5 >\n");
		out.append("<div id=\"container\" top-margin=\"10px\">\n");
		out.append("<div id=\"logo\">\n");
		out.append("<img src=\"logo.png\">\n");
		out.append("</div>\n");
		out.append("<div id=\"con\">\n");
		out.append("<div id=\"nav\">\n");
		out.append("<center>\n");
		out.append("<br>\n");
		out.append("<a href=\"strona.html\" class=\"button\">Strona g³ówna</a><br><br><br>\n");
		out.append("<a href=\"index.html\" class=\"button\">Ekran logowania</a><br><br><br>\n");
		out.append("<a href=\"Client.html\" class=\"button\">Powrót</a><br><br><br>\n");
		out.append("</center>\n");
		out.append("</div>\n");

		out.append("<div id=\"news\">\n");
		out.append("<img src=\"reklama.png\">\n");
		out.append("</div>\n");

		out.append("<div id=\"content\">\n");
		out.append("<center>\n");
		out.append("<h2>Dodaj nowego pracownika</h2>\n");
		out.append("<h4>PESEL<br>\n");
		out.append("<input type=\"text\" id=\"PESEL\" value=\"\"><br><br>\n");
		out.append("Imiê<br>\n");
		out.append("<input type=\"text\" id=\"imie\" value=\"\"><br><br>\n");
		out.append("Nazwisko<br>\n");
		out.append("<input type=\"text\" id=\"nazwisko\" value=\"\"><br><br>\n");
		out.append("Miejscowoœæ<br>\n");
		out.append("<input type=\"text\" id=\"miejscowosc\" value=\"\"><br><br>\n");
		out.append("Kod pocztowy<br>\n");
		out.append("<input type=\"text\" id=\"kodp\" value= \"\"><br><br>\n");
		out.append("Numer telefonu<br>\n");
		out.append("<input type=\"text\" id=\"nrt\" value=\"\"><br><br>\n");
		out.append("E-mail<br>\n");
		out.append("<input type=\"text\" id=\"email\" value=\"\"><br><br>\n");
		out.append("Has³o<br>\n");
		out.append("<input type=\"text\" id=\"haslo\" value=\"\"><br><br>\n");
		out.append("Stanowisko<br>\n");
		out.append("<input type=\"text\" id=\"stan\" value=\"\"><br><br>\n");
		out.append("</h4>\n");
		out.append("<button type=\"button\" class=\"button\" onclick=\"loadDoc()\">Zarejestruj</button><br><br>\n");
		out.append("<input id=\"btntest\" type=\"button\" class=\"button\" value=\"Zaloguj\" \n");
		out.append("onclick=\"return btntest_onclick()\" />\n");
		out.append("</font>\n");
		out.append("</center>\n");
		out.append("</div>\n");
		out.append("</div>\n");
		out.append("<div id=\"footer\">\n");
		out.append("@In¿ynieria Systemów Informacyjnych 2016\n");
		out.append("</div>\n");
		out.append("</div>\n");
		out.append("</font>\n");

		out.append("<script>\n");
		out.append("function loadDoc() {\n");
		out.append("var haslo = document.getElementById(\"haslo\").value;\n");
		out.append("var email = document.getElementById(\"email\").value\n");
		out.append("var kodp = document.getElementById(\"kodp\").value;\n");
		out.append("var PESEL = document.getElementById(\"PESEL\").value;\n");
		out.append("var imie = document.getElementById(\"imie\").value;\n");
		out.append("var nazwisko = document.getElementById(\"nazwisko\").value;\n");
		out.append("var nrt = document.getElementById(\"nrt\").value;\n");
		out.append("var miejscow = document.getElementById(\"miejscowosc\").value;\n");
		out.append("var stan = document.getElementById(\"stan\").value;\n");

		out.append("var xhttp = new XMLHttpRequest();\n");
		out.append("xhttp.onreadystatechange = function() {\n");
		out.append("if (xhttp.status == 200) {\n");
		out.append("document.getElementById(\"demo\").innerHTML = xhttp.responseText;\n");
		out.append("}\n");
		out.append("};\n");
		out.append("xhttp.open(\"POST\", \"Servisant\", true);\n");
		out.append("xhttp.setRequestHeader(\"Content-type\", \"application/json\");\n");
		
		out.append("var data = JSON.stringify({\"id\":\"1\",\"email\":email,\"haslo\":haslo,\"KodP\":kodp,\"PESEL\":PESEL,\"imie\":imie,\"nazwisko\":nazwisko,\"ntel\":nrt,\"miejscowos\":miejscow,\"stan\":stan});\n");
		out.append("xhttp.send(data);\n");
		out.append("}\n");

		out.append("function clearDoc() {\n");
		out.append("document.getElementById(\"demo\").innerHTML = \"<h2>Nothing</h2>\";\n");
		out.append("}\n");
		out.append("function myFunction(arr) {\n");
		out.append("var out = \"\";\n");
		out.append("var i;\n");
		out.append("out = arr.imie;\n");
		out.append("document.getElementById(\"demo\").innerHTML = out;\n");
		out.append("}\n");
		out.append("function btntest_onclick()\n");
		out.append("{\n");
		out.append("window.location.href = \"sLogin.html\";\n");
		out.append("}\n");
		out.append("</script>\n");
		return out.toString();
	}

}
