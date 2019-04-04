### Levels
  - er is 1 level
  - OPTIONEEL: meerdere levels
  - een startscherm waar je het spel kan starten
  - een vast level in het spel
  - je kan een level herstarten
  - het spel moet uitbreidbaar zijn

### Onderdelen
 - een speelveld
 - een object op het speelveld

### Speelveld
- is vierkant
- bevat vierkante vakjes van dezelfde grootte
- er is altijd maar 1 object op een vakje

### Speler
- kan 4 richtingen oplopen (Noord, Oost, Zuid, West)
  - bewegen met pijltjestoetsen
  - OPTIONEEL: bewegen met NumPad-pijltjestoetsen en WASD
- kan maar 1 sleutel tegelijk dragen
- verliest de huidige sleutel als een nieuwe sleutel wordt opgepakt
- kan interactie met andere objecten hebben
  - kan een sleutel oppakken
  - kan een barricade openen
  - kan tegen een eindveld aanlopen

### Informele requirements
- Tests met JUnit
- 1 Methode getest via decision coverage
- 1 Methode getest via code coverage

### Terminologie
Position: een XY coordinaat op een playing field
