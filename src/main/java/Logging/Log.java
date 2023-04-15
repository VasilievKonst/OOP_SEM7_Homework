package Logging;


public interface Log {


    public void writeFile(String expression, String nameFile);

    /**
     * @param x - первое число
     * @param y - второе число
     * @param result - резeльтат
     * @param operation - математическое действие
     * @return - отформатированная строка
     */
    public String getExpression(Double x, Double y, Double result, Integer operation);
}
