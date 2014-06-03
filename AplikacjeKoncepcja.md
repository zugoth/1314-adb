## Aplikacje bazodanowe - koncepcja
### Laboratorium

### Część 1  
Stworzenie aplikacji bazodanowej.

Założenia:
Praca w grupach (np. 3 osobowych).

#### Wymagania aplikacji:

- Aplikacja ma być produktem. Powinna mieć jakiś zdefiniowany zakres działania.
- Powinna operować na pewnych danych numerycznych np. kwoty, daty. Ma to umożliwić zrobienie hurtowni danych.
- Powinna obsługiwać transakcje.
- Powinna zawierać ok. 15 tabel
- Powinna posiadać interfejs i odpowiednią architekturę.
- Technologia jest dowolna.

#### Kamienie milowe:
1. Wybór i zgłoszenie tematu. Wstępny zakres projektu. (termin: 2 tydzień)
2. Projekt aplikacji zawierający:
    1. analizę biznesową (jaki wycinek rzeczywistości oprogramowujemy)
    2. wymagania użytkownika wyszczególnione w punktach
    3. diagram przypadków użycia (jakie funkcjonalności ma program)
    4. diagram bazy danych
    5. koncepcja architektury systemu (jak aplikacja jest zbudowana, jakie ma warstwy, itd.) (termin: 4 tydzień)
3. Implementacja aplikacji (termin: 8 tydzień)


### Cześć 2
Stworzenie hurtowni danych na podstawie aplikacji.

#### Wymagania hurtowni danych:

- Projekt powinien się składać z: hurtowni danych, bazy OLAP oraz raportów.
- Hurtownia danych powinna być utworzona na podstawie danych z aplikacji bazodanowej.
- Hurtownia danych powinna mieć schemat konstelacji faktów i powinna zawierać co najmniej 3 tabele faktów.
- Hurtownia danych powinna zawierać przynajmniej jeden wymiar hierarchiczny
- Hurtownia danych powinna zawierać wymiar CZAS niezależnie od rodzaju projektu.
- Na podstawie hurtowni danych powinny być tworzone kostki OLAP.
- Kostki OLAP powinny mieć jakieś miary wyliczane za pomocą języka do obsługi struktur wielowymiarowych, np. MDX. W ramach projektu powinny być stworzone raporty w dowolnym systemie raportowym.

#### Kamienie milowe:

1. Projekt hurtowni danych zawierający:
    1. analizę biznesową (jaki wycinek rzeczywistości oprogramowujemy)
    2. projekt hurtowni danych
    3. opis miar wyliczanych po stronie OLAP.
    4. przykładowe analizy, które można wykonać (termin: 10 tydzień)
2. Implementacja hurtowni danych zawierająca:
    1. Stworzenie bazy hurtowni danych
    2. Stworzenie bazy OLAP
    3. Stworzenie raportów dla użytkownika
    4. Stworzeni transformacji danych z aplikacji bazodanowej do bazy hurtowni.
(termin: 12 tydzień)
