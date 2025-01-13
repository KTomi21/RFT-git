# Funkcionális specifikáció

## 1. Jelenlegi helyzet leírása
Jelenleg nincsen olyan számológép a piacon, amely letisztult lenne és egyben a megfelelő műveleteket is tartalmazna. A legtöbb számológép alap, vagyis nem köti le a felhasználók figyelmét. Ezért szükség lenne egy olyan számológépre, amit szivesen használnak.

## 2. Vágyálomrendszer leírása
Egy olyan program elkészítése, amely lehetővé teszi a gyors és egyszerű számolást. Itt több művelet közül tudnának választani, mind gazdasági, tudományos, programozói, illetve grafikus területen. A gombok megnyomásával eredményt mutat, amely több lehetőséget ad a lehetséges lépésekre.

## 3. Jelenlegi üzleti folyamatok modellje
Azért alkottuk meg ezt a számológépet, mert több funkciót tud ellátni, mint a fizikai modell. Az online elérése, vagy éppen applikációban letölthető számológép minden felhasználó számára elérhető. A meglévő funkciók használatával tudnak számításokat végezni.

## 4. Igényelt üzleti folyamatok modellje
A bejelentkezési ablak által vizsgálatra kerül a regisztrált felhasználók majd ezután tudja használni a kifejlesztett számológépet.
A matematikai műveletek (szorzás, osztás, összeadás, kivonás) elvégzése, és ezután az eredmény kimutatása a kijelzőn. Helytelen bemenet esetén az alkalmazás figyelmezteti a felhasználót, és lehetőséget ad az újrakezdésre.

## 5. Követelménylista
K1	Alapműveletek	Alapvető számítások	Az alkalmazás támogassa az összeadást, kivonást, szorzást és osztást.
K2	Haladó funkciók	Speciális műveletek	A számológép biztosítson hatványozási, gyökvonási és százalékszámítási lehetőségeket.
K3	Hibakezelés	Hibás bemenet figyelése	Helytelen bevitel esetén figyelmeztetés és újraindítási lehetőség.
K4	Megjelenítés	Eredmények kijelzése	Az eredményeket vizuálisan, könnyen olvasható formában jelenítse meg.
K5	Letisztultság	Egyszerű interfész	A felület legyen könnyen átlátható és logikus.

## 6. Használati esetek
Felhasználó:
Kiválasztja a számokat, és a vele elvégzendő műveleteket.
Hibás bemenet esetén értesítést kap, hogy javítsa ki a rossz formátumban megadott számításokat.

Rendszer:
Értelmezi a felhasználó által kért folyamatot.
Elvégzi a kiválasztott műveleteket.
Hibás műveletek esetén értesíti a felhasználót.

## 7. Forgatókönyvek
Egyszerű műveletek megadása:
A felhasználó megadja, például: 3+4, vagy bármely alap matematikai művelet elvégzést.
Az alkalmazás kiszámítja az eredményt és megjeleníti a kijelzőn.

Hibás bevitel esetén:
A felhasználó megadja, például: 5/0.
Az alkalmazás értesíti a felhasználót, hogy nincs nullával való osztás, és értesíti az új lehetőségről.

## 8. Funkció - követelmény megfeleltetése
K1	Alapműveletek végrehajtása
K3	Hibakezelés
K4	Eredmények kijelzése
K5	Felhasználóbarát felület