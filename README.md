# Java Lesson 10 / Урок 10 / Lecția 10

Проект для IntelliJ IDEA (Maven, Java 17). Школа Impact, курс *Programarea pe Java*.

Proiect pentru IntelliJ IDEA (Maven, Java 17). Școala Impact, cursul *Programarea pe Java*.

**groupId:** `md.impact` · **artifactId:** `java-lesson10`

---

## Русский

### Что внутри

Три независимые консольные программы урока 10. У каждой свой `main`. Код соответствует презентации и раздатке (включая опечатки оригинала — см. замечания ниже).

| Пакет | Класс | Что это |
|---|---|---|
| `md.impact.lesson10.ghicicuvantul` | `Main` | Игра «Ghici cuvântul» (угадай слово по буквам, 4 категории, 6 попыток) |
| `md.impact.lesson10.quiz` | `Quiz` | «Quiz game» / «Jocul sondajelor» — квиз по географии, как на слайдах 12–16 |
| `md.impact.lesson10.hwexemplu` | `QuizProject` + `Question` | Пример к домашке: новый класс `Question` и квиз с категориями Geography и Java |

Структура:

```
java-lesson10/
├── pom.xml
├── README.md
├── .gitignore
└── src/main/java/md/impact/lesson10/
    ├── ghicicuvantul/Main.java
    ├── quiz/Quiz.java
    └── hwexemplu/Question.java
                     QuizProject.java
```

### Как открыть в IntelliJ IDEA

1. Запустите IntelliJ IDEA.
2. **File → Open…**
3. Укажите файл `pom.xml` в корне этого проекта (или саму папку `java-lesson10`) и нажмите Open.
4. Если IntelliJ спросит, откройте как **Maven project** / Trust the project.
5. Дождитесь импорта Maven (правая панель Maven или уведомление *Load Maven Project*). Внизу должен появиться SDK; если его нет, поставьте **Java 17** или новее: File → Project Structure → Project → SDK.

JDK 17 или 21 подойдут: проект собирается с `maven.compiler.release=17`.

### Как запустить каждый main

В окне Project раскройте `src/main/java` → нужный пакет → откройте класс → зелёная стрелка слева от метода `main`, либо правый клик по классу → **Run**.

- `Main` — игра «Ghici cuvântul». В консоли выберите категорию 1–4, затем вводите по одной букве.
- `Quiz` — официальный квиз. Сначала категория (1 — Geography), затем ответы номерами 1–4. Верные ответы географии: **2, 3, 4, 3, 2**.
- `QuizProject` — пример домашки. Категория 1 — те же географические вопросы (в примере «Hangar» исправлено на Angara), категория 2 — вопросы про Java с урока.

Из терминала, после сборки:

```bash
mvn -q compile

java -cp target/classes md.impact.lesson10.ghicicuvantul.Main
java -cp target/classes md.impact.lesson10.quiz.Quiz
java -cp target/classes md.impact.lesson10.hwexemplu.QuizProject
```

`Quiz` читает ответ с клавиатуры двумя объектами `Scanner`. Запускайте его интерактивно в IDE или в терминале, а не через перенаправление файла: пакетный ввод может не дойти до второго `Scanner`.

### Замечания по коду оригинала

Логика урока не менялась. Ниже — особенности и опечатки со слайдов, оставленные как есть в официальных классах `Main` и `Quiz`:

- В меню и подсказках написано **Chose** вместо *Choose*.
- В `Main` для списков `music`, `food` и `animals` используется `rand.nextInt(games.size())`, а не `music.size()` и т. д. Сейчас у всех списков по 3 слова, программа работает. Если добавить слова только в одну категорию, возможен `IndexOutOfBoundsException`.
- В 5-м вопросе `Quiz` вариант 2 записан как **Hangar** (нужно *Angara*), вариант 3 — **Venisei** (нужно *Yenisei*). Правильный номер в коде по-прежнему 2.
- Итоговая строка квиза: `of 5question.` (нет пробела и окончания множественного числа).
- В `Quiz` два объекта `Scanner` на `System.in`. Не вызывайте `close()` у первого — закроется весь ввод. В IntelliJ при ручном вводе программа работает.
- `nextInt()` падает с `InputMismatchException`, если вместо числа ввести букву. Вводить нужно номер варианта.
- Пункт меню 2 в официальном `Quiz` — заготовка («Here will be your category»), после него программа завершается. В примере `QuizProject` эта категория уже заполнена.

