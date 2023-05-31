package day26abstraction;

public class Courses {
    /*
        1)Bazen parent class'taki method'un body'si hiçbir child tarafından kullanılmaz. Bu durumda
          parent'daki method'a body yazmak hiç kullanılmadığı için mantıklı değildir.
          Biz de o method'a body yazmayız.

        2)Body'si yazılmayan method'a "Abstract Method" denir.
          Abstract ingilizcede "vücutsuz" veya "soyut" anlamındadır.

        3)Method'un body'sini yazmayınca Java hata verir, biz de "abstract" keyword'unu kullanarak
          Java'ya bu method'un body'si olmayacak deriz.

        4)"abstract" keyword'unu kullanınca elde ettiğimiz abstract method normal class'lara konulamaz,
           o yüzden class'i da abstract yaparız.

        5)!!!Parent'daki method abstract ise bütün child class'lar o method'u override etmek zorundadır.!
          Bu yüzden tüm child'lar için mecburi olmasını istediğimiz fonksiyonları abstract yapmak
          mantıklı bir seçimdir.

        6)Body'si olan method'lar abstract(Concrete Method) abstract class'larin içine yazılabilir.
          abstract method'lar Concrete class'larin içine yazılamazlar.

        7)"abstract" keyword ile "method body" bir method'da aynı anda kullanılmaz.

        8)abstract class'larin içinde abstract method'lar olur. "abstract method" lar
          body'si olmadığından "eksik method'lar" gibi düşünülebilir.
          Yani abstract class içinde eksik bir yapı barındırır, siz abstract class'tan object
          üretirseniz abstract class içindeki eksiklik object'e yansır ve object eksiği olan
          bir object olmuş olur.
          Java bunu istemez çünkü eksik object eksik iş yapar, bu da application'in yanlış çalışmasına
          sebep olur.
          Java application'i korumak için "abstract class" lardan object üretilmesini engellemiştir.

         9)abstract class'ların constructor'u vardır ama object oluşturamazlar.

         10)"final" method'lar abstract olamazlar.

         11)"private" method;lar "abstract" olamazlar.

         12)"abstract" class'in abstract child'i veya concrete child'i olabilir.
         */

         /*
            "final" keyword'u açıklar mısınız?
            "final" keyword i)variable'larda    ii)method'larda     iii)class'larda

            i)variable'larda kullanıldığında ==> o variable'a kesinlikle değer ataması yapılmalıdır.
                                             ==> ilk atanan değer değiştirilemez.

            ii)method'larda kullanıldığında  ==> o method'un body'si değiştirilemez.
                                             ==> o method override edilemez.


             iii)class'larda kullanıldığında  ==> o class'in child class'i olamaz ama final class'in
                                                  kendisi child olabilir.
         */

}
