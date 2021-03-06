package school.lesson13.task5;

/**
 * Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
 */

public class Task5 {

    // Проиеряет является ли символ буквой
    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }

    public static int words(String string) {
        int counter = 0;
        char[] chars = string.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1) {
                if (!isLetter(chars[i])) {
                    chars[i] = 32;
                }
                if (!isLetter(chars[i + 1])) {
                    chars[i + 1] = 32;
                }
                if (isLetter(chars[i]) && chars[i + 1] == 32) {
                    counter++;
                }
            } else {
                if (isLetter(chars[i]) && i == chars.length-1) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "Слово — одна из основных структурных единиц языка, которая служит для именования предметов" +
                ", их качеств и характеристик, их взаимодействий, а также именования мнимых и отвлечённых понятий" +
                ", создаваемых человеческим воображением.\nВ поисках структуры слова современная наука сформировала" +
                " самостоятельную отрасль, называемую морфологией. По грамматическому значению слова классифицируются" +
                " как части речи:\n" +
                "\n" +
                "знаменательные слова — обозначающие определённые понятия, — существительное, прилагательное," +
                " глагол, наречие\n" +
                "подклассы — числительные, местоимения и междометия;\n" +
                "служебные слова — служащие для связи слов между собой — союз, предлог, частица, артикль и др.\n" +
                "По лексическому значению слова классифицируются по возрастающему перечню по мере развития лексикологии" +
                ", семантики, учения о словообразовании, этимологии и стилистики.\n" +
                "\n" +
                "С исторической точки зрения слова, составляющие лексику языка, обычно имеют самые различные" +
                " происхождения, и в этом многообразии истоков особо перспективным для фундаментальных исследований" +
                " становится сочетание предметов терминология и этимология, которое способно восстановить истинное" +
                " происхождение знаменательных слов.\n" +
                "\n" +
                "Понятие «слово» в научном употреблении является основополагающим понятием (аксиомой) в лингвистике." +
                " Все иносказательные употребления обозначения этого понятия являются примерами употребления данного" +
                " понятия в других областях человеческой деятельности, для которых автор или не может найти" +
                " соответствующего обозначения своей мысли, или считает введение нового обозначения ненужным. " +
                "Так что любые иносказательные употребления данного обозначения необходимо считать обиходным языком " +
                "общения, допускающим несущественные отклонения от грамотности и общей образованности. Как правило" +
                ", такая необходимость возникает при изложении субъективной или эмоциональной речи, как неотъемлемой" +
                " части человеческой жизни. Конец";
        String s2 = "Таблица символов Юникода (Unicode). Cимволы Юникода\n на одной странице c названиями и описаниями !!!!";
        System.out.println(words(s2));
    }
}
