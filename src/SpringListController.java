import java.util.Objects;

public class SpringListController implements SpringList {

    private String[] string;
    private int size;
    private int variable = 0;

    public SpringListController(int size) {
        if (size > 0) {
            this.string = new String[size];
            this.size = size;
        } else {
            throw new IllegalArgumentException("Массив должен иметь минимум 1 строку");
        }
    }

    private void arrayExtension() {
        String[] strings = new String[size + 5];
        for (int j = 0; j < size; j++) {
            strings[j] = string[j];
        }
    }

    @Override
    public String add(String item) {
        for (int i = 0; i < size; i++) {
            if (string[i] == null) {
                string[i] = item;
            }
        }
        return item;
    }

    @Override
    public String add(int index, String item) {
        if (string[index] != null) {
            for (int i = index; i < size; i++) {
                if (string[i] == null) {
                    break;
                }
                string[i + 1] = string[i];
            }
            string[index] = item;
        } else {
            string[index] = item;
        }
        return item;
    }

    @Override
    public String set(int index, String item) throws TheArgumentIsIargerThanTheArraySizeException {
        if (index > size) {
            throw new TheArgumentIsIargerThanTheArraySizeException("элемент выходит за приделы списка");
        } else {
            string[index] = item;
            return item;
        }
    }

    @Override
    public String remove(String item) throws TheArgumentIsMissingFromTheListException {
        for (int i = 0; i < size; i++) {
            if (string[i].equals(item)) {
                string[i] = string[i + 1];
                return item;
            } else {
                throw new TheArgumentIsMissingFromTheListException("такого элеманта нет в списке");
            }
        }
        return item;
    }

    @Override
    public String remove(int index) throws TheArgumentIsIargerThanTheArraySizeException {
        if (index > size) {
            throw new TheArgumentIsIargerThanTheArraySizeException("элемент выходит за пределы списка");
        } else {
            for (int i = index; i < size; i++) {
                string[i] = string[i + 1];
            }
            return string[index];
        }
    }

    @Override
    public boolean contains(String item) throws TheArgumentIsMissingFromTheListException {
        for (int i = 0; i < size; i++) {
            if (string[i].equals(item)) {
                return true;
            } else {
                throw new TheArgumentIsMissingFromTheListException("Такого элемента нет в списке");
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (string[i].equals(item)) {
                return i;
            } else {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size; i > 0; i--) {
            if (string[i].equals(item)) {
                return i;
            } else {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String get(int index) throws TheArgumentIsIargerThanTheArraySizeException {
        if (index > size) {
            throw new TheArgumentIsIargerThanTheArraySizeException("Элемент выходит за рамки списка");
        } else {
            return string[index];
        }
    }

    @Override
    public boolean equals(SpringListController[] otherList) throws TheArgumentIsMissingException {
        if (otherList == null) {
            throw new TheArgumentIsMissingException("Значение не было передано");
        } else {
            for (int i = 0; i < size; i++) {
                if (string[i].equals(otherList[i])) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (string[1] == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String[] toArray() {
        String[] strings = new String[size];
        for (int i = 0; i < size; i++) {
            strings[i] = string[i];
        }
        return strings;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            string[i] = null;
        }
    }

}
