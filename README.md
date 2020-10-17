# Spring Boot ile Restful Api

>Bu proje Spring Boot kullanilarak, Mysql kurulumunda varsayılan olarak gelen Sakila veritabanını JSON çıktısı olarak alabilmemiz için yazılmıştır.

Database = Sakila

İçerisinde yer alan API'lar;

  - Actor 
  - Address
  - Category
  - City
  - Country
  - Customer
  - Film
  - FilmActor
  - FilmText
  - Inventory
  - Language
  - Payment
  - Rental
  - Staff
  - Store

# API İçerisinde Yer Alan İşlemler

- http://localhost:8080/api/ adresinde islemlere ait bir tablo yer almaktadir

    | Fonksiyon | link |
    | ------ | ------ |
    | getAll | [api/XYZ/][PlDb] |
    | getById | [api/XYZ/sayı][PlGh] |
    | add | [api/XYZ/add (*)][PlGd] |
    | update | [api/XYZ/update (*)][PlGd] |
    | delete | [api/XYZ/delete (*)][PlGd] |
    | UYARI | [(*) Post Request Gerektiren işlemdir][PlMe] |

# API Kullanım Örneği
    http://localhost:8080/api/actor/
adresine girildiğinde varsayılan işlem olarak getAll fonksiyonu çalışmaktadır. Bu fonksiyon ile tüm aktör listesi getirilmektedir.
    
    http://localhost:8080/api/actor/1
adresine girildiğinde ise 1 numaralı aktöre ait bilgiler getirilmektedir.

```
{
    "actor_id": 1,
    "first_name": "PENELOPE",
    "last_name": "GUINESS",
    "last_update": "2006-02-15 04:34:33"
}
```
Diğer işlemler için Post Request gönderilmesi gerekmektedir. Bunun için de Postman uygulaması kullanılabilir. Body - raw - Json olarak ayarladıktan sonra istekleri yapabilirsiniz.

NOT= Ilerleyen süreçte ilgili gif eklenecektir.

