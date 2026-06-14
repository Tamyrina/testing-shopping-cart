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
