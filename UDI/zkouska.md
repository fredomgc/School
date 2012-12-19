## Výroková logika
	1. úvod do logiky, logické spojky, kvantifikátory, pravdivostní hodnota výroku
	2. jazyk, formule a pravdivostní hodnota formule výrokové logiky
	3. tabulková metoda, sémantické vyplývání ve výrokové logice
	4. booleovské funkce, úplná konjunktivní a disjunktivní normální forma
	5. vyjadřování spojek jinými spojkami, úplné systémy spojek

## Množiny, funkce
	6. pojem množiny, zapisování množin, vztahy mezi množinami, operace s množinami
	7. konečné spočetné a nespočetné množiny
	8. pojem funkce, typy funkcí (surjektivní, injektivní, bijektivní)

## Relace
	9. pojem relace, arita relace
	10. operace s binárními relacemi, binární relace a jejich reprezentace
	11. binární relace na množině (vlastnosti, příklady)
	12. uzávěry relací
	13. ekvivalence a rozklady na množině, ekvivalence a surjektivní zobrazení
	14. uspořádání, Hasseovy diagramy
	15. speciální prvky uspořádaných množin, polosvazy, svazy

## Čísla a číselné obory
	16. přirozená, celá, racionální, iracionální, reálná a komplexní čísla
	17. princip indukce
	18. dělitelnost, prvočísla, číselné soustavy

## Kombinatorika, pravděpodobnost
	19. pravidla součtu a součinu, permutace a permutace s opakováním
	20. variace a variace s opakováním, kombinace a kombinace s opakováním
	21. binomická věta, princip inkluze a exkluze
	22. počítání pravděpodobnosti

## Algoritmy, složitost algoritmů
	23. pojem algoritmu (vlastnosti, druhy)
	24. rekurze
	25. konečné automaty
	26. pojem složitosti, řádové porovnávání funkcí, příklady časové složitosti
	27. třídy složitostí P a NP, NP-úplné úlohy (příklady)

## Teorie grafů
	28. neorientované a orientované grafy, základní pojmy teorie grafů
	29. hledání cest (Dijkstrův algoritmus)
	30. hledání minimální kostry grafů (Kruskalův algoritmus)

---

## Mé vypracování
! Moje vypracování otázek, které nemusí být správné - v tomto případě prosím dejte vědět !

### 6. pojem množiny, zapisování množin, vztahy mezi množinami, operace s množinami

### 7. konečné spočetné a nespočetné množiny
Množina se nazývá končená, právě když je prázdná, nebo existuje přirozené číslo n a bijekce A -> {1, 2, 3, .., n}. Množina se nazývá nekončená, právě když není konečná.

Množina se nazývá spočetná, právě když existuje bijekce A -> N. Množina se nazývá nespočetná, právě když je nekonečná a není spočetná.

### 8. pojem funkce, typy funkcí (surjektivní, injektivní, bijektivní)

### 9. pojem relace, arita relace
Relace je matematickým protějškem běžně užívaného pojmu vztah. Formálně řečeno - relace je podmnožinou kartézského součinu. Relace je dána aritou, to jest počtem objektů, které do ní vstupují a množinami jejichž prvky do vztahu vstupují.

Pojmenování relace v závislosti na aritě
- 1 = unární
- 2 = binární
- 3 = ternární
- 4 = kvaternární

