# week-3-assignment-pelinhangisi


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
