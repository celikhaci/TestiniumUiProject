Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

GittiGidiyor Sepet Case
------------------------------------
* Kullanıcı "https://www.gittigidiyor.com/" sitesini ziyaret eder
* Ana sayfanın açıldığı kontrol edilir. Siteye login olunur.
* Kullanıcı "bigisayar" anahtar kelimesini arama kısmına yazar.
* Arama sonuclarından 2. sayfa açılır.
* Listelenen ürünler arasından rastgele ürün seçilir.
* Seçilen ürün sepete eklenir.
* Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
* Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.
* Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.
