package homework_43;


public class PasswordValidator {

    public static boolean validatePassword(String password) throws PasswordValidateException {
        // Проверка на минимальную длину пароля
        if (password == null || password.length() < 8) {
            throw new PasswordValidateException("Пароль должен содержать минимум 8 символов.");
        }

        // Флаги для проверки типов символов
        boolean[] result = new boolean[4]; // [0] - цифра, [1] - заглавная, [2] - строчная, [3] - специальный символ

        // Строка с допустимыми специальными символами
        String symbols = "!%$@&*+()[]";

        // Проходим по каждому символу пароля
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Проверка для цифры
            if (Character.isDigit(ch)) result[0] = true;
            // Проверка для заглавной буквы
            if (Character.isUpperCase(ch)) result[1] = true;
            // Проверка для строчной буквы
            if (Character.isLowerCase(ch)) result[2] = true;
            // Проверка для специального символа
            if (symbols.indexOf(ch) >= 0) result[3] = true;
        }

        // Проверяем, выполнены ли все требования
        if (!result[0]) {
            throw new PasswordValidateException("Пароль должен содержать хотя бы одну цифру.");
        }
        if (!result[1]) {
            throw new PasswordValidateException("Пароль должен содержать хотя бы одну заглавную букву.");
        }
        if (!result[2]) {
            throw new PasswordValidateException("Пароль должен содержать хотя бы одну строчную букву.");
        }
        if (!result[3]) {
            throw new PasswordValidateException("Пароль должен содержать хотя бы один специальный символ.");
        }

        // Если все проверки прошли успешно, возвращаем true
        return true;
    }

}
