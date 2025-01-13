# Követelmény specifikáció

## 1. Jelenlegi helyzet
Az alkalmazás fejlesztése egy egyszerű, de funkcionalitásában praktikus számológép elkészítését célozza meg. A jelenlegi helyzetben az ilyen típusú programok alapvető műveleteket kínálnak (pl. összeadás, kivonás, szorzás, osztás), de kiegészítésre szorulnak interaktív felhasználói felülettel és további funkcionalitásokkal, mint például a bejelentkezés.

## 2. Vágyálom rendszer
Az általános funkcionalitás mellett az alkalmazásnak további elvárásoknak kell megfelelnie:
    Modern, letisztult és felhasználóbarát grafikus felhasználói felület.
    Adatbázis-kapcsolat felhasználói adatok tárolásához és szinkronizálásához.
    Lehetőség további funkciók bővítésére, például a tudományos számolások vagy a többfelhasználós kezelés.
    Megfelelő megjelenés különböző képernyőméretekhez.

## 3. Jelenlegi üzleti folyamatok
    3.1. Felhasználói adatok kezelése
    3.1.1. A felhasználók ellenőrzése adatbázison keresztül történik, ahol a rendszer összeveti a megadott bejelentkezési adatokat a tárolt adatokkal.

    3.2. Alapvető műveletek
    3.2.1. Az alkalmazás képes legyen egyszerű matematikai műveletek (pl. összeadás, kivonás, szorzás, osztás) elvégzésére.
    3.2.2. A számolási eredmények a kijelzőben jelenjenek meg.

## 4. Igényelt üzleti folyamatok
    4.1. Felhasználói azonosítások
    4.1.1. Bejelentkezési felület, amely ellenőrzi a felhasználói neveket és jelszavakat.
    4.1.2. Lehetőség új felhasználók regisztrációjára.

    4.2. Matematikai műveletek kezelése
    4.2.1. A műveletek több lépésben is elvégezhetők legyenek.

    4.3. Adatbázis-kezelés
    4.3.1. A felhasználói adatok törlése és frissítése adatbázison keresztül.
    4.3.2. Adatok mentése a műveletekről a statisztikai elemzés érdekében.

## 5. A rendszerre vonatkozó szabályok
    5.1. A rendszer JavaFX technológiával készül, hogy többablakos alkalmazást biztosítson.
    5.2. Az adatbázis MySQL alapú legyen.
    5.3. A felhasználói adatok kezelésekor GDPR irányelvei legyenek használva.

## 6. Követelménylista
    K01 Egyszerű és letisztult kezelőfelülettel rendelkezzen.
    K02 Az alkalmazás képes legyen alapvető matematikai műveletek elvégzésére.
    K03 Adatbázis-kapcsolatot biztosítson a felhasználói adatok tárolásához.
    K04 Bejelentkezési adatok ellenőrzése.

## 7. Fogalomszótár
JavaFX: A Java programozási nyelv grafikus felületek fejlesztésére szánt keretrendszere.
MySQL: Nyílt forráskódú relációs adatbázis-kezelő rendszer.
GDPR: Az Európai Unió által előírt általános adatvédelmi rendelet.
Adatbázis-kezelés: Az adatbázis-kezelés többfelhasználós, hálózatos környezetben, adatbázisokhoz való hozzáférést biztosít.
