# test
ТЗ
Бизнес постановка
Необходимо создать витрину-реестр с наиболее детальным описанием марок/моделей авто на основе набора источников.
Источники - результат парсинга различных сайтов каталогов объявлений.
В данном ТЗ используются упрощенные схемы источников и витрины-результата.

Техническая постановка.
Реализовать трансформер агрегирующий все полученные записи из разных источников и формирующий мастер-запись в витрине-результате. PK витрины результата составной - марка + номер модели.

Каждый источник содержать несколько записей об одной и той же марке/модели
Каждый источник может содержать или не содержать запись о марке/модели. Не существует "мастер" источника.
Источники содержат разные наборы доступных полей. Подробнее смотреть в Models.scala
Источники содержат в среднем по 500 тысяч записей

