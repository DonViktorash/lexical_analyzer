public class Start {
    public static void main(String s[]) {
        Lexer lexer = new Lexer("schema.txt");


        while (!lexer.isExausthed()) {
            System.out.printf("%-18s %s\n", lexer.currentToken(), lexer.currentLexema());
            lexer.moveAhead();
        }

        if (lexer.isSuccessful()) {
            System.out.println("Lexer stop working");
        } else {
            System.out.println(lexer.errorMessage());
        }
    }
}
/*
Входной язык содержит операторы цикла for(...;...;...) do..., разделенные символом ';'.
Операторы цикла содержат идентификаторы, знаки сравнения < > = десятичные числа с плавающей точкой и знаки присваивания
 */