package school.lesson14.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех,
 * у которых есть параметры, например <p id ="p1">,
 * и замену их на простые теги абзацев <p>.
 */
public class Task3 {

    private static final String TEG_P = "<p[^>]*>";

    public static void main(String[] args) {
        String s = "<p class=\"ad\">Реклама</p>\n" +
                "<p>В разделе «Основы  JavaScript» появился новый курс — «<a href=\"https://htmlacademy.ru/courses/219?utm_source=htmlbook&utm_medium=blog&utm_campaign=js219\">JavaScript в браузере</a>». Он состоит из 21 задания, включая два испытания от Кекса. Посмотрим, как JavaScript работает в браузере, а не в консоли, как взаимодействует с разметкой. Узнаем, что такое DOM и создадим разметку с JavaScript.</p>\n" +
                "<p>Кекс, естественно, подготовил новое техническое задание:</p>\n" +
                "<p>«Мяу! На сайте магазина  мороженого надо отображать актуальное  состояние товаров: «в наличии», «нет в  наличии», «хит». Ещё будет нужно создать  карточки товаров, основываясь на данных,  полученных с сервера.</p>\n" +
                "<p>Все детали я описал в  заданиях.»</p>\n" +
                "<p>Курс доступен по подписке.</p>\n" +
                "<p class=\"fig\"><a href=\"https://htmlacademy.ru/courses/219?utm_source=htmlbook&utm_medium=blog&utm_campaign=js219\"><img src=\"http://htmlbook.ru/files/images/blog/htmlacademy/js-219.jpg\" width=\"800\" height=\"481\" alt=\"\"></a></p>\n" +
                "<!--break-->    </div>\n" +
                "  <div class=\"views-row views-row-13 views-row-odd\">\n" +
                "      \n" +
                "          <h2 class=\"node-title\"><a href=\"/blog/znakomstvo-s-javascript-0\">Знакомство с JavaScript</a></h2>    \n" +
                "          <p class=\"ad\">Реклама</p>";

        Pattern p = Pattern.compile(Task3.TEG_P);
        Matcher matcher = p.matcher(s);
        System.out.println(matcher.replaceAll("<p>"));
    }
}
