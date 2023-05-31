package day22stringbuilder;

public class Sbf01 {
    /*
          1)StringBuffer, Java'da String ureten bir Class'tir.
          2)StringBuffer, StringBuilder'a çok benzer.Yani ikisi de "mutable" String üretir.
          3)StringBuffer, "multi-thread" dir ama StringBuilder "multi-thread" değildir.
          4)Java, StringBuffer'i, StringBuilder'dan önce oluşturdu.
          5)StringBuilder, multi-thread olmadığı için StringBuffer'dan daha hızlı çalışır.
          6)multi-thread yapılırken , yapılan işlerin sıralaması önem arz eder. Yapılan işleri mantıklı
            bir sıraya koymak , "synchranization" olarak adlandırılır. StringBuffer, multi-thread
            olduğu için aynı zamanda "synchranized" dir.

          3 tane String oluşturan Class öğrendik:
          1) Immutable String lazımsa String Class
          2) mutable String lazımsa; StringBuilder veya StringBuffer
                                     i)StringBuilder ' i multi-thread gerekmezse
                                     ii)StringBuffer ' i multi-thread gerekirse
     */
}
