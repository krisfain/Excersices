public class While {
    public static void main (String[] args) {
        /*int value = 7;
        boolean t = value >8; //сравнить с переменной int
        System.out.println(t);*/

        /*boolean t = 5==8; //сравнить два значения на равенство
        System.out.println(t);*/

        //в цикле while в скобках задаем условие до каких пор будет выполняться цикл. в скобках задается условие которое выдает либо true либо false
        //каждый раз когда мы проходим через цикл while значение value увеличивается на 1 и выводится Bingo и полученное в результате сложения значение  value (value +1), до тех пор пока value меньше 5
        int value = 0;
        while(value<5) {
            System.out.println("Bingo"+value);
            value = value + 1;
        }
    }
}


