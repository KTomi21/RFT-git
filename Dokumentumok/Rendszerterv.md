# Rendszerterv
## 1. A rendszer célja
A rendszer célja egy JavaFX alapú számológép alkalmazás fejlesztése, amely lehetővé teszi az alapvető matematikai műveletek elvégzését (összeadás, kivonás, szorzás, osztás). A program egyszerű és felhasználóbarát felülettel rendelkezik, amely alkalmas mind tanulási célokra, mind mindennapi használatra lehetséges.

## 2. Projektterv
A projekt során vízesés-modellt követünk, amelynek fő szakaszai: szükségletek felmérése, tervezés, fejlesztés, tesztelés és üzembehelyezés.
    Szükségletek felmérése: Az alkalmazás céljának és felhasználói igények meghatározása.
    Tervezés: Funkcionális és rendszerterv elkészítése.
    Fejlesztés: Bejelentkezés és számológép felület elkészítése Java FX technológiával.
    Tesztelés: Funkcionális és nem funkcionális tesztek lefuttatása.
    Üzembehelyezés: Az elkészült szoftver használható környezetbe helyezése, és futtatható fájlok biztosítása.

## 3. Üzleti folyamatok modellje
A felhasználó megnyitja az alkalmazást. Beírja a számítás elvégzéséhez szükséges adatokat (számokat, műveleteket). A program kiszámítja az eredményt, és megjeleníti a felhasználónak. A felhasználó további számításokat végezhet, vagy bezárhatja az alkalmazást.

## 4. Követelmények
Funkcionális követelmények:
Bejelentkezéshez szükséges CRUD műveletek.
Az alkalmazás támogatja az alapvető matematikai műveleteket.
Hibás bevitel esetén figyelmeztetés jelenjen meg a felhasználó számára.

Nem funkcionális követelmények:
Az alkalmazás gyors válaszidővel működjön.
A felület legyen egyszerűen kezelhető és letisztult.
Az alkalmazás kompatibilis legyen különféle operációs rendszerekkel.

## 5. Funkcionális terv
A program főbb moduljai:
    Adatbevitel modul: Számok és műveletek bevitele.
    Számítási modul: A matematikai műveletek végrehajtása.
    Hibakezelési modul: Hibás adatok figyelése és kezelése.
    Kimeneti modul: Az eredmény megjelenítése a felhasználói felületen.

## 6. Fizikai környezet
A fejlesztéshez IntelliJ IDEA-t használunk a forráskód íráshoz. A programozási nyelv Java, valamint grafikai felület technológiák megvalósításához Java FX fog a hasznukra válni.
 A tesztelés során különféle operációs rendszerek (Windows, MacOS) fogják biztosítani a program stabilitását.

## 7. Implementációs terv
A projekt során egy JavaFX alapú számológép alkalmazást fejlesztünk, amely modern grafikus felhasználói felülettel rendelkezik,
 és könnyen futtatható bármely Java-támogatott környezetben. 

## 8. Tesztterv
A projekt elkészítése során sok tesztre lesz szükség, ezzel a hibák előfordulását szeretnénk csökkenteni.
Tesztelni kell a gombok működését, az alap műveletek helyességét. A dizájn elemeket is kell tesztelni hogy úgy jelennek-e meg ahogyan azt mi szeretnénk.
Az alkalmazás válaszidejét szeretnénk még tesztelni esetleges nagyobb számítások esetén.

## 9. Telepítési terv
Az alkalmazás futtatásához szükséges lesz a JRE legújabb verziójára.
Ezután le kell tölteni a .jar fájlt az adott weboldalról és meg kell nyitni a JRE segítségével.
Amikor megnyitódik az alkalmazás automatikusan elindul.

## 10. Karbantartási terv
Karbantartásnál a felhasználóktól kapott visszajelzéseket szemelőtt tartjuk és ezek alapján lesz hibakezelve.
Újabb funkciók beillesztése a programba felhasználói visszajelzések alapján.
Kompatibilitás alapján a legújabb verzió biztosítása az új Java verziókkal.
Jelentések készítése és felhasználása egy statisztikai mutatóba, hogy milyen változtatások szükségesek.