В `QuizProject` географические названия рек в 5-м вопросе даны в исправленном виде (Angara, Yenisei); это учительский образец домашки, не скриншот слайда.

---

## Română

### Ce conține proiectul

Trei programe de consolă independente din lecția 10. Fiecare are propriul `main`. Codul urmează prezentarea și handout-ul (inclusiv greșelile de transcriere din original — vezi observațiile de mai jos).

| Pachet | Clasă | Descriere |
|---|---|---|
| `md.impact.lesson10.ghicicuvantul` | `Main` | Jocul «Ghici cuvântul» (4 categorii, 6 încercări) |
| `md.impact.lesson10.quiz` | `Quiz` | «Quiz game» / «Jocul sondajelor» — quiz de geografie, ca pe slide-urile 12–16 |
| `md.impact.lesson10.hwexemplu` | `QuizProject` + `Question` | Exemplu pentru tema de acasă: clasa nouă `Question` și un quiz cu categoriile Geography și Java |

### Cum deschizi proiectul în IntelliJ IDEA

1. Deschide IntelliJ IDEA.
2. **File → Open…**
3. Selectează fișierul `pom.xml` din rădăcina acestui proiect (sau folderul `java-lesson10`) și apasă Open.
4. Dacă apare întrebarea, deschide-l ca **Maven project** / Trust the project.
5. Așteaptă importul Maven. Dacă nu este setat SDK-ul, alege **Java 17** sau o versiune mai nouă: File → Project Structure → Project → SDK.

Funcționează cu JDK 17 sau 21: proiectul se compilează cu `maven.compiler.release=17`.

### Cum pornești fiecare main

În fereastra Project: `src/main/java` → pachetul dorit → click dreapta pe clasă → **Run**, sau săgeata verde de lângă metoda `main`.

- `Main` — «Ghici cuvântul». Alege categoria 1–4, apoi introdu câte o literă.
- `Quiz` — quiz-ul oficial. Mai întâi categoria (1 — Geography), apoi răspunsurile ca numere 1–4. Răspunsurile corecte la geografie: **2, 3, 4, 3, 2**.
- `QuizProject` — exemplul pentru temă. Categoria 1 — aceleași întrebări de geografie (în exemplu, «Hangar» este corectat în Angara), categoria 2 — întrebări despre Java din lecție.

Din terminal, după compilare:

```bash
mvn -q compile

java -cp target/classes md.impact.lesson10.ghicicuvantul.Main
java -cp target/classes md.impact.lesson10.quiz.Quiz
java -cp target/classes md.impact.lesson10.hwexemplu.QuizProject
```

`Quiz` folosește două obiecte `Scanner`. Pornește-l interactiv în IDE sau în terminal, nu prin redirecționarea unui fișier: input-ul în pachet poate să nu ajungă la al doilea `Scanner`.

### Observații despre codul original

Logica lecției nu a fost schimbată. Mai jos sunt particularitățile și greșelile de pe slide-uri, păstrate ca atare în clasele oficiale `Main` și `Quiz`:

- În meniuri apare **Chose** în loc de *Choose*.
- În `Main`, pentru listele `music`, `food` și `animals` se folosește `rand.nextInt(games.size())`, nu `music.size()` etc. Acum toate listele au 3 cuvinte, deci programul funcționează. Dacă adaugi cuvinte doar într-o categorie, poți primi `IndexOutOfBoundsException`.
- La întrebarea 5 din `Quiz`, varianta 2 este scrisă **Hangar** (corect: *Angara*), varianta 3 — **Venisei** (corect: *Yenisei*). Numărul corect din cod rămâne 2.
- Mesajul final: `of 5question.` (lipsește spațiul și forma de plural).
- În `Quiz` există două obiecte `Scanner` pe `System.in`. Nu apela `close()` pe primul — se închide tot input-ul. În IntelliJ, cu tastatura, programul funcționează.
- `nextInt()` aruncă `InputMismatchException` dacă în loc de număr tastezi o literă. Trebuie introdus numărul variantei.
- Opțiunea 2 din meniul `Quiz` oficial este un șablon («Here will be your category»); după ea programul se încheie. În exemplul `QuizProject` această categorie este deja completată.

În `QuizProject`, denumirile râurilor de la întrebarea 5 sunt corectate (Angara, Yenisei); acesta este un exemplu pentru profesor, nu transcrierea slide-ului.
