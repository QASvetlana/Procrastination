class Praktikum {
    public static void main(String[] args) {
        // создали объект
        Praktikum advice = new Praktikum();
        // вызвали метод
        System.out.println(advice.getAdviceOnProcrastination(5));
    }
// объявили метод getAdviceOnProcrastination с аргументом dice
    public String getAdviceOnProcrastination(int dice) {
        // объявили переменную result
        String result = "тут будет храниться совет";
// Добавили в метод условие, которое присваивает переменной result один из шести советов — в зависимости от значения аргумента dice
        if (dice == 1) {
            result = "Полистать мемы";
        } else if (dice == 2) {
            result = "Выпить чашечку чая";
        } else if (dice == 3) {
            result = "Полистать ленту новостей";
        } else if (dice == 4) {
            result = "Пообщаться с уточкой";
        } else if (dice == 5) {
            result = "Устроить small talk";
        } else if (dice == 6) {
            result = "Потыкать в носик котика или пёсика";
        }
        // Добавили в конце метода return, чтобы вернуть значение result
        return result;
    }
}
