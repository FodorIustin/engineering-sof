Design patternsurile folosite:
Patternul Command:

    Unde: Utilizat în clasele AddToCartCommand, CompleteOrderCommand și UpdateStockCommand.
    De ce: Acest pattern încapsulează cererile sub formă de obiecte, permițând parametrizarea clienților cu diferite cereri, coada cererilor și suport pentru operații anulabile. În acest exemplu, este folosit pentru a încapsula diverse operațiuni (adăugarea în coș, finalizarea unei comenzi, actualizarea stocului) ca obiecte de comandă.

Patternul Strategy:

    Unde: Implementat cu interfețele PaymentStrategy și DeliveryStrategy și implementările concrete (CashPayment, CardPayment, LoanPayment, LocationDelivery, PickupPointDelivery).
    De ce: Patternul Strategy definește o familie de algoritmi, îi încapsulează și îi face interschimbabili. Este folosit aici pentru a reprezenta diferite strategii de plată și livrare, permițând clienților să le aleagă și să le schimbe ușor.

Patternul Observer:

    Unde: Nu este implementat explicit în cod, dar ar putea fi aplicat pentru a notifica clienții când se aplică promoții sau când stocul unui produs favorit se schimbă.
    De ce: Patternul Observer permite unui subiect să își notifice observatorii despre schimbările de stare. Ar putea fi benefic în scenarii în care clienții trebuie să fie informați despre schimbări precum aplicarea promoțiilor sau actualizările de stoc.

