1. Definiție și Caracteristici:

    Definiție: Design pattern-ul 'Template' este un tip de pattern comportamental care definește scheletele algoritmilor într-o metodă dintr-o clasă de bază, amânând anumite pași către subclasă.
    Caracteristici:
        Stabilește o structură de algoritm într-o clasă de bază.
        Părțile specifice ale algoritmului sunt implementate de subclase.
        Promovează reutilizarea și extensibilitatea codului.

2. Scopul:

    Reutilizare și Extensibilitate: Permite definirea unui schelet algoritm într-o clasă de bază, iar pașii specifici sunt implementați în subclase, facilitând reutilizarea și extensibilitatea codului.
    Evitarea Duplicității: Elimină duplicarea codului pentru părți comune ale algoritmilor.

3. Implementare:

    Clasa de Bază (Abstract Class):
        Definirea metodelor care alcătuiesc scheletul algoritmului.
        Pot exista metode abstracte (fără implementare) sau metode concrete (cu implementare implicită).
    Subclase (Concrete Classes):
        Implementarea detaliată a pașilor specifici ai algoritmului.
        Pot extinde sau suprascrie metodele definite în clasa de bază.

4. Avantaje:

    Reutilizare: Oferă o structură comună ce poate fi extinsă de multiple subclase.
    Extensibilitate: Permite adăugarea de noi funcționalități fără modificarea structurii de bază.
    Evitarea Duplicării: Elimină redundanța prin definirea unei singure implementări a scheletului algoritmului.

5. Dezavantaje:

    Rigidețe: Structura predefinită poate fi rigidă în unele cazuri, limitând libertatea de implementare pentru subclasă.