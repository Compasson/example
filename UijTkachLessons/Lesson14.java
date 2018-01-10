package UijTkachLessons;

public class Lesson14 {

Swing

ActionListener

t.add MouseListener(new MouseAdapter())

// MouseAdapter - имплементит все методы мышкислушателя.

t.addPropertyChangeListener

// Лучше на каждую кнопку вешать свои листенер. А листенеры наследуются от одного класса.

/* 
 * рис 14-1 Если на форме мы имеем одинаковые кнопки например OPEN, то можем повесить на них
 * один OpenAction наследующийся от основного Action. В то же время мы можем для каждой кнопки
 * делать свои параметры: например показывать текст (в тулбар) или нет.
 *
 */


