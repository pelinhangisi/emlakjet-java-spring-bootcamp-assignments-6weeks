# Java 11 ile Gelen Yenilikler
<hr><br>

* <b>Tekil - Dosya Kaynak Kodu ( Single - File Source Code )</b> <br>
Java 11 ile beraber tek bir Java dosyasını öncesinde javac komutu kullanmadan çalıştırabilir hale geldik. 

```
// Before Java 11 
$ javac HelloWorld.java
$ java HelloWorld 
Hello World !

// After Java 11
$ java HelloWorld.java
Hello World !
```
<br>

* <b>Shebang Dosyaları ( Shell Scripting for Java 11 )</b> <br>
Unix tabanlı işletim sistemlerinde yaygın şekilde kullanılan script yapısını kullanabilir hale geldik. Shebang dosyaları : İçerisinde kendisinin neye göre çalıştırılacağı belirtilen ve script şeklinde çalıştırabileceğimiz dosyalardır. <br><br>
* <b>String API Üzerindeki Yenilikler </b>
    * repeat(int) methodu
    * isBlank() methodu
    * strip(), stripLeading(), stripTrailing() methodları
    * lines() methodu
<br>

* <b>JEP 321 HTTP Client (Standard)</b>
HTTP İstemcisi Java 11'de standart hale getirildi. java.net.http. <br>

* <b>Local-Variable Type Interface </b>
Artık parametre tanımlarken parametre tipi belirtmeden, sadece `var` keyword ile tanımlama yapabiliyoruz. <br>

* <b>Local-Variable Syntax for Lambda Parameters </b>
Lambda tanımlamaları daha önce explicitly ve implicitly olarak 2 şekilde yapılabilmekteydi. Artık implicitly olarak "var" kullanarak tanımlayabiliyoruz. <br>

* <b>Nest-Based Access Control</b>
Java SE 11'de Java Sanal Makinesi, sınıfların ve arabirimlerin yuva adı verilen yeni bir erişim denetimi bağlamında düzenlenmesini destekler . Yuvalar, mantıksal olarak aynı kod varlığının parçası olan, ancak farklı dosyalara derlenen sınıfların ve arabirimlerin, derleyicilerin erişilebilirliği genişleten köprü yöntemleri eklemesine gerek kalmadan classbirbirlerinin üyelerine erişmesine izin verir. <br>

* <b>JEP 328: Java Flight Recorder</b>
JVM üzerinde uygulama çalışırken uygulamayı en düşük seviyede izleyebilmek için bir araç.


# Java 17 ile Gelen Yenilikler
<hr>

### Java Language Features
* <b>Sealed Classes</b><br>
Sealed Class lar ve arayüzler, hangi diğer sınıfların veya arayüzlerin onları genişletebileceğini veya uygulayabileceğini kısıtlar.
* <b>Pattern Matching for Switch (Preview)</b><br>
Karmaşık veri odaklı sorguların kısa ve öz ve güvenli bir şekilde ifade edilebilir hale gelmesini sağlar.Bu JEP, anahtar ifadelerinin ve ifadelerinin anlamlılığını ve uygulanabilirliğini genişletir.

### Libraries Improvements
* <b>Enhanced Pseudo-Random Number Generators</b><br>
Sözde rastgele sayı üreteçleri için yeni arayüz türleri ve uygulama sunar.
* <b>New macOS Rendering Pipeline</b><br>
Yeni Apple Metal çerçevesini kullanarak macOS için yeni bir Java 2D işleme hattı uygular.
* <b>Context-Specific Deserialization Filters</b><br>
JDK 17'de filtreler bağlama özel olabilir ve geliştirici tarafından dinamik olarak tanımlanabilir.
* <b>Foreing Function & Memory API</b><br>
JDK 17, Java çalışma zamanının dışındaki kod ve verilerle tümleştirmenin çok daha kolay bir yolunu sunar - Yabancı İşlev ve Bellek (FFM) API'si.
* <b>Vector API</b><br>
Java 17, Java 16'nın halihazırda önerilen Vector API bölümüne geliştirmeler sunar. Geliştirmeler, geri bildirimlere yanıt olarak yapılmıştır ve işte önemli değişiklikler: UTF-8 karakter kod çözme gibi karakterler üzerindeki işlemleri desteklemek için API'de yapılan geliştirmeler. Spesifik olarak, kısa vektörler ve karakter dizileri arasında karakterleri kopyalamak için yöntemler ve integral vektörlerle imzasız karşılaştırmalar için yeni vektör karşılaştırma operatörleri ekliyoruz.Byte vektörlerini boolean dizilerine çevirmek için API'de yapılan geliştirmeler vs.

### Future Proofing
* <b>Strongly Encapsulate JDK Internals</b><br>
JDK'nın dahili API'lerine erişen önceki sürümlerle uyumlu kod başarılı bir şekilde artık varsayılan olarak çalışmayabilir.JDK 17, option- -illegal -access ve strong encapsulation kullanımına izin vermemektedir.  
* <b>Restore Always-Strict Floating-Point Semantics</b><br>
Bu JEP, java.lang.Math ve java.lang.StrictMath gibi hassas kitaplıkların geliştirilmesini kolaylaştırır. Ayrıca platformun bu yönünde daha fazla düzenlilik sağlar.

### Deprecations and Removals
* <b>Remove RMI Activation</b><br>
Uzak Yöntem Çağırma (RMI) etkinleştirmesi etkin bir şekilde kaldırılır. Java SE 15'te JEP 385 tarafından kaldırılmak üzere kullanımdan kaldırılmıştır.

### New Platforms 
* <b>macOS/AArch64 Port</b><br>
Apple, 2020'de Merkezi İşlem Birimini (CPU) Intel'in x86-64'ünden ARM64/AArch64 mimarisini kullanan Apple tasarımı çiplere taşımak için iki yıllık bir geçiş planı (Apple Silicon) duyurdu.<br>
JEP 391, JDK'yı yeni mimariye taşımakla ilgilidir. <br>
Kol tabanlı işlemciler her zaman gömülü ve mobil pazarı hedef alıyorlardı. Enerji tüketimini düşük tutarken yeterli performans sunarlar. Ama bu değişiyor. Bazı donanım satıcıları, x86-64 mimarisiyle rekabet edebilmek için artık AArch64 adı verilen 64-bit Arm mimarisini kullanıyor. <br>
Yeni AArch64 tabanlı makinelerde bir macOS Intel'in x86–64 JDK derlemesini çalıştırmak mümkün olsa da, çeviri kuşkusuz önemli bir performans artışına neden olacaktır.



