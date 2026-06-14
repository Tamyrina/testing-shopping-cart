# TST-E1 – Testen

Repository zur Bearbeitung der Einsendeaufgabe TST-E1.

## A1 – Unit Tests

Für A1 wurde die Klasse `CartItem` entwickelt und mit JUnit 5 getestet.

Folgende Testfälle wurden umgesetzt:

* korrekte Berechnung des Gesamtpreises
* negativer Preis führt zu einer Exception
* Menge 0 führt zu einer Exception

Relevante Dateien:

* `CartItem.java`
* `CartItemTest.java`

---

## A2 – TDD (Shopping Cart)

Für A2 wurde ein einfacher Warenkorb nach dem TDD-Prinzip (Red → Green → Refactor) entwickelt.

Umgesetzte Funktionen:

* leerer Warenkorb liefert Gesamtpreis 0
* Artikel können hinzugefügt werden
* Gesamtpreis wird korrekt berechnet
* mehrere Artikel werden korrekt summiert

Die Entwicklungsschritte sind in der Git-Historie dokumentiert.

Relevante Dateien:

* `ShoppingCart.java`
* `ShoppingCartTest.java`

---

## A3 – Mocking

Für A3 wurde die Methode `getDiscount()` des `DiscountService` gemockt.

Die Methode repräsentiert eine externe Abhängigkeit, beispielsweise einen Rabattdienst über Netzwerk oder Datenbank. Durch den Mock kann der Test unabhängig von externen Systemen ausgeführt werden und liefert reproduzierbare Ergebnisse.

Relevante Dateien:

* `DiscountService.java`
* `ShoppingCartMockTest.java`

## Nutzung von AI

Für die Bearbeitung wurde ChatGPT unterstützend eingesetzt.

### Verwendeter Prompt

"Erstelle für eine Testaufgabe in Java eine einfache Klasse für einen Warenkorbartikel (CartItem) mit Preis, Anzahl und Gesamtpreisberechnung. Ergänze passende JUnit-Tests, darunter mindestens einen Test für eine Exception."

### AI-Ausgabe

Die KI schlug eine Klasse `CartItem` mit den Attributen Name, Preis und Anzahl vor. Zusätzlich wurde eine Methode zur Berechnung des Gesamtpreises sowie Unit-Tests mit JUnit vorgeschlagen.

### Eigene Kritik und Anpassungen

Die vorgeschlagene Lösung deckte die Grundfunktionalität ab, berücksichtigte jedoch zunächst nicht alle Randfälle. Für die Aufgabe wurden daher zusätzliche Prüfungen ergänzt:

* negativer Preis führt zu einer `IllegalArgumentException`
* Menge 0 führt zu einer `IllegalArgumentException`

Außerdem wurde die Lösung um einen Warenkorb (`ShoppingCart`) erweitert und im TDD-Stil weiterentwickelt. Die Git-Historie dokumentiert die Schritte Red → Green → Refactor.

Für die Mocking-Aufgabe wurde zusätzlich ein `DiscountService` eingeführt. Statt einer externen Abhängigkeit wurde ein Mock verwendet, um reproduzierbare Testergebnisse zu erhalten.

