# OAuth ve OAuth2 Nedir ?
<br>

<b>OAuth</b> (Open Authorization), geliştiriciler tarafından web, mobil veya masaüstü yazılımları meydana getirilirken, iki uygulama arasında yetkilendirilmenin sağlanması amacıyla kullanılan bir açık protokoldür. Türkçe’de kendine <b>Açık Protokol</b> veya <b>Açık Yetkilendirme</b> olarak isim bulan OAuth, hassas verilerin güvenli şekilde iki uygulama arasında transfer edilmesi amacıyla kullanılır. <br>
OAuth2 yetkilendirme işlemleri için kullanılan standartlaşmış bir protokoldür. OAuth2 versiyonu 2006 yılında ortaya çıkmış olan orijinal OAuth protokolünün yerine geçmiştir.
OAuth2 kullanarak kullanıcıdan, hesabının tamamına ya da belli bir kısmına erişmek için yetki alıp bunu kendi uygulamanızda kullanabilirsiniz. Bunun ön yaygın örnekleri Facebook, Twitter, Google hesabınız ile başka uygulamalara ya da web sitelerine giriş yapabilmenizdir.

![1_rwzu_HrZ8BSiLuL7vHq-Jg](https://user-images.githubusercontent.com/96151920/175546596-b8e207e3-05eb-4e88-a54b-317d988384f9.png)

1-Uygulama kullanıcıdan hesabının tamamına ya da bir kısmına erişebilmek için izin ister. <br>
2-Eğer kullanıcı bu isteği onaylarda uygulama bir yetki izni (authorization grant) elde eder.<br>
3-Uygulama yetkilendirme (authorization) sunucusuna kendi bilgilerini ve almış olduğu yetki iznini (authorization grant) göndererek sunucudan access token isteğinde bulunur<br>
4-Eğer uygulama bilgileri doğruysa ve yetki izni (authorization grant) geçerli ise, yetkilendirme (authorization) sunucusu uygulamaya bir access token sağlar.<br>
5-Uygulama almış olduğu access token ile birlikte içerik (resource) sunucusuna erişmek istediği içerikle ilgili istek gönderir.
6-Eğer uygulamanın göndermiş olduğu access token geçerli ise, içerik (resource) sunucusu, ilgili içeriği uygulamaya geri gönderir.

<hr>

## Bilinmesi Gereken Bazı Terimler 
<br>

## Client (Uygulama)
Client kullanıcının hesabına erişmeye çalışan uygulamadır. Hesaba erişebilmek için kullanıcıdan izin alması gerekir.

## Resource Server/API (İçerik Sunucusu)
Resource Server (İçerik Sunucusu) kullanıcının bilgilerine erişmek için kullanılan API sunucusudur.

## Authorization Server (Yetkilendirme Sunucusu)
Kullanıcının isteği onayladığı ya da reddettiği arayüzü sağlayan sunucudur. Küçük çaplı uygulamalarda bu API sunucusu ile aynı sunucu olabilir fakat büyük ölçekli uygulamalarda genellikle ayrı bir bileşen olarak oluşturulur.

## Resource Owner (Kullanıcı)
Resource owner hesabının belli kısımlarına erişmenize izin veren kullanıcıdır.

## Uygulama Kaydı
Yetkilendirme işlemi yapabilmemiz için önce uygulamamızı kayıt ettirmemiz gerekir. Yetkilendirme (authorization) sunucusu sadece önceden kayıt edilmiş uygulamalardan gelen isteklere cevap verecektir. Uygulamamızı kayıt ederken uygulama ismi, açıklaması, logosu gibi bilgileri gireriz, bunlar opsiyoneldir. Fakat her uygulamada bulunması gereken bilgiler vardır. Bunlar; Redirect (Yönlendirme) URI, Client ID ve Client Secret.

## Redirect (Yönlendirme) URIı
Yetkilendirme (authorization) sunucusu, kullanıcıyı, kullanıcının izin verme işleminden sonra yalnızca uygulamanın sistemde kayıtlı yönlendirme adresine yönlendirir.

## Client ID
Uygulama sisteme kayıt edildikten sonra, sunucunun her uygulama için özel olarak vermiş olduğu ID değeridir. Client ID yetkilendirme (authorization) sunucusunun uygulamayı tanımlayabilmesi için kullanılır. Client ID ayrıca kullanıcıdan izin almak için kullanılacak URL oluşturmak için de kullanılır.

## Client Secret
Uygulama sisteme kayıt edildikten sonra, sunucunun her uygulama için özel olarak vermiş olduğu secret değeridir. Bu secret değeri gizli tutulmalıdır.

## Yetkilendirme (Authorization)
Yukarıda da belirttiğimiz üzere OAuth 2 işleminin ilk adımı kullanıcıdan yetki almaktır. OAuth 2 ile kullanabileceğiniz birkaç izin tipi (grant type) bulunur. Bu izin tipleri aşağıda listelenmiştir

* Authorization Code: Server tabanlı çalışan uygulamalar tarafından kullanılır.
* Password: Güvenilir uygulamalar (trusted clients) tarafından kullanılır. Güvenilen uygulamalar servisin kendi uygulamalarıdır. Örneğin facebook mobil uygulaması için password izin tipini kullanır çünkü izin alacağı kullanıcı zaten kendi kullanıcısıdır ve kullanıcının bu uygulamaya şifresini girmekte bir mahsur yoktur.
* Client Credentials: Uygulama API erişimi için kullanılır.
Implicit: Eskiden client secret olmaksızın, mobil uygulamalar ve server tabanlı olmayan, tarayıcıda çalışan web uygulamaları (örneğin JavaScript ile geliştirilmiş bir web uygulaması) için kullanılırdı, fakat şimdi client secret siz Authorization Code izin tipi ile kullanılması öneriliyor. Yani Implicit izin tipinin kullanılması önerilmiyor.

<hr>


![0_6RGyD3AARm9SURqb](https://user-images.githubusercontent.com/96151920/175548456-45f69c23-5667-4377-bc7a-33dfcb3f196e.png)













### References
* [VM Aracı](https://wmaraci.com/nedir/oauth)
* [Medium Blog](https://medium.com/@furkanbegen/oauth2-basit-anlat%C4%B1m-c5f9b542a0f2)
* [FolksDev Spring Security - Http Basic Authentication](https://www.youtube.com/watch?v=Jv-h4viZmFs)
