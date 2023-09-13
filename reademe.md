`13. September 2023` `neueFische - Java Development Bootcamp`
# Spring
## Theoretische Fragen
1. Warum verwendet man verschiedene HTTP-Methoden (GET, POST, PUT, DELETE) in einer RESTful API und welche Bedeutung haben sie? Erklärt die Verwendung und den Zweck jeder Methode.
```
Daten: Erhalten, Senden, Aktualieren, Löschen
```
2. Was ist der Unterschied zwischen der Verwendung von Query-Parametern und Path Variables in Controller-Endpunkten? Gebt Beispiele für Situationen, in denen die Verwendung von Query-Parametern sinnvoll ist, und Situationen, in denen Path Variables besser geeignet sind.
```
Optionalität: Query-Parameter sind in der Regel optional, während Pfadvariablen oft erforderlich sind, um den Endpunkt zu identifizieren.
```
3. Wann sollte man den Request Body verwenden und welche Vorteile bietet er? Erläutert, warum und wann die Verwendung des Request Body sinnvoll ist und wie er bei der Datenübertragung in einer RESTful API hilfreich ist.
```
Sicherere Datenübertragung als in der URL. Der Request Body ermöglicht die Übertragung von komplexen Datenstrukturen wie JSON- oder XML und ermöglicht die Übertragung größerer Datenmengen, Bessere Versionierbarkeit (Hinzufügen / Entfernen von Datenfeldern) als über die URL
```
## Aufgaben
##### Erstellt ein neues Spring Boot Projekt in IntelliJ und implementiert einen einfachen 'HelloWorld' Controller. Verwendet dabei die gelernten Konzepte wie Annotations, HTTP-Methoden und Path Variables.
1. _Schritt 1_: Erstelle eine Spring-Boot-Anwendung mit dem Spring Initializr und füge den spring-web-starter hinzu.
2. _Schritt 2_: Schreibe einen Controller, der eine GET-Anfrage auf '/hello' verarbeitet und 'Hello, World!' zurückgibt.
3. _Schritt 3_: Verwende Path Variables, um den Namen in der Nachricht anzupassen.
   1. Beispiel: `/hello/John` gibt `Hello, John! zurück.
4. _Schritt 4_: Teste deine Controller-Methode mit einem REST-Client oder Postman und dokumentiere deine Ergebnisse.

## Bonus Aufgabe
1. _Schritt 1_: Erstelle eine neue Klasse 'Message' mit den Felder 'name', 'message' und 'id' vom Typ String.
2. _Schritt 2_: Der Controller soll nun eine Liste von Message-Objekten haben.
3. _Schritt 3_: Implementiere eine zusätzliche Controller-Methode, die eine POST-Anfrage auf '/messages' verarbeitet. Diese Methode sollte eine id, einen Namen und eine Message im Request-Body entgegennehmen und sie in der Liste speichern.
4. _Schritt 4_: Implementiere eine zusätzliche Controller-Methode, die eine GET-Anfrage auf '/messages' verarbeitet. Diese Methode sollte die Liste der Messages zurückgeben.
5. _Schritt 5_: Implementiere eine zusätzliche Controller-Methode, die eine DELETE-Anfrage auf '/messages/id' verarbeitet. Diese Methode sollte die Message mit der entsprechenden id aus der Liste löschen.(nutze eine Path Variable)
