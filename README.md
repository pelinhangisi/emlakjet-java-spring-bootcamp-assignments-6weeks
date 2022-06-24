# 196-Emlakjet-Java-Spring-Bootcamp

<hr>

## Week 1 - Java 11 and Java 17 Features

<hr>

## Week-2 

## Kullanılan Teknolojiler 

 <a href="https://dev.java/" rel="nofollow"> <img src="https://camo.githubusercontent.com/4516a1dca56d6cc15e4102e39acf0c139cc69f220d05b9136af0dfece96a3dfd/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f74722f322f32652f4a6176615f4c6f676f2e737667" alt="nodejs" width="40" height="40" data-canonical-src="https://upload.wikimedia.org/wikipedia/tr/2/2e/Java_Logo.svg" style="max-width: 100%;"> </a> <a href="https://spring.io/" rel="nofollow"> <img src="https://camo.githubusercontent.com/4545b55c7771bbd175235c80b518dcbbf2f6ee0b984a51ad9363cba8cb70e67c/68747470733a2f2f7777772e766563746f726c6f676f2e7a6f6e652f6c6f676f732f737072696e67696f2f737072696e67696f2d69636f6e2e737667" alt="spring" width="40" height="40" data-canonical-src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" style="max-width: 100%;"> </a> 

### Ödev İçeriği

* CRUD Web Service 
* Create / Update / Delete / Search
* Model :
    * Post
    * Author
    * Title
    * CreatedAt
    * CreatedBy
    * UpdatedAt
    * UpdatedBy
    * Text
    * Category ["category1","category2"]
* Service :
    * getPost(id)
    * createPost(id)
    * updatePost(postbilgileri, username)
    * findPostByAuthor()
    * findPostByCategory(categoryName)
    * getLatest3Post() (son 3 post çekilecek)

* H2 Database kullanımı ile gerçekleştirilecektir. 

<hr>

## Week-3

## Kullanılan Teknolojiler 

 <a href="https://dev.java/" rel="nofollow"> <img src="https://camo.githubusercontent.com/4516a1dca56d6cc15e4102e39acf0c139cc69f220d05b9136af0dfece96a3dfd/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f74722f322f32652f4a6176615f4c6f676f2e737667" alt="nodejs" width="40" height="40" data-canonical-src="https://upload.wikimedia.org/wikipedia/tr/2/2e/Java_Logo.svg" style="max-width: 100%;"> </a> <a href="https://spring.io/" rel="nofollow"> <img src="https://camo.githubusercontent.com/4545b55c7771bbd175235c80b518dcbbf2f6ee0b984a51ad9363cba8cb70e67c/68747470733a2f2f7777772e766563746f726c6f676f2e7a6f6e652f6c6f676f732f737072696e67696f2f737072696e67696f2d69636f6e2e737667" alt="spring" width="40" height="40" data-canonical-src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" style="max-width: 100%;"> </a> <a href="https://www.postgresql.org" rel="nofollow"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="postgresql" width="40" height="40" style="max-width: 100%;"> </a> <a href="https://postman.com" rel="nofollow"> <img src="https://camo.githubusercontent.com/93b32389bf746009ca2370de7fe06c3b5146f4c99d99df65994f9ced0ba41685/68747470733a2f2f7777772e766563746f726c6f676f2e7a6f6e652f6c6f676f732f676574706f73746d616e2f676574706f73746d616e2d69636f6e2e737667" alt="postman" width="40" height="40" data-canonical-src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" style="max-width: 100%;"> </a>
 

