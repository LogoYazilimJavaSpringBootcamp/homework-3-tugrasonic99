# ActiveMQ, Kafka ve RabbitMQ karşılaştırın. Örnek kodlar ile nasıl çalıştığını anlatın. (10 Puan)
* ActiveMQ: Bir proje adına server ve client ilişkisi içeriğinde mesajlaşmadaki aracı olarak(Message Broker) görev alır. Ana amacı asenkron bir tarza bu iki taraf arasında bir link olmaktır. Birden fazla tip mesajı karşı tarafa yöneltmek konusuna ağırlık basar. Büyük projeler için idealdir ve proje büyüklüğü ile büyütülebilir(scalability). Bunu da birden fazla ActiveMQ aracısının birlikte çalışmasıyla başarır. Kontrolü adına kullanılabilecek bir merkez uygulaması vardır(Web Console).
* RabbitMQ: ActiveMQ gibi server ve client arasında aracı rolü oynar. ActiveMQ aksine daha küçük mesajlaşma birimleri için kullanılır. ActiveMQ aksine daha küçük mesajları taşıdığından daha hızlıdır. Kontrolü amacıyla yardımcı uygulama kullanılır.
* Kafka: Projenin kullandığı datayı akış halinde işlemesini sağlar. Büyük çaplı projelerde gerçek zamanlı datanın tekrar tekrar uygulamalar içerisinde iletilip işlenmesi halindedir. ActiveMQ ve RabbitMQ'dan en büyük farkı bir mesajlaşma şekli olmak yerine data kullanarak iletişime geçmesidir. ActiveMQ ve RabbitMQ protokollerine bağlı olarak iletişim kurarken, Kafka'nın böyle bir sınırlaması yoktur.

# Microservis ve monolith mimariyi karşılaştırın.(10 Puan)


# SOAP - RESTful karşılaştırın (10 Puan)
* SOAP: Farklı dilde veya platformlarda yazılan uygulamaların birbirleriyle data ve bilgi alışverişi yapabilmesini sağlayan bir protokoldür. XML servislerinden yararlanır. Yapacağı işleri XML'ler halinde uygulamalara iletir. Bu haliyle bazen fazla sıkı görülebilir.
* RESTful: SOAP'ın bir protokol olmasının aksine bir uygulama mimarisidir. Yapacağı işlemleri url'ler halinde web servisi olarak çalıştırır. GET, POST, PUT ve DELETE gibi anahtarlarla kullanıcı veya sistemden ne istediğini belirtir. SOAP'ın aksine XML kullanmaz ve fonksiyon kullanımında gayet esnekdir. SOAP'a nazaran öğrenmesi daha kolaydır.
# isbasi.com üye olup sisteme 3 yeni model ekleyin ve mimariye uygun şekilde CRUD işlemleri yapan endpointleri yazın. (50 Puan)
Sınıflar:
* Safe
* Check
* Bank

Model ve servisler yazıldı

NOT: Maalesef aldığım hatalarca kodu bitiremedim. O yüzden endpointler çalışmıyor vaziyette olacak.

# CustomerServisi için gerekli tüm endpoint’leri yazın. (10 Puan)
CustomerService Sınıfı içerisinde.

# Aktif ve pasif müşterileri listeleyen endpoint için gerekli kodu yazın. (10 Puan)
CustomerService Sınıfı içerisinde.
