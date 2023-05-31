package day24inheritancepolymorphism;

public class Car {
    /*
        1)Inheritance'da object oluştururken construcor'lar yukarıdan(parent) aşağıya(child)
          doğru çalışır.
        2)Parent ve Super eş anlamlıdır, Child ve Sub eş anlamlıdır.
        3)super(): her constructor'ın ilk satırında görünmez olarak bulunur.İsterseniz görünür şekilde
          de yazabilirsiniz
        4)super() ==> Bizi parent class'taki constructor'a taşır.
        5)this() ==> Bizi aynı class içindeki constructor'lar arasında gezdirir.
        6)"this", içinde bulunduğunuz class'taki variable'ları çağırmaya yarar.
        "super", parent class'taki variable'ları çağırmaya yarar.
        7) parent'tan chil'a giderken HAS-A iliskisi vardir.
        8) child'tan parent'a giderken IS-A iliskisi vardir.
        9) Eğer data type'ları arasında HAS-A ve IS-A iliskisi varsa bu data
        type'lerine "Covariant" denir.
        */

        /*
        1)Polymorphism ==> Çoklu şekil.
          Yani bir method'un farklı şekillerde karşımıza çıkması demektir.
          Polymorphism = Overloading(+) + overriding(-)
          overriding,Parent'taki method'u, child'lere göre özelleştirme işlemidir.
        2)Overriding, Parent'taki method'u, child class'in ihtiyaçlarına göre özelleştirerek
          kullanmak demektir.
        3)Overriding'de method'un body'si değiştirilir.
        4)Overriding'de method signature'a dokunulmaz. Dokunursanız Java kızar.
        */
}
