package day25polymorphism;

public class Animal {
    /*
        1)Parent'taki method ile Child'da override edilen method'un access modifier'ları aynı olabilir.
        2)Child'da override edilen method'un access modifier'i parent'taki method'un
          access modifier'indan dar olamaz.
        3)Parent'taki method'un access modifier'i Child'daki method'un access modifier'indan
          dar olabilir.
        4)Method'un return type'i primitive ise overriding yapıldığında return type değiştirilemez.
        5)Method'un return type'i void ise overriding yapıldığında return type değiştirilemez.

        6)Child'da override edilen method'un return type'i ile parent'taki method'un
          "return type'i" arasında "IS-A" ilişkisi varsa return type değiştirilebilir.
          Aksi takdirde değiştirilemez.
         Mesela Integer Wrapper Class ile Long Wrapper Class arasında "IS-A" ilişkisi yoktur o yüzden
         return type Integer olduğunda Long'a değiştirilemez.

        7)return type Wrapper Class olduğunda, Overriding yaparken return type değiştirilemez.

        8)"final method"lar Override edilemezler.
           final methodların body'si değiştirilemez.ama Override ederken method body'i değiştiririz
           bu bir çelişkidir.
           Bu yüzden Java final methodların Override edilmesine müsaade etmez.

        9)"static methodlar" override edilemezler. Çünkü static method'lar tüm child'lar için
           ortak method'lardır.
           Bir child, ortak methodu değiştirdiğinde diğer child'lar bundan etkilenir. Bu etkilenme
           ummadık sonuçlar ortaya çıkarabilir. Bu yüzden Java, static method'ların
           override edilmesine müsaade etmez.
     */
}