### 10. operace s binárními relacemi, binární relace a jejich reprezentace
Protože jsou relace množinami, lze s nimi provádět množinové operace - průnik, sjednocení, rozdíl a lze na ně aplikovat vztah inkluze (být podmnožinou). Binární relace můžeme reprezentovat maticí, tabulkou, grafem, nebo seznamem seznamů. ![Reprezentace relací](https://raw.github.com/FrostyX/School/master/UDI/images/zobrazeni-relace.jpg)

### 11. binární relace na množině (vlastnosti, příklady)
Binární relace R na X může být:
- reflexivní - na diagonále matice musejí být samé jedničky
- ireflexivní - na diagonále matice musejí být samé nuly
- symetrická - podle diagonály matice naproti sobě musejí být stejné hodnoty
- asymetrická
- antisymetrická - podle diagonály matice nesmí být naproti sobě dvě jedničky
- úplná - v grafu relace je hrana mezi každými dvěma vrcholy
- tranzitivní - "pokud se z bodu A dostaneme do bodu B a z bodu B se dostaneme do bodu C, pak se musíme dostat z bodu A do bodu C i bez prostředníka",  lépe se poznává z grafu

### 12. uzávěry relací

### 13. ekvivalence a rozklady na množině, ekvivalence a surjektivní zobrazení
Každá relace ekvivalence musí být reflexivní, symetrická a tranzitivní.

### 14. uspořádání, Hasseovy diagramy

### 15. speciální prvky uspořádaných množin, polosvazy, svazy

### 16. přirozená, celá, racionální, iracionální, reálná a komplexní čísla
- Přirozená čísla N: 1 2 50 38, ..
- Celá čísla Z: -2 8 5 -23, 0, ..
- Racionální čísla Q: Čísla která lze vyjádřit zlomkem
- Iracionální čísla: Čísla, která nelze vyjádřit ve tvaru zlomku: sqrt(2) sqrt(3) e pí
- Reálná čísla R: Všechna čísla na číselné ose
- Komplexní čísla:

### 17. princip indukce
Sice to nemá s matematickou indukcí co dělat, ale v příkladech se občas objevuje suma. Suma je posloupnost po sobě jdoucích čísel, které navzájem sečteme. Pod znakem sumy je hodnota od které posloupnost začíná, nad znakem sumy je hodnota na které posloupnost končí. Například ![suma](http://www.matweb.cz/cgi-bin/mimetex.cgi?\sum_{i=1}^n%20a_i) = ![posloupnost sumy](http://www.matweb.cz/cgi-bin/mimetex.cgi?\sum_{i=1}^n%20a_i=a_1+a_2+a_3+\,\ldots\,+a_{n}).
Vysvětleno [zde](http://www.matweb.cz/symboly).



### 18. dělitelnost, prvočísla, číselné soustavy

### 19. pravidla součtu a součinu, permutace a permutace s opakováním

#### Pravidlo součtu
Klíčové slovo - nebo

Lze-li úkol A provést m způsoby a lze-li úkol B provést n způsoby, přičemž žádný ze způsobu m není totožný s n, pak lze úkol A nebo úkol B provést m + n způsoby.

#### Pravidlo součinu
Klíčové slovo - a

Lze-li úkol C rozložit na po sobě následující úkoly A a B (provést C znamená nejdříve provést A a potom B) a lze-li úkol A provést m způsoby a úkol B lze provést n způsoby, pak lze úkol C provést m * n způsoby.


#### Permutace (s opakováním)
Permutace je speciální případ variace. Použijeme ji, když chceme vybrat n objektů z n (1O z 10, 5 z 5, ..).
P(n) = n!. Pokud se mohou objekty permutace opakovat, pak vydělíme n! násobky faktoriálů počtů opakujících se objektů.

### 20. variace a variace s opakováním, kombinace a kombinace s opakováním
#### Variace (s opakováním)
Výběr r objektů z n pokud záleží na pořadí vybíraných objektů. Počítáme jednoduchou úvahou. Například pokud chceme vybrat z 10ti uchazečů čtyři pro čtyři různé pozice, máme 10*9*8*7 možností. Pokud by jeden uchazeč mohl vykonávat více pozicí, máme 10*10*10*10 (tedy 10^4) možností, jak pozice rozdělit.


#### Kombinace
Výběr r objektů z n pokud nezáleží na pořadí vybíraných objektů. Počítá se pomocí kombinačního čísla (n nad r).

### 21. binomická věta, princip inkluze a exkluze
### 22. počítání pravděpodobnosti
Pravděpodobnost vypočítáme, když vydělíme počet příznivých pokusu počtem všech možných pokusů. Pokud chceme znát výsledek v procentech, vynásobíme jej stem.