![1](https://user-images.githubusercontent.com/96151920/173078583-9ba155e3-346c-4308-9937-265c85e6a44b.JPG)

Bir User birde ilan bilgisi tutan sınıfımız var. <br>
1.Akış : Kullanıcının ilan eklediği akış. <br>
2.Akış : İlanın görüntülendiği akış. <br>

1.akışta kullanıcı kaydedince API'a istek yapılıyor ve ilan veri tabanına taslak olarak ekleniyor. <br>
Queue'dan message consume eden workerlarımız var. Burada sleep 3 minutes gerçekleşiyor. <br>
Bu işlem tamamlandıktan sonra DB'deki ilan bilgisi worker tarafından güncelleniyor. <br>
2.akış düz API isteği ile veri tabanından okuma isteği.

Project : 

* Spring Boot
* RabbitMQ
* Lombok
* Data JPA
* PostgreSQL
* PostMan


<hr>

## Week-4 
## Kullanılan Teknolojiler 

 <a href="https://dev.java/" rel="nofollow"> <img src="https://camo.githubusercontent.com/4516a1dca56d6cc15e4102e39acf0c139cc69f220d05b9136af0dfece96a3dfd/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f74722f322f32652f4a6176615f4c6f676f2e737667" alt="nodejs" width="40" height="40" data-canonical-src="https://upload.wikimedia.org/wikipedia/tr/2/2e/Java_Logo.svg" style="max-width: 100%;"> </a> <a href="https://spring.io/" rel="nofollow"> <img src="https://camo.githubusercontent.com/4545b55c7771bbd175235c80b518dcbbf2f6ee0b984a51ad9363cba8cb70e67c/68747470733a2f2f7777772e766563746f726c6f676f2e7a6f6e652f6c6f676f732f737072696e67696f2f737072696e67696f2d69636f6e2e737667" alt="spring" width="40" height="40" data-canonical-src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" style="max-width: 100%;"> </a> <a href="https://www.postgresql.org" rel="nofollow"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="postgresql" width="40" height="40" style="max-width: 100%;"> </a> <a href="https://postman.com" rel="nofollow"> <img src="https://camo.githubusercontent.com/93b32389bf746009ca2370de7fe06c3b5146f4c99d99df65994f9ced0ba41685/68747470733a2f2f7777772e766563746f726c6f676f2e7a6f6e652f6c6f676f732f676574706f73746d616e2f676574706f73746d616e2d69636f6e2e737667" alt="postman" width="40" height="40" data-canonical-src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" style="max-width: 100%;"> </a>



* Spring Boot
* Postman
* Rabbitmq
* PostgreSQL
* Docker
* https://www.mockaroo.com/


Konu : 

1- PostgreSQL DB Baglantısı

2- Create user ve create advertisement servisi yazilacak

3- Servislerde veri olusturmak icin 50ser tane queue mesaji olusturulacak

4- Queue”dan mesajlar consume edilip 1dk bekledikten sonra random veriler olusturulup veritabaninda kayitlar olusturulacak.

        -User kayitlarini random isim soyisimle olustur

                “Ahmet”, “Mehmet” gibi iki liste yapip birinden isim birinden soyisim sec

                isim.soyisim@mail.com diye mailini olustur.

Advertisement olusturmak icin once veritabanindan random user id sec (bunu vt sorgusuyla direkt idyi alacak sekilde yapabilirsiniz)
Title alanini iki liste icinden random olustur
1.liste “satilik” “kiralik” “temiz” “doktordan” “ihtiyactan” gibi kelimeler icersin
2.liste “ev” “araba” “villa” “arsa” gibi degerler icersin
Description alani cumlelerin bulundugu bir listeden iki uc cumle secilerek olusturulabilir.
“Ihtiyactan satilik”
“Asansorlu”
“Kombili”
“fiber altyapisi var”
“Guven emlak”
“aktas emlak”
“Kalite guven bizim isimiz” gibi cumleler olabilir. :D
Created_at alani veritabaninda olusturulacak kayit atildigi anda.

1- Ilan Filtreleme icin servis

Tarihe gore
Title veya descriptionda gecen kelimeye gore
Fiyat araligina gore
(Bunlar parametre olarak aliinip hangisi doluysa ona gore sorgu olusturulabilir.
Ayri ayri servis halinde de yazabilirsiniz.Kendi seviyenize gore kendiniz secebilirsiniz )

2- Her userin sadece son ilanini secip, iclerinden son 10 tanesini getiren servis

<hr>

## Week-5

* Projeye Basic Auth Ekleme <br>
* Ouath ve Ouath2 Araştırması

## Kullanılan Teknolojiler 

 <a href="https://dev.java/" rel="nofollow"> <img src="https://camo.githubusercontent.com/4516a1dca56d6cc15e4102e39acf0c139cc69f220d05b9136af0dfece96a3dfd/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f74722f322f32652f4a6176615f4c6f676f2e737667" alt="nodejs" width="40" height="40" data-canonical-src="https://upload.wikimedia.org/wikipedia/tr/2/2e/Java_Logo.svg" style="max-width: 100%;"> </a> <a href="https://spring.io/" rel="nofollow"> <img src="https://camo.githubusercontent.com/4545b55c7771bbd175235c80b518dcbbf2f6ee0b984a51ad9363cba8cb70e67c/68747470733a2f2f7777772e766563746f726c6f676f2e7a6f6e652f6c6f676f732f737072696e67696f2f737072696e67696f2d69636f6e2e737667" alt="spring" width="40" height="40" data-canonical-src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" style="max-width: 100%;"> </a> <a href="https://www.postgresql.org" rel="nofollow"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="postgresql" width="40" height="40" style="max-width: 100%;"> </a> <a href="https://postman.com" rel="nofollow"> <img src="https://camo.githubusercontent.com/93b32389bf746009ca2370de7fe06c3b5146f4c99d99df65994f9ced0ba41685/68747470733a2f2f7777772e766563746f726c6f676f2e7a6f6e652f6c6f676f732f676574706f73746d616e2f676574706f73746d616e2d69636f6e2e737667" alt="postman" width="40" height="40" data-canonical-src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" style="max-width: 100%;"> </a>



* Spring Boot
* Spring Security
* Postman
* Rabbitmq
* PostgreSQL
* Docker
* https://www.mockaroo.com/
