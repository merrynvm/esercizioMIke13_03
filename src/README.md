Questo test valuta le competenze di base in Java e MySQL per una posizione junior. Si concentra su concetti fondamentali
e sulla capacità di risolvere problemi semplici. Non richiede conoscenze avanzate o librerie specifiche.

Parte 1: Java (60 minuti)

Istruzioni: Scrivi un programma Java che legga da input una lista di numeri interi, li salvi in un array, e poi calcoli e stampi:

    La somma di tutti i numeri.
    La media dei numeri.
    Il numero più grande.
    Il numero più piccolo.

Il programma deve gestire correttamente le eccezioni (ad esempio, se l'input non è un numero intero). 
Il codice deve essere ben commentato e leggibile.

Esempio di input:

10

5

20

-3

15

Esempio di output:

Somma: 47

Media: 9.4

Numero più grande: 20

Numero più piccolo: -3

Parte 2: MySQL (40 minuti)

Considera una tabella MySQL chiamata prodotti con la seguente struttura:
Colonna	Tipo di dato
id_prodotto	INT
nome_prodotto	VARCHAR(255)
prezzo	DECIMAL(10,2)
quantita	INT

Istruzioni: Scrivi le query SQL per:

    Inserire tre nuovi prodotti nella tabella prodotti con i seguenti dati:
        id_prodotto (auto-incrementale)
        nome_prodotto: "T-Shirt", "Jeans", "Cappello"
        prezzo: 19.99, 59.95, 12.50
        quantita: 100, 50, 200

    Selezionare tutti i prodotti con un prezzo superiore a 20 euro.

    Aggiornare la quantità del prodotto "T-Shirt" a 120.

    Eliminare il prodotto con id_prodotto = 2.

    Visualizzare tutti i prodotti ordinati per prezzo in ordine crescente.

Valutazione:

La valutazione terrà conto di:

    Correttezza del codice: Il programma Java e le query SQL devono funzionare correttamente e produrre i risultati attesi.
    Gestione delle eccezioni (Java): Il codice Java deve gestire in modo appropriato le possibili eccezioni.
    Efficienza del codice: Il codice Java e le query SQL devono essere efficienti e ben strutturati.
    Leggibilità del codice: Il codice deve essere ben commentato e facile da leggere e capire.
    Struttura del database (MySQL): La comprensione della struttura del database e l'utilizzo corretto delle query SQL.

Questo test è progettato per essere un punto di partenza e può essere adattato in base alle esigenze specifiche della posizione. 
Potrebbe essere utile aggiungere domande a risposta aperta per valutare le capacità di problem-solving del candidato.