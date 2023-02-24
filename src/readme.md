Ska göra ett chatprogram där en server och en client kan prata med varandra.


Mitt program ska kunna göra

Ansluta en klient till en server
Använda guit för att skicka och ta emot meddelanden.
Programmen ska hantera skicka och ta emot simultant (samtidigt) med hjälp av trådar.



#### 2023-02-09
Jag har skapat en grundläggande struktur av programmet.
Skapade en simpel GUI för clienten och servern. 
Jag har även skapat en controller så jag kan starta view och model.


#### 2023-02-10

Har lagt en model så jag kan köra programmet i terminalen.
Jag har börjat att koppla knapparna och textfälten så programmet använder de istället för terminalen.


#### 2023-02-16
Jag har gjort att min sendbutton tar det som står i textfältet och skriver
det i chatrutan. Jag måste göra samma sak i servern också och sedan göra så
att servern och clienten kan se varandras meddelanden.

#### 2023-02-23
Servern och klienten kan chatta med varandra och man kan se om meddelandet är
från servern eller klienten. Det jag har försökt med idag är att fixa 
så man kan skriva in ett namn när man startar programmet och att när man skickar
ett meddelande står det att det kommer från rätt namn.
Nästa gång ska jag fixa så att namnet kommer in i listan av användare och att
den andra kan se namnet när den tar emot ett meddelande.



#### 2023-02-24
Nu kan servern och klienten båda välja ett namn när det startas och när de
skickar ett meddelande står det namnet före deras meddelande. 
Namnlistan visar inte båda namnen utan bara det egna namnet.
Rutan som chatten är i puttar bort knappen om ett för stort meddelande skickas.