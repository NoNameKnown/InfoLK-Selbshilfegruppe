# InfoLK-Selbshilfegruppe

Um nochmal an unsere verzweiflung zu erinnern:

"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"

# Wie funktioniert der Algorithmus? 

Um die Waggons auf Gleis(Stack) A von klein nach groß auf das Gleis C zu schieben gehen wir wie folgt vor:

Sofern die Waggongnummer(Integer) größer als der top auf Gleis C, oder dieser top auch leer ist, werden die Waggons auf C verschoben. Ist dies nicht der fall und die Waggongnummer auf Gleis A ist kleiner als die vordeste von C, werden alle Waggongs von C auf B verschoben und der Waggong mit der kleineren nummer wird ganz nach unten geschoben. Anschließend werden alle Waggons von B zurück auf C geschoben. Dieser vorgang wird wiederholt bis Gleis A leer ist.
