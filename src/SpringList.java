
public interface SpringList {
    // Добавление элемента.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    String add(String item);

    // Добавление элемента
    // на определенную позицию списка.
    // Если выходит за пределы фактического
    // количества элементов или массива,
    // выбросить исключение.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    String add(int index, String item);

    // Установить элемент
    // на определенную позицию,
    // затерев существующий.
    // Выбросить исключение,
    // если индекс больше
    // фактического количества элементов
    // или выходит за пределы массива.
    String set(int index, String item) throws TheArgumentIsIargerThanTheArraySizeException;

    // Удаление элемента.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.
    String remove(String item) throws TheArgumentIsMissingFromTheListException;

    // Удаление элемента по индексу.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.
    String remove(int index) throws TheArgumentIsIargerThanTheArraySizeException;

    // Проверка на существование элемента.
    // Вернуть true/false;
    boolean contains(String item) throws TheArgumentIsMissingFromTheListException;

    // Поиск элемента.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.
    int indexOf(String item);

    // Поиск элемента с конца.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.
    int lastIndexOf(String item);

    // Получить элемент по индексу.
    // Вернуть элемент или исключение,
    // если выходит за рамки фактического
    // количества элементов.
    String get(int index) throws TheArgumentIsIargerThanTheArraySizeException;

    // Сравнить текущий список с другим.
    // Вернуть true/false или исключение,
    // если передан null.
    boolean equals(SpringListController[] otherList) throws TheArgumentIsMissingException;

    // Вернуть фактическое количество элементов.
    int size();

    // Вернуть true,
    // если элементов в списке нет,
    // иначе false.
    boolean isEmpty();

    // Удалить все элементы из списка.
    void clear();

    // Создать новый массив
    // из строк в списке
    // и вернуть его.
    String[] toArray();
}
